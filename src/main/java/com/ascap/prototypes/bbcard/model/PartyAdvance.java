package com.ascap.prototypes.bbcard.model;

import java.util.Currency;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PartyAdvance {

	@Id
	private long id;

	private Currency amount;
	private Date advanceDate;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Currency getAmount() {
		return amount;
	}

	public void setAmount(Currency amount) {
		this.amount = amount;
	}

	public Date getAdvanceDate() {
		return advanceDate;
	}

	public void setAdvanceDate(Date advanceDate) {
		this.advanceDate = advanceDate;
	}
}
