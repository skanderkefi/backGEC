package Gestion.Bordereau.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Gestion.Bordereau.services.BordereauService3wmTnd;
import Gestion.Bordereau.services.BordereauServiceVentilationDirect;

@RestController
@RequestMapping("/BordereauDelete")
public class DeleteBordereau {

	@Autowired
	BordereauService3wmTnd srv3wmtnd;
	
	
	@CrossOrigin
	@DeleteMapping("/deletebyid/{id}")
	public String deleteBordereau(@PathVariable Long id) {
		srv3wmtnd.deleteBordereau(id);
		 System.out.println("============================="+id+"==========================");
		 return "from back!";
	}
	}

