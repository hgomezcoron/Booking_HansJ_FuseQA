package com.certificacion.HansJ.app.tasks.booking;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ApplyGuestRatingFilter implements Task {

    private final String filter;

    public ApplyGuestRatingFilter(String filter) {
        this.filter = filter;
    }

    public static ApplyGuestRatingFilter withName(String filter) {
        return new ApplyGuestRatingFilter(filter);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(Target.the("Guest Rating 8+ filter").located(By.xpath("//span[contains(text(), '" + filter + "')]")))
        );
    }
}
