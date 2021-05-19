package gestion.facture.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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
import gestion.facture.models.Objet;
import gestion.facture.models.PieceJointe;
import gestion.facture.services.Facture3mwService;
import gestion.facture.services.FactureComdistService;
import gestion.facture.services.FactureFdRembService;
import gestion.facture.services.FactureFinService;
import gestion.facture.services.FactureFiscService;
import gestion.facture.services.FactureLtrService;
import gestion.facture.services.FactureOpService;
import gestion.facture.services.FondRoulementService;
import gestion.facture.services.ObjetService;
import gestion.facture.services.PieceService;


@RestController
@RequestMapping("/CreateFactures")
public class CreateFactureController {
	
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
	PieceService pieceService;
	
	@Autowired
	ObjetService objetService;
	
	@Autowired
	FondRoulementService fdservice;
	
	
	@CrossOrigin
	@PostMapping("/objet")
	public String createObject(@Valid @RequestBody Objet objet) {
		 objetService.createObjet(objet);
		 return "created!";
	}
	
	@CrossOrigin
	@PostMapping("/piece")
	public String createPiece(@Valid @RequestBody PieceJointe piece) {
		 pieceService.createPj(piece);
		 return "created!";
	}
	
	
	@CrossOrigin
	@PostMapping("/fondroulement")
	public String createFacturefd(@Valid @RequestBody FondRoulement fd) {
		fdservice.createFacture(fd);
		 return "created!";
	}
	
	@CrossOrigin
	@PostMapping("/3wm")
	public String createFacture3wm(@Valid @RequestBody Facture3wm fact) {
		 facture3wmService.createFacture(fact);
		 return "created!";
	}
	
	@CrossOrigin
	@PostMapping("/fdremp")
	public String createFactureFdRemp(@Valid @RequestBody FactureFdRemb fact) {
		 factureFdRempService.createFacture(fact);
		 return "created !";
	}
	 
	@CrossOrigin
	@PostMapping("/fctfin")
	public String createFactureFin(@Valid @RequestBody FactureFinancement fact) {
		 factureFinService.createFacture(fact);
		 return "created!";
	}
	 
	@CrossOrigin
	@PostMapping("/fctfisc")
	public String createFactureFisc(@Valid @RequestBody FactureFiscalité fact) {
		 factureFiscService.createFacture(fact);
		return "created!";
	}
	  
	@CrossOrigin
	@PostMapping("/lettre")
	public String createFacturelettre(@Valid @RequestBody FactureLettreCredit fact) {
		 factureltrService.createFacture(fact);
		return "created!";
	}
	
	  @CrossOrigin
		@PostMapping("/op")
		public String createFacturelettre(@Valid @RequestBody FactureOperateur fact) {
			 factureOp.createFacture(fact);
			return "created!";
		}
	
	  @CrossOrigin
		@PostMapping("/comdist")
		public String createFacturecomdist(@Valid @RequestBody FactureComdist fact) {
			 factureComdist.createFacture(fact);
			return "created!";
		}

}
