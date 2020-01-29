package gestioncompte.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import gestioncompte.entites.Client;
import gestioncompte.entites.Employe;
import gestioncompte.repository.EmployeRepository;
import gestioncompte.services.EmployeService;

@RestController
public class EmployeRestcontroller {
	
	@Autowired
	private EmployeService employeService;
	@PostMapping(path="/employes")
	public Employe addEmploye(@RequestBody Employe e) {
		return employeService.addEmploye(e);
	}
	@GetMapping(path = "/listesEmplyes")
	public List<Employe> listAllEmploye() {
		return employeService.listAllEmploye();
	}

	public void deleteEmploye(Long id) {
		employeService.deleteEmploye(id);
	}
	

}
