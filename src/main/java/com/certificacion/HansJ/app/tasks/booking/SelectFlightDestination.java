package com.certificacion.HansJ.app.tasks.booking;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.certificacion.HansJ.app.userinterfaces.FlightSearchPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class SelectFlightDestination implements Task {


    public SelectFlightDestination() {

    }

    public static SelectFlightDestination fromTo() {
        return new SelectFlightDestination();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SELECT_DESTINATION_CITY),
                Click.on(SEARCH_FLIGHTS_BUTTON)
        );
    }
}
