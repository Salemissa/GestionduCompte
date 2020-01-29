package gestioncompte.services;

public interface OperationService {
	
	public boolean verser(String codeCpte, double montant);
	public boolean retirer(String codeCpte, double montant);
	public boolean virement(String codeCpte1, String codeCpte2, double montant);
	public PageOperation getOperations(String codeCpte, int page, int size);

}
