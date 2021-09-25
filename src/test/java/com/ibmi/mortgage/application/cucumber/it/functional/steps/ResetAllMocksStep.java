package com.ibmi.mortgage.application.cucumber.it.functional.steps;


import com.ibmi.mortgage.application.cucumber.it.functional.CucumberConfiguration;
import io.cucumber.java8.En;

import static org.mockito.internal.util.MockUtil.resetMock;

public class ResetAllMocksStep implements En {

    public ResetAllMocksStep() {

        Before(() -> {
            resetMock(CucumberConfiguration.emprunteurRepositoryMock);
        });

    }
}
