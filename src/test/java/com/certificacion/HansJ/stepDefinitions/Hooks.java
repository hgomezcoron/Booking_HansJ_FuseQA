package com.certificacion.HansJ.stepDefinitions;

import io.cucumber.java.Before;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;

public class Hooks {
    @Before
    public void setTheStage() {
        OnStage.setTheStage(new Cast());
    }
}
