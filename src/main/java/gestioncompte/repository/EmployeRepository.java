package gestioncompte.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import gestioncompte.entites.Employe;

public interface EmployeRepository extends JpaRepository<Employe, Long> {

}
