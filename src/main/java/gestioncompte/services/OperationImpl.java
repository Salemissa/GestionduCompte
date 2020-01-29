package gestioncompte.services;

import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import gestioncompte.entites.Compte;
import gestioncompte.entites.Operation;
import gestioncompte.entites.Retrait;
import gestioncompte.entites.Versement;
import gestioncompte.repository.CompteRepository;
import gestioncompte.repository.OperationRepository;
import net.bytebuddy.asm.Advice.OffsetMapping.Sort;


@Service
public class OperationImpl implements  OperationService{
	@Autowired
	private OperationRepository  operationRepository;
	@Autowired
	private CompteRepository compteRepository;
	@Override
	@Transactional
	public boolean verser(String codeCpte, double montant) {
		// TODO Auto-generated method stub
		
		Optional<Compte> cp=compteRepository.findById(codeCpte);
			Operation v = new Versement();
			if(cp == null) throw new RuntimeException("Compte introuvable");
			Compte compte =cp.get();
			v.setDateOperation(new Date());
			v.setMontant(montant);
			v.setCompte(compte);
			operationRepository.save(v);
			
			compte.setSolde(compte.getSolde()+montant);
		
		return true ;
		
		
		
	}
	@Override
	@Transactional
	public boolean retirer(String codeCpte, double montant) {

		Optional<Compte> cp=compteRepository.findById(codeCpte);
			Operation v = new Retrait();
			if(cp == null) throw new RuntimeException("Compte introuvable");
			Compte compte =cp.get();
			
			v.setDateOperation(new Date());
			v.setMontant(montant);
			v.setCompte(compte);
			if(compte.getSolde() <montant) throw new RuntimeException("montant insufisant");
			compte.setSolde(compte.getSolde() - montant);
			operationRepository.save(v);
			
			
		
		return true ;
		
		
	}
	@Override
	@Transactional
	public boolean virement(String codeCpte1, String codeCpte2, double montant) {
		
		if(codeCpte1.equals(codeCpte2)){
			throw new RuntimeException("Impossibile de faire un virement sur le même compte");
		}
		retirer(codeCpte1, montant);
		verser(codeCpte2, montant);
		
		
		return true;
		// TODO Auto-generated method stub
		
	}
	@Override
	public PageOperation getOperations(String code, int page, int size) {
		Page<Operation> ops=  operationRepository.getOperations(code, PageRequest.of(page, size));
	
		
		PageOperation pageOperation=new PageOperation();
		
		pageOperation.setNombreOperations(ops.getNumberOfElements());
		pageOperation.setOperation(ops.getContent());
		pageOperation.setPage(page);
		pageOperation.setTotaleOperations((int)ops.getTotalElements());
		pageOperation.setTotalepage(ops.getTotalPages());
		
		return pageOperation;
	}
	
	

}
