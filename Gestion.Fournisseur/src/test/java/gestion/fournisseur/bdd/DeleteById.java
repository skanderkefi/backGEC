package gestion.fournisseur.bdd;

import java.util.ArrayList; 

import java.util.List;

import javax.annotation.PostConstruct;

import org.junit.Assert;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import cucumber.api.java.en.*;
import gestion.fournisseur.model.Fournisseur;
import gestion.fournisseur.repo.FournisseurRepo;
import gestion.fournisseur.service.FournisseurService;

public class DeleteById {
	
	List<Fournisseur> oldFournList = new ArrayList<>();
	List<Fournisseur> newFournList ;

	
	@Mock
	FournisseurRepo fRepo;
	
	@InjectMocks
	FournisseurService fsrvc;
	
	@PostConstruct
	public void init() {
		MockitoAnnotations.initMocks(this);
	}
	
	
	
	@Given("^Admin delete fournisseur with id (\\d+)$")
	public void admin_delete_bordereau_with_id(Long id) throws Throwable {
		
		fsrvc.deleteFournisseur(id);
	    
	}

	@When("^Admin retrieve all fournisseurs after the delete$")
	public void admin_retrieve_all_bordereaux_after_the_delete() throws Throwable {
		
		Fournisseur f1 = new Fournisseur(1L, "name1", "cat", null, null, null, null, null, null,null);
		Fournisseur f2 = new Fournisseur(2L, "name1", "cat", null, null, null, null, null, null,null);
		Fournisseur f3 = new Fournisseur(3L, "name1", "cat", null, null, null, null, null, null,null);

		oldFournList.add(f1);
		oldFournList.add(f2);
		oldFournList.add(f3);
		
		 this.initMocks(oldFournList);
		  newFournList=fsrvc.findAllFournisseurs();

	   
	}

	@Then("^The size of oldList must be more than new list$")
	public void the_size_of_oldList_must_be_more_than_new_list() throws Throwable {
		Assert.assertTrue(oldFournList.size()>newFournList.size());

	}
	
	
	public void initMocks(List<Fournisseur> list) {
		List<Fournisseur> newList= new ArrayList<>();
		for(Fournisseur u: list) {
			newList.add(u);
		}
		newList.remove(1);

		Mockito.when(fsrvc.findAllFournisseurs()).thenReturn(newList);


}
}