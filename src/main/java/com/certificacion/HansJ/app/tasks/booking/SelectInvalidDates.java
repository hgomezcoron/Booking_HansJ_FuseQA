package com.certificacion.HansJ.app.tasks.booking;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static com.certificacion.HansJ.app.userinterfaces.FlightSearchPage.*;

public class SelectInvalidDates implements Task {

    private final String departureDate;
    private final String returnDate;

    public SelectInvalidDates(String departureDate, String returnDate) {
        this.departureDate = departureDate;
        this.returnDate = returnDate;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(DEPARTURE_DATE_FIELD),
                Enter.theValue(departureDate).into(DEPARTURE_DATE_FIELD).thenHit(Keys.ENTER),

                Click.on(RETURN_DATE_FIELD),
                Enter.theValue(returnDate).into(RETURN_DATE_FIELD).thenHit(Keys.ENTER)
        );
    }

    public static SelectInvalidDates with(String departureDate, String returnDate) {
        return new SelectInvalidDates(departureDate, returnDate);
    }
}
