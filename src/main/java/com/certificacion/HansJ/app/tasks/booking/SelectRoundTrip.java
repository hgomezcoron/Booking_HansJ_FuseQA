package com.certificacion.HansJ.app.tasks.booking;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectRoundTrip implements Task {

    private static final Target ROUND_TRIP_OPTION = Target.the("round-trip option")
            .located(By.id("round-trip-radio-button"));

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ROUND_TRIP_OPTION));
    }

    public static SelectRoundTrip option() {
        return instrumented(SelectRoundTrip.class);
    }
}
