package Gestion.Bordereau.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Gestion.Bordereau.model.Bordereau;
import Gestion.Bordereau.services.BordereauService3wmTnd;

@RestController
@RequestMapping("/BordereauCreate")
public class CreateBordereau {
	
	@Autowired
	BordereauService3wmTnd srv3wmtnd;
	
	@CrossOrigin
	@PostMapping("/create")
	public String createBordereau(@Valid @RequestBody Bordereau b) {
		srv3wmtnd.createBordereau(b);
		System.out.println("=========creating===========");
		return "created !";
		
	}
	
	

}
