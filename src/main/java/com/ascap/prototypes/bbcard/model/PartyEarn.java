package com.ascap.prototypes.bbcard.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PartyEarn {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String distQuarter;
	private float grossAmount;
	private float netAmount;

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

	public float getGrossAmount() {
		return grossAmount;
	}

	public void setGrossAmount(float grossAmount) {
		this.grossAmount = grossAmount;
	}

	public float getNetAmount() {
		return netAmount;
	}

	public void setNetAmount(float netAmount) {
		this.netAmount = netAmount;
	}

}
