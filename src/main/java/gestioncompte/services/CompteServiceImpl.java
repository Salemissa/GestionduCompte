package gestioncompte.services;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.hibernate.boot.model.relational.Database;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gestioncompte.entites.Compte;
import gestioncompte.repository.ClientRepository;
import gestioncompte.repository.CompteRepository;
import gestioncompte.repository.EmployeRepository;
@Service
public class CompteServiceImpl  implements CompteService{
	@Autowired
	private CompteRepository compteRepository;
	@Override
	public Compte addCompte(Compte c) {
		// TODO Auto-generated method stub
		c.setDateCreation(new Date());
		return compteRepository.save(c);
	}

	@Override
	public List<Compte> listCompte() {
		// TODO Auto-generated method stub
		return compteRepository.findAll();
	}

	@Override
	public Compte getCompte(String code) {
		// TODO Auto-generated method stub
		Optional<Compte> compte=compteRepository.findById(code);
		
		if(compte.isPresent()) {
			return compte.get();
		}
		
		else {
			return null;
		}
	}

}
