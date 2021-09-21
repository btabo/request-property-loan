package com.ibmi.mortgage.application;

import org.springframework.stereotype.Service;

import com.ibmi.mortgage.domain.Emprunteur;
import com.ibmi.mortgage.domain.FormuleAssurance;
import com.ibmi.mortgage.domain.Projet;

@Service
public class AssuranceGroupeDecisionImpl implements AssuranceGroupeDecision {

	@Override
	public FormuleAssurance choisir(Projet projet) {
		Emprunteur emprunteur = projet.getEmprunteur();
		String csp = emprunteur.getCsp();
		int age = emprunteur.getAge();
		String contratTravail = emprunteur.getContratTravail();

		String libelleFormule = "N/A";
		if (Integer.parseInt(csp) >= Integer.valueOf("700")) {
			if (age < 80) {
				libelleFormule = "DC";
			} else {
				libelleFormule = "N/A";
			}
		}
		if ((61 <= age) && (age < 66)) {
			libelleFormule = "DC/PTIA";
		} else if (age < 61) {
			if ("SALARIE_PRIVE".equals(contratTravail)) {
//				Sans relais Sec
//	            DC/PTIA/IPT-ITT90/PE
//	        Avec relais Sec
//	            DC/PTIA/IPT-ITT90
				libelleFormule = "DC/PTIA/IPT-ITT90/PE";
			} else if ("SALARIE_PUBLIC".equals(contratTravail)) {
				libelleFormule = "DC/PTIA/IPT-ITT90";
			} else if ("AUTRE".equals(contratTravail)) {
				libelleFormule = "DC/PTIA/IPT-ITT30";
			}
		} else if ((age <= 66) && (age <= 80)) {
			libelleFormule = "DC";
		}

		FormuleAssurance formuleAssurance = new FormuleAssurance();
		formuleAssurance.setLibelleFormule(libelleFormule);
		return formuleAssurance;
	}

}
