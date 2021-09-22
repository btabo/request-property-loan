package com.ibmi.mortgage.application;

import com.ibmi.mortgage.domain.entites.Emprunteur;
import com.ibmi.mortgage.domain.entites.Projet;
import com.ibmi.mortgage.domain.enums.FormuleAssuranceEnum;
import com.ibmi.mortgage.domain.enums.StatutProfessonnelEnum;
import com.ibmi.mortgage.domain.vo.Csp;
import org.springframework.stereotype.Service;

import static com.ibmi.mortgage.domain.enums.FormuleAssuranceEnum.*;
import static com.ibmi.mortgage.domain.enums.StatutProfessonnelEnum.*;

@Service
public class AssuranceGroupeDecisionImpl implements AssuranceGroupeDecision {

    @Override
    public FormuleAssuranceEnum choisir(Projet projet) {
        Emprunteur emprunteur = projet.getEmprunteur();
        Csp csp = emprunteur.getCsp();
        int age = emprunteur.getAge();
        StatutProfessonnelEnum statutProfessionnel = emprunteur.getStatutPro();

        FormuleAssuranceEnum formuleAssurance = null;
        if (csp.get() >= 700 && age < 80) {
            formuleAssurance = DC;
        }
        if ((61 <= age) && (age < 66)) {
            formuleAssurance = DC_PTIA;
        } else if (age < 61) {
            if (SALARIE_PRIVE.equals(statutProfessionnel)) {
//				Sans relais Sec
//	            DC/PTIA/IPT-ITT90/PE
//	        Avec relais Sec
//	            DC/PTIA/IPT-ITT90
                formuleAssurance = DC_PTIA_IPT_ITT90_PE;
            } else if (SALARIE_PUBLIC.equals(statutProfessionnel)) {
                formuleAssurance = DC_PTIA_IPT_ITT90;
            } else if (AUTRE.equals(statutProfessionnel)) {
                formuleAssurance = DC_PTIA_IPT_ITT30;
            }
        } else if ((age >= 66) && (age <= 80)) {
            formuleAssurance = DC;
        }
        return formuleAssurance;
    }

}
