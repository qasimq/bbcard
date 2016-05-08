package com.ascap.prototypes.bbcard.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PartyAdvance {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private float amount;
	private Date advanceDate;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public Date getAdvanceDate() {
		return advanceDate;
	}

	public void setAdvanceDate(Date advanceDate) {
		this.advanceDate = advanceDate;
	}
}
