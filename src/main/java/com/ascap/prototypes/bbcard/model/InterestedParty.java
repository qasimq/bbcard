package com.ascap.prototypes.bbcard.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class InterestedParty {

	@Id
	private long id;
	private String name;
	private String email;
	private String phone;

	@OneToOne
	private PartyManager manager;
	@OneToOne
	private PartyAdvance advance;
	@OneToMany
	private List<PartyEarn> earns;

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

}
