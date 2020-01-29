package gestioncompte.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gestioncompte.entites.Employe;
import gestioncompte.repository.EmployeRepository;
@Service
public class EmployeServiceImpl implements EmployeService {
	
	@Autowired
	private EmployeRepository employeRepository;

	@Override
	public Employe addEmploye(Employe e) {
		// TODO Auto-generated method stub
		return employeRepository.save(e);
	}

	@Override
	public List<Employe> listAllEmploye() {
		// TODO Auto-generated method stub
		return employeRepository.findAll();
	}

	@Override
	public void deleteEmploye(Long id) {
		// TODO Auto-generated method stub
		
	}

}
