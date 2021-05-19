package Gestion.Bordereau.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Gestion.Bordereau.model.Bordereau;
import Gestion.Bordereau.repo.BordereauRepo;

@Service
public class BordereauService {
	
	@Autowired
	BordereauRepo  repo;
	
	public void deleteBordereau(Long id) {
		this.repo.deleteById(id);
	}
	
	public void updateBordereauById(Bordereau newBord) {
		
		Bordereau old= repo.getOne(newBord.getId());
		old.setCreatedAt(newBord.getCreatedAt());
		old.setCreatedBy(newBord.getCreatedBy());
		old.setFolder(newBord.getFolder());
		old.setNature(newBord.getNature());
		old.setReference(newBord.getReference());
		old.setSentAt(newBord.getSentAt());
		old.setSentBy(newBord.getSentBy());
		old.setStatus(newBord.getStatus());
		old.setUpdatedAt(newBord.getUpdatedAt());
		old.setToAp(newBord.getToAp());
		repo.save(old);
		
	}
	
	public void createBordereau(Bordereau b) {
		repo.save(b);
	}
	
	
	
	

}
