package gestion.fournisseur.bdd;

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

public class UpdateById {
	
Fournisseur oldf,newf,newf2;
	
	
	@Mock
	FournisseurRepo fRepo;
	
	@InjectMocks
	FournisseurService fsrvc;
	
	@PostConstruct
	public void init() {
		MockitoAnnotations.initMocks(this);
	}
	
	
	
	@Given("^Admin retrieve fournisseur with idfiscale \"([^\"]*)\" ,old name \"([^\"]*)\" and new name \"([^\"]*)\"$")
	public void admin_retrieve_fournisseur_with_id_old_name_and_new_name(Long idf, String oldn, String newn) throws Throwable {
		 this.initMocks(idf, oldn, newn);
		   oldf = fRepo.findByNumPo(idf);
	}

	@When("^Admin update fournisseur with idfiscale \"([^\"]*)\" at his name \"([^\"]*)\" with the new name \"([^\"]*)\"$")
	public void admin_update_fournisseur_with_id_at_his_name_with_the_new_name(Long idf, String oldn, String newn) throws Throwable {
		 this.initMocks(idf, oldn, newn);
		   newf2 = fRepo.save(newf);
	}

	@Then("^assert that fournisseur has new name \"([^\"]*)\"$")
	public void assert_that_fournisseur_has_new_status(String newn) throws Throwable {
		   Assert.assertTrue(newf2.getIdFiscale().equals(newn));
	}
	
	public void initMocks(Long idf, String oldName, String newName) {
		Fournisseur f1 = new Fournisseur(1L, null, null, "samsoung", null, null, null, null, null,null);
		Mockito.when(fRepo.findByNumPo(idf)).thenReturn(f1);
		Mockito.when(fRepo.save(newf)).thenReturn(new Fournisseur(1L, null, null, "samsung", null, null, null, null, null,null));

	}

}
