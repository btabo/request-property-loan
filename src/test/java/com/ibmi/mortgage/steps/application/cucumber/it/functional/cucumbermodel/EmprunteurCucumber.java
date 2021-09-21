package com.ibmi.mortgage.steps.application.cucumber.it.functional.cucumbermodel;

import com.ibmi.mortgage.domain.Emprunteur;

//@Data
public class EmprunteurCucumber {
	private int age;
	private String csp;
	private String contratTravail;

	public EmprunteurCucumber(int age, String csp, String contratTravail) {
		super();
		this.age = age;
		this.csp = csp;
		this.contratTravail = contratTravail;
	}

	public int getDateNaissance() {
		return age;
	}

	public void setDateNaissance(int age) {
		this.age = age;
	}

	public String getCsp() {
		return csp;
	}

	public void setCsp(String csp) {
		this.csp = csp;
	}

	public String getContratTravail() {
		return contratTravail;
	}

	public void setContratTravail(String contratTravail) {
		this.contratTravail = contratTravail;
	}

	public Emprunteur mapToDomain() {
		return new Emprunteur(this.age, this.csp, this.contratTravail);
	}
}
