package gestion.facture.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import gestion.facture.models.Facture3wm;
import gestion.facture.models.FactureComdist;
import gestion.facture.models.FactureFdRemb;
import gestion.facture.models.FactureFinancement;
import gestion.facture.models.FactureFiscalité;
import gestion.facture.models.FactureLettreCredit;
import gestion.facture.models.FactureOperateur;
import gestion.facture.services.Facture3mwService;
import gestion.facture.services.FactureComdistService;
import gestion.facture.services.FactureFdRembService;
import gestion.facture.services.FactureFinService;
import gestion.facture.services.FactureFiscService;
import gestion.facture.services.FactureLtrService;
import gestion.facture.services.FactureOpService;
import gestion.facture.services.FondRoulementService;

@RestController
@RequestMapping("/DeleteFactures")
public class DeleteFactureController {
	
	@Autowired
	Facture3mwService facture3wmService;
	
	@Autowired
	FactureFdRembService factureFdRempService;
	
	@Autowired
	FactureFinService factureFinService;
	
	@Autowired
	FactureFiscService factureFiscService;
	
	@Autowired
	FactureLtrService factureltrService;
	
	@Autowired
	FactureOpService factureOp;
	
	@Autowired
	FactureComdistService factureComdist;
	
	@Autowired
	FondRoulementService fdservice;
	
	
	@CrossOrigin
	@DeleteMapping("/fd/{id}")
	public String deleteFactureFd(@PathVariable Long id) {
		fdservice.deleteFacture(id);
		 return "deleted!";
	}
	
	
	@CrossOrigin
	@DeleteMapping("/3wm/{id}")
	public String deleteFacture3wm(@PathVariable Long id) {
		 facture3wmService.deleteFacture(id);
		 return "deleted!";
	}
	
	@CrossOrigin
	@DeleteMapping("/fdremp/{id}")
	public String deleteFactureFdRemp(@PathVariable Long id) {
		 factureFdRempService.deleteFacture(id);
		 return "deleted !";
	}
	
	@CrossOrigin
	@DeleteMapping("/fctfin/{id}")
	public String deleteFactureFin(@PathVariable Long id) {
		 factureFinService.deleteFacture(id);
		 return "deleted!";
	}
	
	@CrossOrigin
	@DeleteMapping("/fctfisc/{id}")
	public String deleteFactureFisc(@PathVariable Long id) {
		 factureFiscService.deleteFacture(id);
		return "delete!";
	}
	
	@CrossOrigin
	@DeleteMapping("/fctlettre/{id}")
	public String deleteFactureLettre(@PathVariable Long id) {
		 factureltrService.deleteFacture(id);
		 return "deleted!";
	}
	
	@CrossOrigin
	@DeleteMapping("/fctop/{id}")
	public String getAllFactureOp(@PathVariable Long id) {
		 factureOp.deleteFacture(id);
		 return "deleted!";
		
	}
	
	@CrossOrigin
	@DeleteMapping("/fctcomdist/{id}")
	public String deleteFactureComdist(@PathVariable Long id) {
		 factureComdist.deleteFacture(id);
		 return "delete!";
		 
		
	}

}
