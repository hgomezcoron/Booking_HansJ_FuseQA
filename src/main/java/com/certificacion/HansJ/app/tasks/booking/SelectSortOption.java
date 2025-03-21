package com.certificacion.HansJ.app.tasks.booking;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.certificacion.HansJ.app.userinterfaces.BookingHomePage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectSortOption implements Task {

    @Override
    @Step("{0} selects sorting option 'Price (lowest first)'")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SORT_DROPDOWN),
                Click.on(PRICE_LOWEST_FIRST)
        );
    }

    public static SelectSortOption byPriceLowestFirst() {
        return instrumented(SelectSortOption.class);
    }

}
