package com.certificacion.HansJ.app.questions.booking;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.certificacion.HansJ.app.userinterfaces.BookingHomePage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;


public class HotelResultPrice implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(
                WaitUntil.the(PRICE_LOWEST_FIRST_RESULT, isClickable()).forNoMoreThan(10).seconds()
        );
        return PRICE_LOWEST_FIRST_RESULT.resolveFor(actor).isVisible();
    }

    public static HotelResultPrice isDisplayed() {
        return new HotelResultPrice();
    }
}
