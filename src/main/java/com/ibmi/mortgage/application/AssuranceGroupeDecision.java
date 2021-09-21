package com.ibmi.mortgage.application;

import com.ibmi.mortgage.domain.FormuleAssurance;
import com.ibmi.mortgage.domain.Projet;

public interface AssuranceGroupeDecision {

	FormuleAssurance choisir(Projet projet);

}
