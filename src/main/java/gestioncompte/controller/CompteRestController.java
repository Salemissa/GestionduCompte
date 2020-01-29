package gestioncompte.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import gestioncompte.entites.Compte;
import gestioncompte.services.ClientService;
import gestioncompte.services.CompteService;

@RestController
public class CompteRestController {
	
	  @Autowired
	    private CompteService compteService;
    @PostMapping(path="/comptes")
	public Compte addCompte(@RequestBody Compte c) {
		return compteService.addCompte(c);
	}
    
    
    @GetMapping(path="/comptes/{code}")
	public Compte getCompte(@PathVariable("code") String code) {
		return compteService.getCompte(code);
	}
    @GetMapping(path="/listCompte")
	public List<Compte> listCompte() {
		return compteService.listCompte();
	}
	

}
