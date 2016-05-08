package com.ascap.prototypes.bbcard.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class InterestedParty {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private long partyId;
	private String name;
	private String email;
	private String phone;

	@OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
	private PartyManager manager;
	@OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
	private PartyAdvance advance;
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "party_id")
	private List<PartyEarn> earns = new ArrayList<PartyEarn>();

	public PartyAdvance getAdvance() {
		return advance;
	}

	public void setAdvance(PartyAdvance advance) {
		this.advance = advance;
	}

	public List<PartyEarn> getEarns() {
		return earns;
	}

	public void setEarns(List<PartyEarn> earns) {
		this.earns = earns;
	}

	public PartyManager getManager() {
		return manager;
	}

	public void setManager(PartyManager manager) {
		this.manager = manager;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPartyId() {
		return partyId;
	}

	public void setPartyId(long partyId) {
		this.partyId = partyId;
	}

}
