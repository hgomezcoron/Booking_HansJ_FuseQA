package com.certificacion.HansJ.app.tasks.booking;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class NavigateTo implements Task {

    private static final String FLIGHT_BOOKING_URL = "https://www.booking.com/flights/index.html";

    @Override
    @Step("{0} navigates to the flight booking page")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.url(FLIGHT_BOOKING_URL)
        );
    }

    public static NavigateTo flightBookingPage() {
        return instrumented(NavigateTo.class);
    }
}
