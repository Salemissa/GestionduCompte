package gestioncompte;

import static org.junit.Assert.assertNotNull;

import javax.activation.DataSource;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import gestioncompte.entites.Client;
import gestioncompte.repository.ClientRepository;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class GestionduCompteApplicationTests {
	@Autowired
    ClientRepository clienrepository;
	
	@Autowired 
	private DataSource dataSource;
	  @Autowired 
	  private JdbcTemplate jdbcTemplate;
	  @Autowired
	 private TestEntityManager testEntityManager; 
	@Test
	void contextLoads() {
		Client c=new Client();
		c.setAdresseClient("Kiffa");
		c.setNni("9088888888");
		c.setNomClient("issa");
		clienrepository.save(c);
		assertNotNull(c.getCodeClient());
		
		
	}

}
