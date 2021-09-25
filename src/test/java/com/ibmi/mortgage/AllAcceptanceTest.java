package com.ibmi.mortgage;

import com.ibmi.mortgage.application.cucumber.it.functional.CucumberConfiguration;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.spring.CucumberContextConfiguration;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "json:target/cucumber/report.json", "html:target/cucumber/report.html"},
        glue = {"com.ibmi.mortgage"},
        features = {"src/test/resources/features"})
@ContextConfiguration(classes = {CucumberConfiguration.class})
@CucumberContextConfiguration
public class AllAcceptanceTest {
}
