package gestioncompte.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import gestioncompte.entites.Operation;

public interface OperationRepository extends JpaRepository<Operation,Long> {
	
	@Query("select o from Operation o where o.compte.codeCompte =?1 ")
	public Page<Operation>getOperations( String code, PageRequest pageRequest);
		
	

}
