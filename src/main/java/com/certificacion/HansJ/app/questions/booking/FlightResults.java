package com.certificacion.HansJ.app.questions.booking;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;

import static com.certificacion.HansJ.app.userinterfaces.FlightResultsPage.*;

public class FlightResults implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return true;
    }

    public static Question<Boolean> areDisplayed() {
        return new FlightResults();
    }
}
