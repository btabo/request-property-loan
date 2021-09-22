package com.ibmi.mortgage.application;

import com.ibmi.mortgage.domain.entites.Projet;
import com.ibmi.mortgage.domain.enums.FormuleAssuranceEnum;

public interface AssuranceGroupeDecision {

	FormuleAssuranceEnum choisir(Projet projet);

}
