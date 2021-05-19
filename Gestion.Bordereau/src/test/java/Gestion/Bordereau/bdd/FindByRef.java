package Gestion.Bordereau.bdd;

import javax.annotation.PostConstruct;

import org.junit.Assert;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import Gestion.Bordereau.Application;
import Gestion.Bordereau.model.Bordereau;
import Gestion.Bordereau.repo.BordereauRepo;
import Gestion.Bordereau.services.BordereauService3wmTnd;
import cucumber.api.java.en.*;

@SpringBootTest(classes=Application.class,
webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ContextConfiguration
public class FindByRef {
	
	Bordereau bordToRetrieve;
	Bordereau mockedBord;

	@Mock
	BordereauRepo bordRepo;
	
	@InjectMocks
	BordereauService3wmTnd bordService;
	 
	@PostConstruct
	public void init()
	{
		 MockitoAnnotations.initMocks(this);
	}
	
	
	
	@Given("^Bordereau with reference \"([^\"]*)\" \"([^\"]*)\"$")
	public void bordereau_with_reference(String ref, String exist) throws Throwable {
		  this.initMocks(ref, exist);
		  mockedBord=bordRepo.findByReference(ref);
	}

	@When("^Admin get this bordereau with \"([^\"]*)\"$")
	public void admin_get_this_bordereau_with(String ref) throws Throwable {
		   bordToRetrieve = bordRepo.findByReference(ref);

	}

	@Then("^The bordereau retrieved should be \"([^\"]*)\"$")
	public void the_bordereau_retrieved_should_be(String nul) throws Throwable {
		 if(nul.equals("yes")) {
			   	Assert.assertNull(mockedBord);
		   }else if(nul.equals("no")) {
			   Assert.assertNotNull(mockedBord);
		   }
	}
	
	
	private void initMocks(String ref, String exist)
	{
		
			if(exist.equals("yes")) {
				Mockito.when(bordRepo.findByReference(ref)).thenReturn(new Bordereau());	
			}else if(exist.equals("no")) {
				Mockito.when(bordRepo.findByReference(ref)).thenReturn(null);	
			}
		
	}

}
