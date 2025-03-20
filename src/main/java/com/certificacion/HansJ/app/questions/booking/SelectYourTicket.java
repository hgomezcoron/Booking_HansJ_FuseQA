package com.certificacion.HansJ.app.questions.booking;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.certificacion.HansJ.app.userinterfaces.CheckoutPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;


public class SelectYourTicket implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(
                WaitUntil.the(SELECT_YOUR_TICKET, isClickable()).forNoMoreThan(40).seconds()
        );
        return SELECT_YOUR_TICKET.resolveFor(actor).isVisible();
    }

    public static SelectYourTicket isDisplayed() {
        return new SelectYourTicket();
    }
}
