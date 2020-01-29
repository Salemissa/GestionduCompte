package gestioncompte.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import gestioncompte.entites.Client;
import gestioncompte.services.ClientService;

@RestController
public class ClientRestController {
   
    
    @Autowired
    private ClientService clientService;
    
    @PostMapping(path="/clients")
	public Client addClient(@RequestBody Client c) {
			
			return clientService.addClient(c);
	}
	
    
    @GetMapping(path = "/listesClients")
    public List<Client> listAllClient(){
    	    return clientService.listAllClient();
    }
	
	

}
