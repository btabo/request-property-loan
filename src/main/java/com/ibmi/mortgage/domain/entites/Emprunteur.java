package com.ibmi.mortgage.domain.entites;

import com.ibmi.mortgage.domain.enums.StatutProfessonnelEnum;
import com.ibmi.mortgage.domain.vo.Csp;
import lombok.Builder;
import lombok.Getter;

@Getter @Builder
public class Emprunteur {

	private int age;
	private Csp csp;
	private StatutProfessonnelEnum statutPro;

}
