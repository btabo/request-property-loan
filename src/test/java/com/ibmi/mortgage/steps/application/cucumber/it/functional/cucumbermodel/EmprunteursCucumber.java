package com.ibmi.mortgage.steps.application.cucumber.it.functional.cucumbermodel;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class EmprunteursCucumber {
	private List<EmprunteurCucumber> emprunteurs = new ArrayList<>();

	public void addEmprunteurCucumber(EmprunteurCucumber book) {
		emprunteurs.add(book);
	}

	public void addAllEmprunteurCucumbers(Collection<EmprunteurCucumber> emprunteurs) {
		this.emprunteurs.addAll(emprunteurs);
	}

	public List<EmprunteurCucumber> getAll() {
		return emprunteurs;
	}
}
