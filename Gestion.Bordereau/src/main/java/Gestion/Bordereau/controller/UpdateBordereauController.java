package Gestion.Bordereau.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Gestion.Bordereau.model.Bordereau;
import Gestion.Bordereau.services.BordereauService3wmTnd;
import Gestion.Bordereau.services.BordereauServiceVentilationDirect;

@RestController
@RequestMapping("/BordereauUpdate")
public class UpdateBordereauController {
	
	@Autowired
	BordereauService3wmTnd srv3wmtnd;
	
	
	
	@CrossOrigin
	@PutMapping("/Update")
	public String updBordereauByMatriculeSrv3wmtnd(@Valid @RequestBody Bordereau newBordereau) {
		srv3wmtnd.updateBordereauById(newBordereau);
		System.out.println("=========editing===========");
		return "updated";
		
	} 
	
	

}
