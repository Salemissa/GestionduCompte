package gestioncompte.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import gestioncompte.services.EmployeService;
import gestioncompte.services.OperationService;

@RestController
public class OperationRestController {
	
	
	@Autowired
	private OperationService operationService;
	@PutMapping(path="/versement")
	public boolean verser(
			 @RequestParam String codeCpte,
			 @RequestParam double montant) {
		return operationService.verser(codeCpte, montant);
	}
	@PutMapping(path="/retrait")
	public boolean retirer(
			 @RequestParam String codeCpte,
			 @RequestParam double montant){
		return operationService.retirer(codeCpte, montant);
	}
	
	
	@PutMapping(path="/virement")
	public boolean virement(
			@RequestParam String codeCpte1,
			@RequestParam String codeCpte2, 
			@RequestParam double montant) {
		return operationService.virement(codeCpte1, codeCpte2, montant);
	}

}
