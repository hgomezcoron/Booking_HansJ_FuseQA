package com.certificacion.HansJ.app.tasks.booking;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.certificacion.HansJ.app.userinterfaces.CheckoutPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class ProceedToCheckout implements Task {
    public static ProceedToCheckout now() {
        return new ProceedToCheckout();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(PROCEED_TO_CHECKOUT_SELECT_BUTTON),
                WaitUntil.the(PROCEED_TO_CHECKOUT_SELECT_BUTTON, isClickable()).forNoMoreThan(15).seconds(),

                Click.on(PROCEED_TO_CHECKOUT_SELECT_BUTTON)
        );
    }
}
