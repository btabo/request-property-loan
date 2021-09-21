package com.ibmi.mortgage.application;

import com.ibmi.mortgage.domain.FormuleAssuranceEnum;
import com.ibmi.mortgage.domain.Projet;

public interface AssuranceGroupeDecision {

	FormuleAssuranceEnum choisir(Projet projet);

}
