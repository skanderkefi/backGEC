package Gestion.Bordereau.bdd;

import java.util.ArrayList; 
import java.util.List;

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

public class DeleteBordreauById {
	
	List<Bordereau> oldBordList = new ArrayList<>();
	List<Bordereau> newBordList ;

	
	@Mock
	BordereauRepo bRepo;
	
	@InjectMocks
	BordereauService3wmTnd b3wms;
	
	@PostConstruct
	public void init() {
		MockitoAnnotations.initMocks(this);
	}
	
	
	
	@Given("^Admin delete bordereau with id (\\d+)$")
	public void admin_delete_bordereau_with_id(Long id) throws Throwable {
		
		b3wms.deleteBordereau(id);
	    
	}

	@When("^Admin retrieve all bordereaux after the delete$")
	public void admin_retrieve_all_bordereaux_after_the_delete() throws Throwable {
		
		Bordereau b1 = new Bordereau(1L, null, "3WM-TND", null, null, null, null, null, null, "",null,null);
		Bordereau b2 = new Bordereau(2L, null, "3WM-TND", null, null, null, null, null, null, "",null,null);
		Bordereau b3 = new Bordereau(3L, null, "3WM-TND", null, null, null, null, null, null, "",null,null);

		oldBordList.add(b1);
		oldBordList.add(b2);
		oldBordList.add(b3);
		
		 this.initMocks(oldBordList);
		  newBordList=b3wms.findAllBordereau3wm();

	   
	}

	@Then("^The size of oldList must be more than new list$")
	public void the_size_of_oldList_must_be_more_than_new_list() throws Throwable {
		Assert.assertTrue(oldBordList.size()>newBordList.size());

	}
	
	
	public void initMocks(List<Bordereau> list) {
		List<Bordereau> newList= new ArrayList<>();
		for(Bordereau u: list) {
			newList.add(u);
		}
		newList.remove(1);

		Mockito.when(b3wms.findAllBordereau3wm()).thenReturn(newList);


}
}