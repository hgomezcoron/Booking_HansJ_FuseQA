package com.certificacion.HansJ.app.questions.booking;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.certificacion.HansJ.app.userinterfaces.BookingHomePage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;


public class HotelResultFilter implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(
                WaitUntil.the(LABEL_REVIEW_SCORE, isClickable()).forNoMoreThan(10).seconds()
        );
        return LABEL_REVIEW_SCORE.resolveFor(actor).isVisible();
    }

    public static HotelResultFilter isDisplayed() {
        return new HotelResultFilter();
    }
}
