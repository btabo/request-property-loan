package com.ibmi.mortgage.application.cucumber.it.functional.steps;

import com.ibmi.mortgage.application.AssuranceGroupeDecisionImpl;
import com.ibmi.mortgage.domain.FormuleAssuranceEnum;
import com.ibmi.mortgage.domain.Projet;
import com.ibmi.mortgage.steps.application.cucumber.GenericGlue;
import com.ibmi.mortgage.steps.application.cucumber.it.functional.cucumbermodel.EmprunteursCucumber;
import io.cucumber.java8.En;

import static org.junit.Assert.assertEquals;

public class RecommandationFormuleAssuranceSteps implements En {

    private Projet projet;

    private AssuranceGroupeDecisionImpl assuranceGroupeDecision = new AssuranceGroupeDecisionImpl();

    private GenericGlue<FormuleAssuranceEnum> formuleAssuranceGlue = new GenericGlue<FormuleAssuranceEnum>();

    public RecommandationFormuleAssuranceSteps() {

        Given("un emprunteur avec les caractéristiques suivantes", (EmprunteursCucumber emprunteurs) -> {

            projet = new Projet();
            projet.setEmprunteur(emprunteurs.getAll().get(0).mapToDomain());
        });

        When("On calcule la formule d'assurance groupe recommandé par défaut", () -> {
            formuleAssuranceGlue.exec(() -> assuranceGroupeDecision.choisir(projet));
        });

        Then("^la formule recommandée est \"([^\"]*)\"$", (String libelleFormule) -> {
            FormuleAssuranceEnum formuleAssurance = formuleAssuranceGlue.getResult();
            assertEquals(libelleFormule, formuleAssurance.getLibelleFormule());
        });

    }

}
