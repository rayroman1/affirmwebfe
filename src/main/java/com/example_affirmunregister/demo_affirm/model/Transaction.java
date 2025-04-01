package com.example_affirmunregister.demo_affirm.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Transaction {
	@Id
	 @GeneratedValue(strategy=GenerationType.AUTO)	
	private int idtranstable;
	private int affid;
	private int bankid;
	private double transtype;
	private Date transdate;
	public Transaction() {
		super();
	}
	public Transaction(int idtranstable, int affid, int bankid, double transtype, Date transdate) {
		super();
		this.idtranstable = idtranstable;
		this.affid = affid;
		this.bankid = bankid;
		this.transtype = transtype;
		this.transdate = transdate;
	}
	public int getIdtranstable() {
		return idtranstable;
	}
	public void setIdtranstable(int idtranstable) {
		this.idtranstable = idtranstable;
	}
	public int getAffid() {
		return affid;
	}
	public void setAffid(int affid) {
		this.affid = affid;
	}
	public int getBankid() {
		return bankid;
	}
	public void setBankid(int bankid) {
		this.bankid = bankid;
	}
	public double getTranstype() {
		return transtype;
	}
	public void setTranstype(double transtype) {
		this.transtype = transtype;
	}
	public Date getTransdate() {
		return transdate;
	}
	public void setTransdate(Date transdate) {
		this.transdate = transdate;
	}
	@Override
	public String toString() {
		return "Transaction [idtranstable=" + idtranstable + ", affid=" + affid + ", bankid=" + bankid + ", transtype="
				+ transtype + ", transdate=" + transdate + "]";
	}

}
