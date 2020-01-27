package gestioncompte.services;

import java.util.List;

import gestioncompte.entites.Compte;

public interface CompteService {
	
	public Compte saveCompte(Compte c);
	public List<Compte> listCompte();
	public Compte getCompte(String code);
	

}
