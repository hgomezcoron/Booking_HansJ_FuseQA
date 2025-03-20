package com.certificacion.HansJ.app.questions.booking;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class LoginSuccess  implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return true;
    }

    public static LoginSuccess isDisplayed() {
        return new LoginSuccess();
    }
}
