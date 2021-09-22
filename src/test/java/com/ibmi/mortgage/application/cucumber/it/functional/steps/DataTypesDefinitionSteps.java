package com.ibmi.mortgage.application.cucumber.it.functional.steps;

import com.ibmi.mortgage.application.cucumber.it.functional.model.EmprunteurCucumber;
import io.cucumber.java8.En;

import java.util.Map;

public class DataTypesDefinitionSteps implements En {

    public DataTypesDefinitionSteps() {

        DataTableType((Map<String, String> entry) -> new EmprunteurCucumber(
                Integer.parseInt(entry.get("age")),
                Integer.parseInt(entry.get("CSP")),
                entry.get("statutProfessionnel")
        ));

    }

}
