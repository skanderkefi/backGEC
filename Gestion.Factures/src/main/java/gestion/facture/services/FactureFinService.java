package gestion.facture.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gestion.facture.models.FactureFdRemb;
import gestion.facture.models.FactureFinancement;
import gestion.facture.repo.FactureFinRepo;

@Service
public class FactureFinService {
	
	@Autowired
	FactureFinRepo factureRepo;
	
	public List<FactureFinancement> findAllFactureFin() {
		return factureRepo.findAll();
	}
	
	public void deleteFacture(Long id) {
		factureRepo.deleteById(id);

	}
	
	public void updateFactureById(FactureFinancement newFacture) {
		
		FactureFinancement old= factureRepo.getOne(newFacture.getId());
		old.setBordereau(newFacture.getBordereau());
		old.setCreated_by(newFacture.getCreated_by());
		old.setDatereception(newFacture.getDatereception());
		old.setDevise(newFacture.getDevise());
		old.setFactname(newFacture.getFactname());
		old.setMontant(newFacture.getMontant());
		old.setNum_po(newFacture.getNum_po());
		old.setObjet(newFacture.getObjet());
		old.setPieceJointe(newFacture.getPieceJointe());

		old.setPathPdf(newFacture.getPathPdf());
		old.setStatus(newFacture.getStatus());
		old.setCredit(newFacture.getCredit());
		old.setTypeFin(newFacture.getTypeFin());
		old.setEcheance(newFacture.getEcheance());
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
	
	public void createFacture(FactureFinancement f) {
		factureRepo.save(f);
	}

}
