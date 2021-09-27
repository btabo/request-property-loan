package com.ibmi.mortgage.application;

import com.ibmi.mortgage.domain.entites.Emprunteur;
import com.ibmi.mortgage.domain.enums.FormuleAssuranceEnum;

public interface AssuranceGroupeDecision {

	FormuleAssuranceEnum choisir(Emprunteur emprunteur);

}
