package com.certificacion.HansJ.app.tasks.booking;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;

import static com.certificacion.HansJ.app.userinterfaces.BookingHomePage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarFecha implements Task {

    private final String fecha;
    private final Target campoFecha;

    public SeleccionarFecha(String fecha, Target campoFecha) {
        this.fecha = fecha;
        this.campoFecha = campoFecha;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(campoFecha),
                Enter.theValue(fecha).into(campoFecha)
        );
    }

    public static SeleccionarFecha deSalida(String fecha) {
        return instrumented(SeleccionarFecha.class, fecha, DEPARTURE_DATE);
    }

    public static SeleccionarFecha deRegreso(String fecha) {
        return instrumented(SeleccionarFecha.class, fecha, RETURN_DATE);
    }


}
