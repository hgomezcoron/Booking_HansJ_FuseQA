package com.certificacion.HansJ.app.tasks.booking;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static com.certificacion.HansJ.app.userinterfaces.FlightSearchPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class SelectDepartureAndDestination implements Task {

    private final String departureCity;
    private final String destinationCity;

    public SelectDepartureAndDestination(String departureCity, String destinationCity) {
        this.departureCity = departureCity;
        this.destinationCity = destinationCity;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(DESTINATION_FIELD, isClickable()).forNoMoreThan(10).seconds(),
                Click.on(DESTINATION_FIELD),
                Enter.theValue(destinationCity).into(DESTINATION_FIELD_2).thenHit(Keys.ENTER)
        );
    }

    public static SelectDepartureAndDestination withCities(String departure, String destination) {
        return new SelectDepartureAndDestination(departure, destination);
    }
}
