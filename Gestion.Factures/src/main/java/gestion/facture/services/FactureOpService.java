package gestion.facture.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gestion.facture.models.FactureLettreCredit;
import gestion.facture.models.FactureOperateur;
import gestion.facture.repo.FactureOpRepo;

@Service
public class FactureOpService {
	
	@Autowired
	FactureOpRepo factureRepo;
	
	public List<FactureOperateur> findAllFactureOp() {
		return factureRepo.findAll();
	}
	
	public void deleteFacture(Long id) {
		factureRepo.deleteById(id);

	}
	
	public void updateFactureById(FactureOperateur newFacture) {
		
		FactureOperateur old= factureRepo.getOne(newFacture.getId());
		old.setBordereau(newFacture.getBordereau());
		old.setCreated_by(newFacture.getCreated_by());
		old.setDatereception(newFacture.getDatereception());
		old.setDevise(newFacture.getDevise());
		old.setFactname(newFacture.getFactname());
		old.setMontant(newFacture.getMontant());
		old.setPieceJointe(newFacture.getPieceJointe());

		old.setNum_po(newFacture.getNum_po());
		old.setObjet(newFacture.getObjet());
		old.setStatus(newFacture.getStatus());
		old.setFactname(newFacture.getFactname());
		old.setUpdatedAt(newFacture.getUpdatedAt());
		old.setFournisseur(newFacture.getFournisseur());
		
		old.setCodeAp(newFacture.getCodeAp());
		old.setDateEnvoieAuAp(newFacture.getDateEnvoieAuAp());
		old.setDateRefusParAp(newFacture.getDateRefusParAp());
		old.setDateRefusParTreso(newFacture.getDateRefusParTreso());
		old.setDateValidationParTreso(newFacture.getDateRefusParTreso());
		old.setDatValidationParAp(newFacture.getDatValidationParAp());
		old.setRaisonRefusAp(newFacture.getRaisonRefusAp());
		old.setCodeTreso(newFacture.getCodeTreso());
		old.setRaisonRefusTreso(newFacture.getRaisonRefusTreso());
		
		old.setToAp(newFacture.getToAp());
		
		
		

		factureRepo.save(old);
		
	}
	
	public void createFacture(FactureOperateur f) {
		factureRepo.save(f);
	}

}
