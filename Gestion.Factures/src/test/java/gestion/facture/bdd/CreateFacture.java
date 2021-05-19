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
import gestion.facture.models.FactureComdist;
import gestion.facture.repo.FactureComdistRepo;
import gestion.facture.services.FactureComdistService;

@SpringBootTest(classes=Application.class,
webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ContextConfiguration
public class CreateFacture {
	
	FactureComdist facture;
	FactureComdist found;

		
		@Mock
		FactureComdistRepo factureRepo;
		
		@InjectMocks
		FactureComdistService factservice;
		 
		@PostConstruct
		public void init()
		{
			 MockitoAnnotations.initMocks(this);

		}
		

	     
	@Given("^facture with (\\d+) (\\d+) \"([^\"]*)\" \"([^\"]*)\"$")
	public void facture_with(Long id, int bord, String numf, String exist) throws Throwable {
		FactureComdist f1 = new FactureComdist(1L,null, bord, "", 1D, "", "", "", "","", null, "", null, 1, "", numf, "", null, null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
				null,null);
	  this.initMocks(exist);
		found=factureRepo.findByNumFacture(numf);
	}

	@When("^Admin add this facture to list$")
	public void admin_add_this_facture_to_list() throws Throwable {
factservice.createFacture(facture);	  
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
			Mockito.when(factureRepo.findByNumFacture(Mockito.anyString())).thenReturn(null);	
			}else if(exist.equals("yes")) {
				Mockito.when(factureRepo.findByNumFacture(Mockito.anyString())).thenReturn(new FactureComdist());	
			}
		
	}


}
