package com.certificacion.HansJ.app.questions.booking;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.certificacion.HansJ.app.userinterfaces.FlightSearchPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;


public class FlightAvailable implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(
                WaitUntil.the(SELECT_FLIGHT_BUTTON, isClickable()).forNoMoreThan(40).seconds()
        );
        return SELECT_FLIGHT_BUTTON.resolveFor(actor).isVisible();
    }

    public static FlightAvailable isDisplayed() {
        return new FlightAvailable();
    }
}
