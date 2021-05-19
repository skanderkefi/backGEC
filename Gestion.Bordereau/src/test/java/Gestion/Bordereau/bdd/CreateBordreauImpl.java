package Gestion.Bordereau.bdd;

import java.sql.Timestamp;

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
public class CreateBordreauImpl {
	
	Bordereau bordereau;
	Bordereau found;

		
		@Mock
		BordereauRepo bordereauRepo;
		
		@InjectMocks
		BordereauService3wmTnd bordereauService3wmTnd;
		 
		@PostConstruct
		public void init()
		{
			 MockitoAnnotations.initMocks(this);

		}
		

	@Given("^Bordereau with (\\d+) \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void bordereau_with(int arg1, String ref, String stu, String nat, String fol, String sentby, String crby, String exist) throws Throwable {
		 Long id = Long.valueOf(arg1);
	  bordereau = new Bordereau(id, ref, nat, stu, fol, null, sentby, null, null, "",null,null);
	 	
	  this.initMocks(exist);
		found=bordereauRepo.findByReference(bordereau.getReference());
	}

	@When("^Admin add this user to list$")
	public void admin_add_this_user_to_list() throws Throwable {
		bordereauService3wmTnd.createBordereau(bordereau);
	  
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
			Mockito.when(bordereauRepo.findById(Mockito.anyLong())).thenReturn(null);	
			}else if(exist.equals("yes")) {
				Mockito.when(bordereauRepo.findByReference(Mockito.anyString())).thenReturn(new Bordereau());	
			}
		
	}


}
