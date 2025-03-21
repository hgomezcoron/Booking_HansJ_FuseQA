package com.certificacion.HansJ.app.questions.booking;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class ErrorMessage implements Question<Boolean> {

    private static final Target ERROR_MESSAGE = Target.the("Mensaje de error por fecha inválida")
            .locatedBy("//div[contains(@class, 'error-message')]"); // Ajustar el XPath según la página

    @Override
    public Boolean answeredBy(Actor actor) {
        return ERROR_MESSAGE.resolveFor(actor).isVisible();
    }

    public static Question<Boolean> isDisplayed() {
        return new ErrorMessage();
    }
}
