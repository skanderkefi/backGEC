package gestion.facture.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gestion.facture.models.Objet;
import gestion.facture.repo.Facture3wmRepo;
import gestion.facture.repo.ObjetRepo;

@Service
public class ObjetService {
	
	@Autowired
	ObjetRepo objetRepo;
	
	public void createObjet(Objet objet) {
		objetRepo.save(objet);
	}
	
	public List<Objet> findObjects(){
		return objetRepo.findAll();	}

}
