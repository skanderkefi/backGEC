package gestion.fournisseur.service;

import java.util.List; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import gestion.fournisseur.model.Fournisseur;
import gestion.fournisseur.repo.FournisseurRepo;

@Service
public class FournisseurService {
	
	@Autowired
	FournisseurRepo repo;
	
	public List<Fournisseur> findAllFournisseurs(){
		return repo.findAll();
	}
	
	public void deleteFournisseur(Long id) {
		repo.deleteById(id);

	}
	
	public void updateFournisseurById(Fournisseur newFournisseur) {
		
		Fournisseur old= repo.getOne(newFournisseur.getIderp());
		old.setAdresse(newFournisseur.getAdresse());
		old.setCategorie(newFournisseur.getCategorie());
		old.setCreatedAt(newFournisseur.getCreatedAt());
		old.setCreatedBy(newFournisseur.getCreatedBy());
		old.setIderp(newFournisseur.getIderp());
		old.setIdFiscale(newFournisseur.getIdFiscale());
		old.setName(newFournisseur.getName());
		old.setNationnalite(newFournisseur.getNationnalite());
		old.setUpdatedAt(newFournisseur.getUpdatedAt());
		
		repo.save(old);
		
	}
	
	public void createFournisseur(Fournisseur f) {
		repo.save(f);
	}
	

}
