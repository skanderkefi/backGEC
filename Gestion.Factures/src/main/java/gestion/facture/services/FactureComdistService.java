package gestion.facture.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gestion.facture.models.Facture3wm;
import gestion.facture.models.FactureComdist;
import gestion.facture.repo.FactureComdistRepo;

@Service
public class FactureComdistService {
	
	@Autowired
	FactureComdistRepo factureRepo;
	
	public List<FactureComdist> findAllFactureComdist() {
		return factureRepo.findAll();
	}
	
	
	public void deleteFacture(Long id) {
		factureRepo.deleteById(id);

	}
	
	public void updateFactureById(FactureComdist newFacture) {
		
		FactureComdist old= factureRepo.getOne(newFacture.getId());
		old.setBordereau(newFacture.getBordereau());
		old.setCreated_by(newFacture.getCreated_by());
		old.setBeneficiaire(newFacture.getBeneficiaire());
		old.setDatereception(newFacture.getDatereception());
		old.setDevise(newFacture.getDevise());
		old.setDirection(newFacture.getDirection());
		old.setDossier(newFacture.getDossier());
		old.setFactname(newFacture.getFactname());
		old.setFournisseur(newFacture.getFournisseur());
		old.setMontant(newFacture.getMontant());
		old.setNum_po(newFacture.getNum_po());
		old.setObjet(newFacture.getObjet());
		old.setPathPdf(newFacture.getPathPdf());
		old.setUpdatedAt(newFacture.getUpdatedAt());
		old.setStatus(newFacture.getStatus());
		old.setDatebc(newFacture.getDatebc());
		old.setDelaip(newFacture.getDelaip());
		old.setDatefct(newFacture.getDatefct());
		old.setIdfiscale(newFacture.getIdfiscale());
		old.setPieceJointe(newFacture.getPieceJointe());
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
	
	public void createFacture(FactureComdist f) {
		factureRepo.save(f);
	}
	
	
	

}
