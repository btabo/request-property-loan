package com.ibmi.mortgage.domain;

public class Projet {

	private AchatImmobilier achatImmobilier;
	private Emprunteur emprunteur;

	public void setAchatImmobilier(AchatImmobilier achatImmobilier) {
		this.achatImmobilier = achatImmobilier;
	}

	public Emprunteur getEmprunteur() {
		return emprunteur;
	}

	public void setEmprunteur(Emprunteur emprunteur) {
		this.emprunteur = emprunteur;
	}

}
