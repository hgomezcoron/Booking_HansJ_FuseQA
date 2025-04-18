package com.certificacion.HansJ.app.tasks.booking;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.certificacion.HansJ.app.userinterfaces.FlightSearchPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class SelectOneWay implements Task {

    public SelectOneWay() {
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(CALENDAR_FLIGHT, isClickable()).forNoMoreThan(10).seconds(),
                Click.on(CALENDAR_FLIGHT)
        );
    }

    public static SelectOneWay withoutDestination() {
        return new SelectOneWay();
    }
}
