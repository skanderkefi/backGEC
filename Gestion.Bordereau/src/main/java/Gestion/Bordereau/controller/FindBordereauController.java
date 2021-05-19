package Gestion.Bordereau.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Gestion.Bordereau.model.Bordereau;
import Gestion.Bordereau.repo.BordereauRepo;
import Gestion.Bordereau.services.BordereauService3wmTnd;
import Gestion.Bordereau.services.BordereauServiceVentilationDirect;

@RestController
@RequestMapping("/BordereauFind")
public class FindBordereauController {
	
	@Autowired
	BordereauService3wmTnd srv3wmtnd;
	
	@Autowired
	BordereauServiceVentilationDirect ventd;
	
	@Autowired
	BordereauRepo brepo;
	
	@CrossOrigin
	@GetMapping("/show3wm")
	public List<Bordereau> getAllBordereau3wmtnd() {
		System.out.println("=======================");
		return srv3wmtnd.findAllBordereau3wm();
		
	}
	
	@CrossOrigin
	@GetMapping("/showventd")
	public List<Bordereau> getAllBordereauventDrct() {
		return ventd.findAllBordereauVentDirect();
		
	}
	
	
	@CrossOrigin
	@GetMapping("/shoall")
	public List<Bordereau> getAllBordereau() {
		return brepo.findAll();		
	}
	

	
	

}
