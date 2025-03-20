package com.certificacion.HansJ.app.tasks.booking;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.certificacion.HansJ.app.userinterfaces.BookingHomePage.*;

public class OrdenarPorPrecio implements Task {
    public static OrdenarPorPrecio menorAMayor() {
        return new OrdenarPorPrecio();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

    }
}
