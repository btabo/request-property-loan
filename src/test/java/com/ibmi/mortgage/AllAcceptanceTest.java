package com.ibmi.mortgage;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.spring.CucumberContextConfiguration;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty", "json:target/cucumber/report.json", "html:target/cucumber/report.html" }, glue = {
		"com.ibmi.mortgage" }, features = { "src/test/resources/features" })
//@ContextConfiguration(classes = { RepositoryConfiguration.class })
@CucumberContextConfiguration
public class AllAcceptanceTest {
}
