package com.certificacion.HansJ.app.tasks.booking;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.certificacion.HansJ.app.userinterfaces.BookingHomePage.*;

public class AplicarFiltroRating implements Task {

    public static AplicarFiltroRating de8OMas() {
        return new AplicarFiltroRating();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(FILTER_GUEST_RATING)
        );
    }
}
