package gestion.facture.services;


import java.util.List; 


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gestion.facture.models.Facture3wm;
import gestion.facture.repo.Facture3wmRepo;

@Service
public class Facture3mwService {

	@Autowired
	Facture3wmRepo factureRepo;
	
	public List<Facture3wm> findAllFacture3wm() {
		return factureRepo.findAll();
	}

	
	
	public void deleteFacture(Long id) {
		factureRepo.deleteById(id);

	}
	
	public void updateFactureById(Facture3wm newFacture) {
		
		Facture3wm old= factureRepo.getOne(newFacture.getId());
		old.setBordereau(newFacture.getBordereau());
		old.setCreated_by(newFacture.getCreated_by());
		old.setDateFact(newFacture.getDateFact());
		old.setDatereception(newFacture.getDatereception());
		old.setDevise(newFacture.getDevise());
		old.setDirection(newFacture.getDirection());
		old.setDossier(newFacture.getDossier());
		old.setFactname(newFacture.getFactname());
		old.setFournisseur(newFacture.getFournisseur());
		old.setMontant(newFacture.getMontant());
		old.setNum_fact(newFacture.getNum_fact());
		old.setNum_po(newFacture.getNum_po());
		old.setObjet(newFacture.getObjet());
		old.setPathPdf(newFacture.getPathPdf());
		old.setPeriode_conso(newFacture.getPeriode_conso());
		old.setStatus(newFacture.getStatus());
		old.setStructure(newFacture.getStructure());
		old.setDelai(newFacture.getDelai());
		old.setPieceJointe(newFacture.getPieceJointe());
		
		old.setCodeAp(newFacture.getCodeAp());
		old.setDateEnvoieAuAp(newFacture.getDateEnvoieAuAp());
		old.setDateRefusParAp(newFacture.getDateRefusParAp());
		old.setDateRefusParTreso(newFacture.getDateRefusParTreso());
		old.setDateValidationParTreso(newFacture.getDateRefusParTreso());
		old.setDatValidationParAp(newFacture.getDatValidationParAp());
		old.setRaisonRefusAp(newFacture.getRaisonRefusAp());
		old.setToAp(newFacture.getToAp());
		old.setCodeTreso(newFacture.getCodeTreso());
		old.setRaisonRefusTreso(newFacture.getRaisonRefusTreso());
		factureRepo.save(old);
		
	}
	
	public void createFacture(Facture3wm f) {
		factureRepo.save(f);
	}
	
	
	
	
	
}
