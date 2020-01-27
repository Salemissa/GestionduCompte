package gestioncompte.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import gestioncompte.entites.Compte;

public interface CompteRepository extends JpaRepository<Compte, Long> {

}
