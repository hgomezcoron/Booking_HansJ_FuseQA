package com.certificacion.HansJ.app.questions.booking;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.certificacion.HansJ.app.userinterfaces.LoginPage.*;

public class LoginErrorMessage implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return ERROR_MESSAGE.resolveFor(actor).isVisible();
    }

    public static LoginErrorMessage isDisplayed() {
        return new LoginErrorMessage();
    }
}
