package gestioncompte.services;

import java.io.Serializable;
import java.util.List;

import gestioncompte.entites.Operation;

public class PageOperation implements Serializable {
	
	private List <Operation > operation;
	private int page ;
	private int nombreOperations;
	private int totaleOperations;
	private int totalepage;
	public List<Operation> getOperation() {
		return operation;
	}
	public void setOperation(List<Operation> operation) {
		this.operation = operation;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getNombreOperations() {
		return nombreOperations;
	}
	public void setNombreOperations(int nombreOperations) {
		this.nombreOperations = nombreOperations;
	}
	public int getTotaleOperations() {
		return totaleOperations;
	}
	public void setTotaleOperations(int totaleOperations) {
		this.totaleOperations = totaleOperations;
	}
	public int getTotalepage() {
		return totalepage;
	}
	public void setTotalepage(int totalepage) {
		this.totalepage = totalepage;
	}

}
