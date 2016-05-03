package com.ascap.prototypes.bbcard.model;

import java.util.Currency;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PartyEarn {

	@Id
	private long id;
	private String distQuarter;
	private Currency grossAmount;
	private Currency netAmount;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDistQuarter() {
		return distQuarter;
	}

	public void setDistQuarter(String distQuarter) {
		this.distQuarter = distQuarter;
	}

	public Currency getGrossAmount() {
		return grossAmount;
	}

	public void setGrossAmount(Currency grossAmount) {
		this.grossAmount = grossAmount;
	}

	public Currency getNetAmount() {
		return netAmount;
	}

	public void setNetAmount(Currency netAmount) {
		this.netAmount = netAmount;
	}

}
