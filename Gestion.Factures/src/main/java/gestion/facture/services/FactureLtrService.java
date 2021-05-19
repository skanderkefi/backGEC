package gestion.facture.services;

import java.util.List; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gestion.facture.models.FactureFiscalité;
import gestion.facture.models.FactureLettreCredit;
import gestion.facture.repo.FactureLtrRepo;

@Service
public class FactureLtrService {

	@Autowired
	FactureLtrRepo factureRepo;
	
	public List<FactureLettreCredit> findAllFactureLtrCrd() {
		return factureRepo.findAll();
	}
	
	
	public void deleteFacture(Long id) {
		factureRepo.deleteById(id);

	}
	
	public void updateFactureById(FactureLettreCredit newFacture) {
		
		FactureLettreCredit old= factureRepo.getOne(newFacture.getId());
		old.setBordereau(newFacture.getBordereau());
		old.setCreated_by(newFacture.getCreated_by());
		old.setDatereception(newFacture.getDatereception());
		old.setDevise(newFacture.getDevise());
		old.setFactname(newFacture.getFactname());
		old.setPieceJointe(newFacture.getPieceJointe());

		old.setMontant(newFacture.getMontant());
		old.setNum_po(newFacture.getNum_po());
		old.setObjet(newFacture.getObjet());
		old.setPathPdf(newFacture.getPathPdf());
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
	
	public void createFacture(FactureLettreCredit f) {
		factureRepo.save(f);
	}
	
}
