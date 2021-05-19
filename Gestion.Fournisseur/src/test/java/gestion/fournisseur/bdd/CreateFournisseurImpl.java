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
public class CreateFournisseurImpl {
	
	Fournisseur fournisseur;
	Fournisseur found;

		
		@Mock
		FournisseurRepo fournisseurRepo;
		
		@InjectMocks
		FournisseurService fournservice;
		 
		@PostConstruct
		public void init()
		{
			 MockitoAnnotations.initMocks(this);

		}
		

	     
	@Given("^fournisseur with (\\d+) \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"  \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"")
	public void fournisseur_with(int id, String name, String categorie, Long idf, String nat, String adresse, String crby, String exist) throws Throwable {
		 Long iderp = Long.valueOf(id);
	  fournisseur = new Fournisseur(iderp, name, categorie, null, adresse, nat, crby, null, null,idf);
	  this.initMocks(exist);
		found=fournisseurRepo.findByNumPo(idf);;
	}

	@When("^Admin add this fournisseur to list$")
	public void admin_add_this_fournisseur_to_list() throws Throwable {
fournservice.createFournisseur(fournisseur);	  
	}

	@Then("^The result should be \"([^\"]*)\"$")
	public void the_result_should_be(String result) throws Throwable {
		
		if (result.equals("yes")) {
			Assert.assertNull(found);
		}else if (result.equals("no")){
			Assert.assertNotNull(found);

		}
	   
	}
	
	
	private void initMocks(String exist)
	{
			if(exist.equals("no")) {
			Mockito.when(fournisseurRepo.findByNumPo(Mockito.anyLong())).thenReturn(null);	
			}else if(exist.equals("yes")) {
				Mockito.when(fournisseurRepo.findByNumPo(Mockito.anyLong())).thenReturn(new Fournisseur());	
			}
		
	}


}
