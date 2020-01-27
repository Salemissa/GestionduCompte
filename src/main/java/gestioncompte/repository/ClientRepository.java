package gestioncompte.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import gestioncompte.entites.Client;


public interface ClientRepository extends JpaRepository<Client, Long> {

}
