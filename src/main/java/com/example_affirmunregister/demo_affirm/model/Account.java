package com.example_affirmunregister.demo_affirm.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Account {
	@Id
	 @GeneratedValue(strategy=GenerationType.AUTO)	
	private int idaccount;
	private int affidfk;
	private double balance;
	private double lastpaym;
	private double amtdue;
	private Date duedate;
	public Account() {
		super();
	}
	public Account(int idaccount, int affidfk, double balance, double lastpaym, double amtdue, Date duedate) {
		super();
		this.idaccount = idaccount;
		this.affidfk = affidfk;
		this.balance = balance;
		this.lastpaym = lastpaym;
		this.amtdue = amtdue;
		this.duedate = duedate;
	}
	public int getIdaccount() {
		return idaccount;
	}
	public void setIdaccount(int idaccount) {
		this.idaccount = idaccount;
	}
	public int getAffidfk() {
		return affidfk;
	}
	public void setAffidfk(int affidfk) {
		this.affidfk = affidfk;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getLastpaym() {
		return lastpaym;
	}
	public void setLastpaym(double lastpaym) {
		this.lastpaym = lastpaym;
	}
	public double getAmtdue() {
		return amtdue;
	}
	public void setAmtdue(double amtdue) {
		this.amtdue = amtdue;
	}
	public Date getDuedate() {
		return duedate;
	}
	public void setDuedate(Date duedate) {
		this.duedate = duedate;
	}
	@Override
	public String toString() {
		return "Account [idaccount=" + idaccount + ", affidfk=" + affidfk + ", balance=" + balance + ", lastpaym="
				+ lastpaym + ", amtdue=" + amtdue + ", duedate=" + duedate + "]";
	}
	//test jenkins 12

}
