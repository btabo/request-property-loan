package com.ibmi.mortgage.application.cucumber.it.functional.steps;

import com.ibmi.mortgage.application.AssuranceGroupeDecisionImpl;
import com.ibmi.mortgage.application.cucumber.it.functional.GenericGlue;
import com.ibmi.mortgage.application.cucumber.it.functional.model.EmprunteurCucumber;
import com.ibmi.mortgage.domain.entites.Projet;
import com.ibmi.mortgage.domain.enums.FormuleAssuranceEnum;
import io.cucumber.datatable.DataTable;
import io.cucumber.java8.En;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class RecommandationFormuleAssuranceSteps implements En {

    private Projet projet;

    private AssuranceGroupeDecisionImpl assuranceGroupeDecision = new AssuranceGroupeDecisionImpl();

    private GenericGlue<FormuleAssuranceEnum> formuleAssuranceGlue = new GenericGlue<>();

    public RecommandationFormuleAssuranceSteps() {

        Given("un emprunteur avec les caractéristiques suivantes", (DataTable data) -> {
            List<EmprunteurCucumber> cucu = data.asList(EmprunteurCucumber.class);
            projet = Projet.builder()
                    .emprunteur(cucu.get(0).mapToDomain())
                    .build();
        });

        When("On calcule la formule d'assurance groupe recommandée", () -> {
            formuleAssuranceGlue.exec(() -> assuranceGroupeDecision.choisir(projet));
        });

        Then("^la formule recommandée est \"([^\"]*)\"$", (String libelleFormule) -> {
            FormuleAssuranceEnum formuleAssurance = formuleAssuranceGlue.getResult();
            assertEquals(libelleFormule, formuleAssurance.getLibelleFormule());
        });

    }

}
