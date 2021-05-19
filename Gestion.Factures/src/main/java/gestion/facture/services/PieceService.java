package gestion.facture.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gestion.facture.models.Objet;
import gestion.facture.models.PieceJointe;
import gestion.facture.repo.PieceJointeRepo;

@Service
public class PieceService {
	
	@Autowired
	PieceJointeRepo pjRepo;
	
	public void createPj(PieceJointe pj) {
		pjRepo.save(pj);
	}
	
	public List<PieceJointe> findPiece(){
		return pjRepo.findAll();	}

}
