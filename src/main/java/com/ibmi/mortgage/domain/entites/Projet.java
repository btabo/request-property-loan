package com.ibmi.mortgage.domain.entites;


import lombok.Builder;
import lombok.Getter;

@Getter @Builder
public class Projet {

	private AchatImmobilier achatImmobilier;
	private Emprunteur emprunteur;

}
