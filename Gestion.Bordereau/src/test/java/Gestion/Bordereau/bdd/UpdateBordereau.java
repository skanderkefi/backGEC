package Gestion.Bordereau.bdd;

import javax.annotation.PostConstruct; 

import org.junit.Assert;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;


import Gestion.Bordereau.model.Bordereau;
import Gestion.Bordereau.repo.BordereauRepo;
import Gestion.Bordereau.services.BordereauService3wmTnd;
import cucumber.api.java.en.*;

public class UpdateBordereau {
	
Bordereau oldb,newb,newb2;
	
	
	@Mock
	BordereauRepo bRepo;
	
	@InjectMocks
	BordereauService3wmTnd b3wms;
	
	@PostConstruct
	public void init() {
		MockitoAnnotations.initMocks(this);
	}
	
	
	
	@Given("^Admin retrieve bordereau with ref \"([^\"]*)\" ,old status \"([^\"]*)\" and new status \"([^\"]*)\"$")
	public void admin_retrieve_bordereau_with_id_old_status_and_new_status(String ref, String olds, String news) throws Throwable {
		 this.initMocks(ref, olds, news);
		   oldb = bRepo.findByReference(ref);
	}

	@When("^Admin update bordereau with ref \"([^\"]*)\" at his status \"([^\"]*)\" with the new status \"([^\"]*)\"$")
	public void admin_update_bordereau_with_id_at_his_status_with_the_new_status(String ref, String olds, String news) throws Throwable {
		 this.initMocks(ref, olds, news);
		   newb2 = bRepo.save(newb);
	}

	@Then("^assert that bordereau has new status \"([^\"]*)\"$")
	public void assert_that_bordereau_has_new_status(String news) throws Throwable {
		   Assert.assertTrue(newb2.getStatus().equals(news));
	}
	
	public void initMocks(String ref, String status, String newStatus) {
		Bordereau oldbord = new Bordereau(1L, null, null, status, null, null, null, null, null, null, null,null);
		Mockito.when(bRepo.findByReference(ref)).thenReturn(oldbord);
		Mockito.when(bRepo.save(newb)).thenReturn(new Bordereau(1L, null, null, newStatus, null, null, null, null, null, null, null,null));

	}

}
