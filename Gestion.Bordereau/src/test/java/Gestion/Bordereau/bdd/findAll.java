package Gestion.Bordereau.bdd;

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


import Gestion.Bordereau.Application;
import Gestion.Bordereau.model.Bordereau;
import Gestion.Bordereau.repo.BordereauRepo;
import Gestion.Bordereau.services.BordereauService3wmTnd;
import cucumber.api.java.en.*;
 
@SpringBootTest(classes=Application.class,
webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ContextConfiguration
public class findAll {
	
	Bordereau bord;
	List<Bordereau> foundList;
		
		@Mock
		BordereauRepo bRepo;
		
		@InjectMocks
		BordereauService3wmTnd b3wms;
		 
		@PostConstruct
		public void init()
		{
			 MockitoAnnotations.initMocks(this);
		}
	
	
	@Given("^list of bordereaux in db is \"([^\"]*)\"$")
	public void list_of_bordereaux_in_db_is(String empty) throws Throwable {
	   
		this.initMocks(empty);
		foundList=new ArrayList<>();
	}

	@When("^Admin retrieve all bordereaux from database$")
	public void admin_retrieve_all_bordereaux_from_database() throws Throwable {
		List<Bordereau> l = bRepo.findAll();

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
//		Bordereau u = new Bordereau(2L, "reference", "3WM-TND", "status", null, null, null, null, null, null);
		List<Bordereau> l= new ArrayList<>();
//		l.add(u);
			if(exist.equals("empty")) {
				Mockito.when(bRepo.findAll()).thenReturn(l);	
			}else if(exist.equals("notEmpty")) {
				Mockito.when(bRepo.findAll()).thenReturn(null);	
			}
		
	}

}
