package gestion.facture.bdd;

import java.util.ArrayList; 

import java.util.List;

import javax.annotation.PostConstruct;

import org.junit.Assert;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import cucumber.api.java.en.*;
import gestion.facture.models.FactureComdist;
import gestion.facture.repo.FactureComdistRepo;
import gestion.facture.services.FactureComdistService;

public class DeleteById {
	
	List<FactureComdist> oldFct = new ArrayList<>();
	List<FactureComdist> newFctList ;

	
	@Mock
	FactureComdistRepo fRepo;
	
	@InjectMocks
	FactureComdistService fcts;
	
	@PostConstruct
	public void init() {
		MockitoAnnotations.initMocks(this);
	}
	
	
	
	@Given("^Admin delete facture with id (\\d+)$")
	public void admin_delete_facture_with_id(Long id) throws Throwable {
		
		fcts.deleteFacture(id);
	    
	}

	@When("^Admin retrieve all factures after the delete$")
	public void admin_retrieve_all_facture_after_the_delete() throws Throwable {
		
		FactureComdist f1 = new FactureComdist(1L);
		FactureComdist f2 = new FactureComdist(2L);
		FactureComdist f3 = new FactureComdist(3L);

		oldFct.add(f1);
		oldFct.add(f2);
		oldFct.add(f3);
		
		 this.initMocks(oldFct);
		  newFctList=fcts.findAllFactureComdist();

	   
	}

	@Then("^The size of oldList must be more than new list$")
	public void the_size_of_oldList_must_be_more_than_new_list() throws Throwable {
		Assert.assertTrue(oldFct.size()>newFctList.size());

	}
	
	
	public void initMocks(List<FactureComdist> list) {
		List<FactureComdist> newList= new ArrayList<>();
		for(FactureComdist u: list) {
			newList.add(u);
		}
		newList.remove(1);

		Mockito.when(fcts.findAllFactureComdist()).thenReturn(newList);


}
}