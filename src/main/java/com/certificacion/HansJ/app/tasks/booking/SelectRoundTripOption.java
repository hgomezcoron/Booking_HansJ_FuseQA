package com.certificacion.HansJ.app.tasks.booking;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static com.certificacion.HansJ.app.userinterfaces.FlightBookingPage.ROUND_TRIP_OPTION;
import static com.certificacion.HansJ.app.userinterfaces.FlightBookingPage.DATE_FIELD;

import static com.certificacion.HansJ.app.userinterfaces.FlightBookingPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectRoundTripOption implements Task {
    @Override
    @Step("{0} selects the round-trip option")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ROUND_TRIP_OPTION),
                Click.on(DATE_FIELD)
        );
    }

    public static SelectRoundTripOption roundTrip() {
        return instrumented(SelectRoundTripOption.class);
    }
}
