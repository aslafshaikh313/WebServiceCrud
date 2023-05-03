package com.cjcmain.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int personId;
	private String personNAme;
	private String emailId;
	private String contactNumber;
	
	@OneToOne(cascade = CascadeType.ALL)
	private PanCard p;

	public PanCard getP() {
		return p;
	}

	public void setP(PanCard p) {
		this.p = p;
	}

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getPersonNAme() {
		return personNAme;
	}

	public void setPersonNAme(String personNAme) {
		this.personNAme = personNAme;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
}
