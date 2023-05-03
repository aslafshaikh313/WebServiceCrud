package com.cjcmain.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PanCard {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int panCardNumber;
	private String country;
	private String state;
	private String personName;
	private String dob;

	public int getPanCardNumber() {
		return panCardNumber;
	}

	public void setPanCardNumber(int panCardNumber) {
		this.panCardNumber = panCardNumber;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}
}









//{
//    "personNAme": "aslaf",
//    "emailId": "aslaf@123gmail.com",
//    "contactNumber": "8208312656",
//    "p":{
//        "country":"India",
//        "state":"Maharashtra",
//        "personName":"Aslaf",
//        "dob":"15-feb-2022"        
//    }
//}
