package gestion.facture.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
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
@RequestMapping("/FacturesDisplay")
public class DisplayFacturesController {
	
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
	@GetMapping("/showfd")
	public List<FondRoulement> getAllfd() {
		return fdservice.findAllFactureOp();
	}
	
	
	@CrossOrigin
	@GetMapping("/objects")
	public List<Objet> getAllObjects() {
		return objetService.findObjects();
	}
	
	@CrossOrigin
	@GetMapping("/pieces")
	public List<PieceJointe> getAllPieces() {
		return pieceService.findPiece();
	}
	

	@CrossOrigin
	@GetMapping("/show3wm")
	public List<Facture3wm> getAllFacture3wm() {
		System.out.println("---------------factures---------------");
		return facture3wmService.findAllFacture3wm();
	}
	
	@CrossOrigin
	@GetMapping("/showfdremp")
	public List<FactureFdRemb> getAllFactureFdRemp() {
		return factureFdRempService.findAllFactureFdRemb();
	}
	
	@CrossOrigin
	@GetMapping("/showfctfin")
	public List<FactureFinancement> getAllFactureFin() {
		return factureFinService.findAllFactureFin();
	}
	
	@CrossOrigin
	@GetMapping("/showfctfisc")
	public List<FactureFiscalité> getAllFactureFisc() {
		return factureFiscService.findAllFactureFisc();
	}
	
	@CrossOrigin
	@GetMapping("/showfctlettre")
	public List<FactureLettreCredit> getAllFactureLettre() {
		return factureltrService.findAllFactureLtrCrd();
	}
	
	@CrossOrigin
	@GetMapping("/showfctop")
	public List<FactureOperateur> getAllFactureOp() {
		return factureOp.findAllFactureOp();
	}
	
	@CrossOrigin
	@GetMapping("/showfctcomdist")
	public List<FactureComdist> getAllFactureComdist() {
		return factureComdist.findAllFactureComdist();
	}
}
