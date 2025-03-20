package com.certificacion.HansJ.app.tasks.booking;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarFechas implements Task {
    private final String checkInDate;
    private final String checkOutDate;

    public SeleccionarFechas(String checkInDate, String checkOutDate) {
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
    }

    public static SeleccionarFechas con(String checkInDate, String checkOutDate) {
        return instrumented(SeleccionarFechas.class, checkInDate, checkOutDate);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(By.cssSelector("button[data-testid='date-display-field-start']")));
        Target FECHA_CHECKIN = Target.the("Fecha de check-in")
                .located(By.xpath("//span[@data-date='" + checkInDate + "']"));
        BrowseTheWeb.as(actor).waitForPresenceOf("[data-testid='searchbox-datepicker-calendar']");
        actor.attemptsTo(
                Scroll.to(FECHA_CHECKIN),
                MoveMouse.to(FECHA_CHECKIN),
                JavaScriptClick.on(FECHA_CHECKIN)
        );
        Target FECHA_CHECKOUT = Target.the("Fecha de check-out")
                .located(By.xpath("//span[@data-date='" + checkOutDate + "']"));
        actor.attemptsTo(
                Scroll.to(FECHA_CHECKOUT),
                MoveMouse.to(FECHA_CHECKOUT),
                JavaScriptClick.on(FECHA_CHECKOUT)
        );
        actor.attemptsTo(Click.on(By.cssSelector("button[data-testid='date-display-field-end']")));
    }
}
