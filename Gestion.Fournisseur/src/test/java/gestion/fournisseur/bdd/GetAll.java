package gestion.fournisseur.bdd;

import static org.junit.Assert.assertNotNull; 

import java.util.ArrayList;
import java.util.List;

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
public class GetAll {
	
	Fournisseur fourn;
	List<Fournisseur> foundList;
		
		@Mock
		FournisseurRepo fRepo;
		
		@InjectMocks
		FournisseurService fsrvc;
		 
		@PostConstruct
		public void init()
		{
			 MockitoAnnotations.initMocks(this);
		}
	
	
	@Given("^list of Fournisseurs in db is \"([^\"]*)\"$")
	public void list_of_fournisseurs_in_db_is(String empty) throws Throwable {
	   
		this.initMocks(empty);
		foundList=new ArrayList<>();
	}

	@When("^Admin retrieve all Fournisseurs from database$")
	public void admin_retrieve_all_fournisseurs_from_database() throws Throwable {
		List<Fournisseur> l = fRepo.findAll();

	}

	@Then("^list retrieved should be \"([^\"]*)\"$")
	public void list_retrieved_should_be(String empty) throws Throwable {
	    
		if (empty.equals("empty")) {
			  Assert.assertTrue(foundList.isEmpty());}
				else if (empty.equals("notEmpty")) {
					assertNotNull(foundList);
				}
	}
	
	
	private void initMocks(String exist)
	{
		Fournisseur f = new Fournisseur(1L, null, null, null, null, null, null, null, null,null);
		List<Fournisseur> l= new ArrayList<>();
		l.add(f);
			if(exist.equals("empty")) {
				Mockito.when(fRepo.findAll()).thenReturn(l);	
			}else if(exist.equals("notEmpty")) {
				Mockito.when(fRepo.findAll()).thenReturn(null);	
			}
		
	}

}
