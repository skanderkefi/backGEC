package gestion.fournisseur.bdd;

import javax.annotation.PostConstruct;

import org.junit.Assert;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import cucumber.api.java.en.*;
import gestion.fournisseur.Application;
import gestion.fournisseur.model.Fournisseur;
import gestion.fournisseur.repo.FournisseurRepo;
import gestion.fournisseur.service.FournisseurService;

@SpringBootTest(classes=Application.class,
webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ContextConfiguration
public class GetByIdf {
	
	Fournisseur fournToRetrieve;
	Fournisseur mockedFourn;

	@Mock
	FournisseurRepo fournRepo;
	
	@InjectMocks
	FournisseurService fournService;
	 
	@PostConstruct
	public void init()
	{
		 MockitoAnnotations.initMocks(this);
	}
	
	
	
	@Given("^fournisseur with idfiscale \"([^\"]*)\" \"([^\"]*)\"$")
	public void fournisseur_with_idfiscale(Long idf, String exist) throws Throwable {
		  this.initMocks(idf, exist);
		  mockedFourn=fournRepo.findByNumPo(idf);
	}

	@When("^Admin get this fournisseur with \"([^\"]*)\"$")
	public void admin_get_this_fournisseur_with(Long idf) throws Throwable {
		   fournToRetrieve = fournRepo.findByNumPo(idf);

	}

	@Then("^The fournisseur retrieved should be \"([^\"]*)\"$")
	public void the_bordereau_retrieved_should_be(String nul) throws Throwable {
		 if(nul.equals("yes")) {
			   	Assert.assertNull(mockedFourn);
		   }else if(nul.equals("no")) {
			   Assert.assertNotNull(mockedFourn);
		   }
	}
	
	
	private void initMocks(Long idf, String exist)
	{
		
			if(exist.equals("yes")) {
				Mockito.when(fournRepo.findByNumPo(idf)).thenReturn(new Fournisseur());	
			}else if(exist.equals("no")) {
				Mockito.when(fournRepo.findByNumPo(idf)).thenReturn(null);	
			}
		
	}

}
