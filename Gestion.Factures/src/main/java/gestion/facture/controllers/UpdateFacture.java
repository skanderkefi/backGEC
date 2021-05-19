package gestion.facture.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import gestion.facture.models.Facture3wm;
import gestion.facture.models.FactureComdist;
import gestion.facture.models.FactureFdRemb;
import gestion.facture.models.FactureFinancement;
import gestion.facture.models.FactureFiscalité;
import gestion.facture.models.FactureLettreCredit;
import gestion.facture.models.FactureOperateur;
import gestion.facture.models.FondRoulement;
import gestion.facture.services.Facture3mwService;
import gestion.facture.services.FactureComdistService;
import gestion.facture.services.FactureFdRembService;
import gestion.facture.services.FactureFinService;
import gestion.facture.services.FactureFiscService;
import gestion.facture.services.FactureLtrService;
import gestion.facture.services.FactureOpService;
import gestion.facture.services.FondRoulementService;

@RestController
@RequestMapping("/updateFacture")
public class UpdateFacture {
	
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
	@PutMapping("fd")
	public String updateFacturefd(@Valid @RequestBody FondRoulement fact) {
		fdservice.updateFactureById(fact);
		 return "updated!";
	}
	
	@CrossOrigin
	@PutMapping("/3wm")
	public String updateFacture3wm(@Valid @RequestBody Facture3wm fact) {
		 facture3wmService.updateFactureById(fact);
		 return "updated!";
	}
	
	@CrossOrigin
	@PutMapping("/fdremp")
	public String updateFactureFdRemp(@Valid @RequestBody FactureFdRemb fact) {
		 factureFdRempService.updateFactureById(fact);
		 return "updated !";
	}
	
	@CrossOrigin
	@PutMapping("/fctfin")
	public String updateFactureFin(@Valid @RequestBody FactureFinancement fact) {
		 factureFinService.updateFactureById(fact);
		 return "updated!";
	}
	
	@CrossOrigin
	@PutMapping("/fctfisc")
	public String updateFactureFisc(@Valid @RequestBody FactureFiscalité fact) {
		 factureFiscService.updateFactureById(fact);
		 System.out.println("editiiiiiiiiiiiiiiig !!!!");
		return "updated!";
	}
	  
	@CrossOrigin
	@PutMapping("/lettre")
	public String updateFacturelettre(@Valid @RequestBody FactureLettreCredit fact) {
		 factureltrService.updateFactureById(fact);
		return "updated!";
	}
	
	  @CrossOrigin
		@PutMapping("/op")
		public String UpdateFacturelettre(@Valid @RequestBody FactureOperateur fact) {
			 factureOp.updateFactureById(fact);
			return "updated!";
		}
	
	  @CrossOrigin
		@PutMapping("/comdist")
		public String UpdateFacturecomdist(@Valid @RequestBody FactureComdist fact) {
			 factureComdist.updateFactureById(fact);
			return "Updated!";
		}


}
