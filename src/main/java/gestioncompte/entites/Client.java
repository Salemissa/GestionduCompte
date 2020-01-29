package gestioncompte.entites;
import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
@Table(name="CLIENTS")
public class Client implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="CODE_CLI")
  private Long codeClient;
  private String nomClient;
  private String adresseClient;
  
  
  @Column(name="NNI")
  private String nni;
  
  @OneToMany(mappedBy="client",fetch=FetchType.LAZY)
  private Collection<Compte> comptes;
public Long getCodeClient() {
	return codeClient;
}
public void setCodeClient(Long codeClient) {
	this.codeClient = codeClient;
}
public String getNomClient() {
	return nomClient;
}
public void setNomClient(String nomClient) {
	this.nomClient = nomClient;
}
public String getAdresseClient() {
	return adresseClient;
}
public void setAdresseClient(String adresseClient) {
	this.adresseClient = adresseClient;
}

@JsonIgnore //supprimer le boucles  infinies reliee a 
public Collection<Compte> getComptes() {
	return comptes;
}
public void setComptes(Collection<Compte> comptes) {
	this.comptes = comptes;
}


public String getNni() {
	return nni;
}
public void setNni(String nni) {
	this.nni = nni;
}
public Client() {
	super();
	// TODO Auto-generated constructor stub
}
public Client(String nomClient, String adresseClient,String nni) {
	super();
	this.nomClient = nomClient;
	this.adresseClient = adresseClient;
	this.nni=nni;
}
  
}
