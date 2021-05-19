package gestion.facture.bdd;

import javax.annotation.PostConstruct;

import org.junit.Assert;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import cucumber.api.java.en.*;
import gestion.facture.Application;
import gestion.facture.models.Facture;
import gestion.facture.models.FactureComdist;
import gestion.facture.repo.FactureComdistRepo;
import gestion.facture.services.FactureComdistService;

@SpringBootTest(classes=Application.class,
webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ContextConfiguration
public class GetByNumFacture {
	
	FactureComdist factureToRetrieve;
	FactureComdist mockedFacture;

	@Mock
	FactureComdistRepo fctRepo;
	
	@InjectMocks
	FactureComdistService fctService;
	 
	@PostConstruct
	public void init()
	{
		 MockitoAnnotations.initMocks(this);
	}
	
	
	
	@Given("^facture with numFacture \"([^\"]*)\" \"([^\"]*)\"$")
	public void facture_with_num(String num, String exist) throws Throwable {
		  this.initMocks(num, exist);
		  mockedFacture=fctRepo.findByNumFacture(num);
	}

	@When("^Admin get this facture with \"([^\"]*)\"$")
	public void admin_get_this_facture_with(String num) throws Throwable {
		   factureToRetrieve = fctRepo.findByNumFacture(num);

	}

	@Then("^The facture retrieved should be \"([^\"]*)\"$")
	public void the_facture_retrieved_should_be(String nul) throws Throwable {
		 if(nul.equals("yes")) {
			   	Assert.assertNull(mockedFacture);
		   }else if(nul.equals("no")) {
			   Assert.assertNotNull(mockedFacture);
		   }
	}
	
	
	private void initMocks(String num, String exist)
	{
		
			if(exist.equals("yes")) {
				Mockito.when(fctRepo.findByNumFacture(num)).thenReturn(new FactureComdist());	
			}else if(exist.equals("no")) {
				Mockito.when(fctRepo.findByNumFacture(num)).thenReturn(null);	
			}
		
	}

}
