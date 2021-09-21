package com.ibmi.mortgage.domain;

public class Emprunteur {

	private int age;
	private String csp;
	private String contratTravail;

	public Emprunteur(int age, String csp, String contratTravail) {
		super();
		this.age = age;
		this.csp = csp;
		this.contratTravail = contratTravail;
	}

	public Emprunteur() {
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
