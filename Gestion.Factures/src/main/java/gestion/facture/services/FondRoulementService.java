package gestion.facture.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gestion.facture.models.FactureOperateur;
import gestion.facture.models.FondRoulement;
import gestion.facture.repo.FactureOpRepo;
import gestion.facture.repo.FondRoulementRepo;

@Service
public class FondRoulementService {
	
	@Autowired
	FondRoulementRepo factureRepo;
	
	public List<FondRoulement> findAllFactureOp() {
		return factureRepo.findAll();
	}
	
	public void deleteFacture(Long id) {
		factureRepo.deleteById(id);

	}
	
	public void updateFactureById(FondRoulement newFacture) {
		
		FondRoulement old= factureRepo.getOne(newFacture.getId());
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
		old.setFournisseur(newFacture.getFournisseur());
		
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
	
	public void createFacture(FondRoulement f) {
		factureRepo.save(f);
	}


}
