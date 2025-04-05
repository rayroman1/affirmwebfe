package com.example_affirmunregister.demo_affirm.model;

import javax.persistence.Column;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
// test
@Entity
@Table(name = "customertable")
public class Cust {
	@Id
	 @GeneratedValue(strategy=GenerationType.AUTO)	
	private int afid;
	private String fname;
	private String lname;
	private String address;
	private String username;
	private String password;
	
	Cust()
	{
		
	}

	public Cust(int afid, String fname, String lname, String address, String usern, String passw) {
		super();
		this.afid = afid;
		this.fname = fname;
		this.lname = lname;
		this.address = address;
		this.username = usern;
		this.password = passw;
	}

	public int getAfid() {
		return afid;
	}

	public void setAfid(int afid) {
		this.afid = afid;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getUsern() {
		return username;
	}

	public void setUsern(String usern) {
		this.username = usern;
	}

	public String getPassw() {
		return password;
	}

	public void setPassw(String passw) {
		this.password = passw;
	}

}
