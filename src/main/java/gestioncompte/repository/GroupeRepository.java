package gestioncompte.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import gestioncompte.entites.Groupe;

public interface GroupeRepository extends JpaRepository<Groupe, Long> {

}
