package com.certificacion.HansJ.app.tasks.booking;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.certificacion.HansJ.app.userinterfaces.FlightSearchPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class SelectFlight implements Task {


    public SelectFlight() {

    }

    public static SelectFlight fromTo() {
        return new SelectFlight();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SELECT_DESTINATION_CITY),
                Click.on(SEARCH_FLIGHTS_BUTTON),
                WaitUntil.the(SELECT_FLIGHT_BUTTON, isClickable()).forNoMoreThan(40).seconds(),
                Click.on(SELECT_FLIGHT_BUTTON)
        );
    }
}
