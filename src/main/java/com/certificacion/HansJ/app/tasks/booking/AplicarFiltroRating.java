package com.certificacion.HansJ.app.tasks.booking;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.certificacion.HansJ.app.userinterfaces.BookingHomePage.*;
import static com.certificacion.HansJ.app.userinterfaces.CheckoutPage.PROCEED_TO_CHECKOUT_SELECT_BUTTON;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AplicarFiltroRating implements Task {

    public static AplicarFiltroRating de8OMas() {
        return new AplicarFiltroRating();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(FILTER_VERY_GOOD),
                MoveMouse.to(FILTER_VERY_GOOD),
                Click.on(FILTER_VERY_GOOD),
                WaitUntil.the(FILTER_VERY_GOOD_HEADER, isVisible()).forNoMoreThan(15).seconds(),
                Scroll.to(FILTER_VERY_GOOD_HEADER)
        );
    }
}
