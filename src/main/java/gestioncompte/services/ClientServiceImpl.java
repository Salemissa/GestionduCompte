package gestioncompte.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gestioncompte.entites.Client;
import gestioncompte.repository.ClientRepository;


@Service
public class ClientServiceImpl  implements ClientService{
	
	@Autowired
	private ClientRepository clientRepository;
	

	

	@Override
	public void suppClient(Client c) {
		
		
	}

	@Override
	public Client getClient(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	

	@Override
	public Client addClient(Client c) {
		
		return clientRepository.save(c);
	}

	@Override
	public List<Client> listAllClient() {
		
		return clientRepository.findAll();
	}

}
