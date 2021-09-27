package com.ibmi.mortgage.application.cucumber.it.functional.steps;

import com.ibmi.mortgage.application.AssuranceGroupeDecision;
import com.ibmi.mortgage.application.cucumber.it.functional.GenericGlue;
import com.ibmi.mortgage.application.cucumber.it.functional.model.EmprunteurCucumber;
import com.ibmi.mortgage.domain.entites.Emprunteur;
import com.ibmi.mortgage.domain.enums.FormuleAssuranceEnum;
import io.cucumber.datatable.DataTable;
import io.cucumber.java8.En;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static java.util.Optional.ofNullable;
import static org.junit.Assert.assertEquals;

public class RecommandationFormuleAssuranceSteps implements En {

    private Emprunteur emprunteur;

    @Autowired
    private AssuranceGroupeDecision assuranceGroupeDecision;

    private GenericGlue<FormuleAssuranceEnum> formuleAssuranceGlue = new GenericGlue<>();

    public RecommandationFormuleAssuranceSteps() {

        Given("un emprunteur avec les caractéristiques suivantes", (DataTable data) -> {
            List<EmprunteurCucumber> cucu = data.asList(EmprunteurCucumber.class);
            emprunteur = cucu.get(0).mapToDomain();
        });

        When("On calcule la formule d'assurance groupe recommandée", () -> {
            formuleAssuranceGlue.exec(() -> assuranceGroupeDecision.choisir(emprunteur));
        });

        Then("^la formule recommandée est \"([^\"]*)\"$", (String libelleFormule) -> {
            FormuleAssuranceEnum formuleAssurance = formuleAssuranceGlue.getResult();
            assertEquals(libelleFormule, ofNullable(formuleAssurance).map(FormuleAssuranceEnum::getLibelleFormule).orElse(null));
        });

    }

}
