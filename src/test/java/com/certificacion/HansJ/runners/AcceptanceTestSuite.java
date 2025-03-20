package com.certificacion.HansJ.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import org.junit.jupiter.api.BeforeAll;
import org.junit.runner.RunWith;



@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features= {"src/test/resources/features/"},
        glue="com.certificacion.HansJ.stepDefinitions",
        plugin = {"pretty","json:target/cucumber-reports/cucumber.json"},
        tags = "@CheckoutProcess",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class AcceptanceTestSuite {
    @BeforeAll
    public static void setup() {
        OnStage.setTheStage(new Cast());
    }
}
