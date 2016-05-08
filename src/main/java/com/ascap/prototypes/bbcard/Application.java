package com.ascap.prototypes.bbcard;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.ascap.prototypes.bbcard.model.InterestedParty;
import com.ascap.prototypes.bbcard.model.PartyEarn;
import com.ascap.prototypes.bbcard.model.PartyManager;
import com.ascap.prototypes.bbcard.repositories.InterestedPartyRepository;

@SpringBootApplication
@EnableJpaRepositories
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Autowired
	private InterestedPartyRepository repo;

	@PostConstruct
	public void bootstrap() {
		repo.deleteAll();

		InterestedParty party = new InterestedParty();
		party.setPartyId(123);
		party.setName("Adeel");

		PartyManager manager = new PartyManager();
		manager.setName("Qasim");

		party.setManager(manager);

		PartyEarn earn = new PartyEarn();
		earn.setGrossAmount(100);

		party.getEarns().add(earn);

		repo.save(party);
	}
}
