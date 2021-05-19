package gestion.facture.services;

import java.util.List; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gestion.facture.models.FactureComdist;
import gestion.facture.models.FactureFdRemb;
import gestion.facture.repo.FactureFdRempRepo;

@Service
public class FactureFdRembService {

	@Autowired
	FactureFdRempRepo factureRepo;
	
	public List<FactureFdRemb> findAllFactureFdRemb() {
		return factureRepo.findAll();
	}
	
	
	public void deleteFacture(Long id) {
		factureRepo.deleteById(id);

	}
	
	public void updateFactureById(FactureFdRemb newFacture) {
		
		FactureFdRemb old= factureRepo.getOne(newFacture.getId());
		old.setBordereau(newFacture.getBordereau());
		old.setCreated_by(newFacture.getCreated_by());
		old.setBeneficiaire(newFacture.getBeneficiaire());
		old.setDatereception(newFacture.getDatereception());
		old.setDevise(newFacture.getDevise());
		old.setDirection(newFacture.getDirection());
		old.setDossier(newFacture.getDossier());
		old.setPieceJointe(newFacture.getPieceJointe());

		old.setFactname(newFacture.getFactname());
		old.setMontant(newFacture.getMontant());
		old.setNum_po(newFacture.getNum_po());
		old.setObjet(newFacture.getObjet());
		old.setPathPdf(newFacture.getPathPdf());
		old.setStatus(newFacture.getStatus());
		old.setFournisseur(newFacture.getFournisseur());
		old.setOrdrep(newFacture.getOrdrep());
		
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
	
	public void createFacture(FactureFdRemb f) {
		factureRepo.save(f);
	}
}
