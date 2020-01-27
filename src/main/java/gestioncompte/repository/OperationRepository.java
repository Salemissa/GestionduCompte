package gestioncompte.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import gestioncompte.entites.Operation;

public interface OperationRepository extends JpaRepository<Operation,Long> {

}
