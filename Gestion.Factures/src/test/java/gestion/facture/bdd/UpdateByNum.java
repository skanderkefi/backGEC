package gestion.facture.bdd;

import java.sql.Date;
import java.sql.Timestamp;

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

public class UpdateByNum {
	
FactureComdist oldf,newf,newf2;
	
	
	@Mock
	FactureComdistRepo fRepo;
	
	@InjectMocks
	FactureComdistService fsrvc;
	
	@PostConstruct
	public void init() {
		MockitoAnnotations.initMocks(this);
	}
	
	
	
	@Given("^Admin retrieve facture with numFacture \"([^\"]*)\" ,old dossier \"([^\"]*)\" and new dossier \"([^\"]*)\"$")
	public void admin_retrieve_facture_with_old_dossier_and_new_dossier(String num, String oldds, String newds) throws Throwable {
		 this.initMocks(num, oldds, newds);
		   oldf = fRepo.findByNumFacture(num);
	}

	@When("^Admin update facture with numFacture \"([^\"]*)\" at his olddossier \"([^\"]*)\" with the newdossier \"([^\"]*)\"$")
	public void admin_update_fournisseur_with_id_at_his_name_with_the_new_name(String idf, String oldn, String newn) throws Throwable {
		 this.initMocks(idf, oldn, newn);
		   newf2 = fRepo.save(newf);
	}

	@Then("^assert that facture has newdossier \"([^\"]*)\"$")
	public void assert_that_fournisseur_has_new_status(String newd) throws Throwable {
		   Assert.assertTrue(newf2.getDossier().equals(newd));
	}
	
	
	public void initMocks(String num, String oldD, String newD) {
		FactureComdist f1 = new FactureComdist(1L,null, 1, "", 1D, "", "", "", "","", null, "", oldD, 1, "", null, "", null, null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null);
		Mockito.when(fRepo.findByNumFacture(num)).thenReturn(f1);
		Mockito.when(fRepo.save(newf)).thenReturn(new FactureComdist(1L,null, 1, "", 1D, "", "", "", "","", null, "", newD, 1, "", null, "", null, null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null));

	}

}
