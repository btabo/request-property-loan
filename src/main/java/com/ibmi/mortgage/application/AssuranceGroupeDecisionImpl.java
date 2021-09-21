package com.ibmi.mortgage.application;

import com.ibmi.mortgage.domain.Emprunteur;
import com.ibmi.mortgage.domain.FormuleAssuranceEnum;
import com.ibmi.mortgage.domain.Projet;
import org.springframework.stereotype.Service;

import static com.ibmi.mortgage.domain.FormuleAssuranceEnum.*;

@Service
public class AssuranceGroupeDecisionImpl implements AssuranceGroupeDecision {

	@Override
	public FormuleAssuranceEnum choisir(Projet projet) {
		Emprunteur emprunteur = projet.getEmprunteur();
		String csp = emprunteur.getCsp();
		int age = emprunteur.getAge();
		String contratTravail = emprunteur.getContratTravail();

		FormuleAssuranceEnum formuleAssurance = null;
		if (Integer.parseInt(csp) >= Integer.valueOf("700")) {
			if (age < 80) {
				formuleAssurance = DC;
			} else {
				formuleAssurance = null;
			}
		}
		if ((61 <= age) && (age < 66)) {
			formuleAssurance = DC_PTIA;
		} else if (age < 61) {
			if ("SALARIE_PRIVE".equals(contratTravail)) {
//				Sans relais Sec
//	            DC/PTIA/IPT-ITT90/PE
//	        Avec relais Sec
//	            DC/PTIA/IPT-ITT90
				formuleAssurance = DC_PTIA_IPT_ITT90_PE;
			} else if ("SALARIE_PUBLIC".equals(contratTravail)) {
				formuleAssurance = DC_PTIA_IPT_ITT90;
			} else if ("AUTRE".equals(contratTravail)) {
				formuleAssurance = DC_PTIA_IPT_ITT30;
			}
		} else if ((age <= 66) && (age <= 80)) {
			formuleAssurance = DC;
		}
		return formuleAssurance;
	}

}
