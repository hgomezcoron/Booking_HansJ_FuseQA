package com.certificacion.HansJ.app.questions.booking;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.certificacion.HansJ.app.userinterfaces.HotelDetailsPage.*;

public class TheHotelDetailsPage implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return HOTEL_NAME.resolveFor(actor).isVisible();
                //&&HOTEL_LOCATION.resolveFor(actor).isVisible();
    }

    public static TheHotelDetailsPage isDisplayed() {
        return new TheHotelDetailsPage();
    }
}
