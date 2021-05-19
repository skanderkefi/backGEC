package gestion.facture.bdd;

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
import gestion.facture.Application;
import gestion.facture.models.FactureComdist;
import gestion.facture.repo.FactureComdistRepo;
import gestion.facture.services.FactureComdistService;
 
@SpringBootTest(classes=Application.class,
webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ContextConfiguration
public class GetAll {
	
	FactureComdist fctc;
	List<FactureComdist> foundList;
		
		@Mock
		FactureComdistRepo fRepo;
		
		@InjectMocks
		FactureComdistService fsrvc;
		 
		@PostConstruct
		public void init()
		{
			 MockitoAnnotations.initMocks(this);
		}
	
	
	@Given("^list of factures in db is \"([^\"]*)\"$")
	public void list_of_fournisseurs_in_db_is(String empty) throws Throwable {
	   
		this.initMocks(empty);
		foundList=new ArrayList<>();
	}

	@When("^Admin retrieve all factures from database$")
	public void admin_retrieve_all_factures_from_database() throws Throwable {
		List<FactureComdist> l = fRepo.findAll();

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
		FactureComdist f = new FactureComdist(1L);
		List<FactureComdist> l= new ArrayList<>();
		l.add(f);
			if(exist.equals("empty")) {
				Mockito.when(fRepo.findAll()).thenReturn(l);	
			}else if(exist.equals("notEmpty")) {
				Mockito.when(fRepo.findAll()).thenReturn(null);	
			}
		
	}

}
