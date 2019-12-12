package io.fidelmohabir.Component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import io.fidelmohabir.Entity.Link;
import io.fidelmohabir.Repository.LinkRepository;



@Component
public class DatabaseLinkLoader implements CommandLineRunner {
	
	private final LinkRepository linkrepository;
	
	@Autowired
	public DatabaseLinkLoader(LinkRepository linkrepository) {
		this.linkrepository = linkrepository;
	}
	
	@Override
	public void run(String... args) throws Exception {
		 Iterable<Link> systemlist = linkrepository.findAll();
		 for(Link linkmodel:systemlist) {
			 System.out.println(linkmodel.toString());
		 }
	}
	
}
