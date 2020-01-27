package gestioncompte.services;

import java.util.List;

import gestioncompte.entites.Employe;

public interface EmployeService {
   public Employe addEmploye(Employe e);
   public List<Employe> listAllEmploye();
   public void deleteEmploye(Long id);
   
}
