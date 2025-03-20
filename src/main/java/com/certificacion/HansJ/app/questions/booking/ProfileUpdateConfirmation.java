package com.certificacion.HansJ.app.questions.booking;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ProfileUpdateConfirmation   implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return true;
    }

    public static ProfileUpdateConfirmation isDisplayed() {
        return new ProfileUpdateConfirmation();
    }
}
