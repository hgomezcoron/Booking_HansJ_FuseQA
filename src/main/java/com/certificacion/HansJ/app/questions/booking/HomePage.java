package com.certificacion.HansJ.app.questions.booking;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class HomePage  implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return true;
    }

    public static HomePage isDisplayed() {
        return new HomePage();
    }
}
