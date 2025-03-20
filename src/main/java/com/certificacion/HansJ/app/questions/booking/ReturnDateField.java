package com.certificacion.HansJ.app.questions.booking;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ReturnDateField implements Question<Boolean> {

    private static final Target RETURN_DATE_FIELD = Target.the("return date field")
            .located(By.cssSelector("button[placeholder='Depart – Return'] div[class='ShellButton-module__inner___ruIE+'] span[class='Text-module__root--variant-body_2___wDAbl']"));

    @Override
    public Boolean answeredBy(Actor actor) {
        return RETURN_DATE_FIELD.resolveFor(actor).isEnabled();
    }

    public static ReturnDateField isEnabled() {
        return new ReturnDateField();
    }
}
