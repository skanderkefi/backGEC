package gestion.fournisseur.controller;

import java.sql.Date;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import javax.print.attribute.standard.DateTimeAtCompleted;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import gestion.fournisseur.model.Fournisseur;
import gestion.fournisseur.repo.FournisseurRepo;
import gestion.fournisseur.service.FournisseurService;

@RestController
@RequestMapping("/Fournisseur")
public class FindFournisseursController {
	
	@Autowired
	FournisseurService service;
	
	@Autowired
	FournisseurRepo repo;
	
	
	@CrossOrigin
	@GetMapping("/showall")
	public List<Fournisseur> getAllFournisseur() {
		return service.findAllFournisseurs();
	}
	
	@CrossOrigin
	@GetMapping("/getbypo/{po}")
	public Fournisseur getFournisseurByPo(@PathVariable Long po) {
		
		 return repo.findByNumPo(po);
	}
	
	@CrossOrigin
	@DeleteMapping("/deletebyid/{id}")
	public String deleteFournisseur(@PathVariable Long id) {
		 service.deleteFournisseur(id);
		 System.out.println("============================="+id+"==========================");
		 return "from back!";
	}
	
	@CrossOrigin
	@PutMapping("/Update")
	public String getFournisseurByMatricule(@Valid @RequestBody Fournisseur newFournisseur) {
		
		newFournisseur.setUpdatedAt(new Timestamp(System.currentTimeMillis()));
		service.updateFournisseurById(newFournisseur);
		System.out.println("=========editing===========");
		return "updated";
		
	} 
	
	@CrossOrigin
	@PostMapping("/create")
	public String createFournisseur(@Valid @RequestBody Fournisseur fournisseur) {
		service.createFournisseur(fournisseur);
		System.out.println("=========creating===========");
		return "created !";
		
	}
	
	

}
