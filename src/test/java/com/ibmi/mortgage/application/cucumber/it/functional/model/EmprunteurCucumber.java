package com.ibmi.mortgage.application.cucumber.it.functional.model;

import com.ibmi.mortgage.domain.entites.Emprunteur;
import com.ibmi.mortgage.domain.enums.StatutProfessonnelEnum;
import com.ibmi.mortgage.domain.vo.Csp;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class EmprunteurCucumber {
    private int age;
    private int csp;
    private String statutProfessionnel;

    public EmprunteurCucumber(int age, int csp, String statutProfessionnel) {
        super();
        this.age = age;
        this.csp = csp;
        this.statutProfessionnel = statutProfessionnel;
    }

    public Emprunteur mapToDomain() {
        return Emprunteur.builder()
                .age(this.age)
                .csp(new Csp(this.csp))
                .statutPro(StatutProfessonnelEnum.valueOf(this.statutProfessionnel))
                .build();
    }
}
