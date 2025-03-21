package com.certificacion.HansJ.app.tasks.booking;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.certificacion.HansJ.app.userinterfaces.FlightBookingPage.DATE_FIELD;
import static com.certificacion.HansJ.app.userinterfaces.FlightSearchPage.SEARCH_FLIGHTS_BUTTON;
import static com.certificacion.HansJ.app.userinterfaces.FlightSearchPage.SELECT_DESTINATION_CITY;

public class Entering implements Task {


    public Entering() {

    }

    public static Entering fromTo() {
        return new Entering();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SELECT_DESTINATION_CITY),
                Click.on(DATE_FIELD)
        );
    }
}
