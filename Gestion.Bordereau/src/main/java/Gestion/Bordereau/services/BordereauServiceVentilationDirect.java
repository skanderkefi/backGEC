package Gestion.Bordereau.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Gestion.Bordereau.model.Bordereau;
import Gestion.Bordereau.repo.BordereauRepo;

@Service
public class BordereauServiceVentilationDirect extends BordereauService{

	@Autowired
	BordereauRepo repo;
	
	public List<Bordereau> findAllBordereauVentDirect(){
		List<Bordereau> all= repo.findAll();
		List<Bordereau> b3wmVentd = new ArrayList<>();
		for (Bordereau bordereau : all) {
			if(bordereau.getNature().equals("VENTILATION DIRECTE")){
				b3wmVentd.add(bordereau);
			}
		}
		
		return b3wmVentd;
		
	}
	
	
}
