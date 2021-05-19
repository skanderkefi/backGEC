package Gestion.Bordereau.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Gestion.Bordereau.model.Bordereau;
import Gestion.Bordereau.repo.BordereauRepo;

@Service
public class BordereauOperationService extends BordereauService{
	
	@Autowired
	BordereauRepo  repo;
	
	public List<Bordereau> findAllBordereau3wm(){
		List<Bordereau> all= repo.findAll();
		List<Bordereau> b3wmtnd = new ArrayList<>();
		for (Bordereau bordereau : all) {
			if(bordereau.getNature().equals("OPEREATION")){
				b3wmtnd.add(bordereau);
			}
		}
		
		return b3wmtnd;
	}
	
	
}
