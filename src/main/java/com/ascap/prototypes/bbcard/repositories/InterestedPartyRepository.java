package com.ascap.prototypes.bbcard.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.ascap.prototypes.bbcard.model.InterestedParty;

@RepositoryRestResource(collectionResourceRel = "parties", path = "parties")
public interface InterestedPartyRepository extends JpaRepository<InterestedParty, Long> {

	List<InterestedParty> findAllByPartyId(long id);
}
