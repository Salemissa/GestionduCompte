package gestioncompte.services;

import java.util.List;

import gestioncompte.entites.Client;

public interface ClientService {
	
	public Client addClient(Client c);
	public void suppClient(Client c);
	public Client getClient(int id);
	public List<Client> listAllClient();

}
