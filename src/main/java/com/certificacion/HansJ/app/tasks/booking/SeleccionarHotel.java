package com.certificacion.HansJ.app.tasks.booking;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.Set;

import static com.certificacion.HansJ.app.userinterfaces.HotelSearchResultsPage.HOTEL_LISTING;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SeleccionarHotel implements Task {

    @Override
    @Step("Seleccionar el primer hotel de la lista y cambiar a la nueva pestaña")
    public <T extends Actor> void performAs(T actor) {
        String mainWindow = actor.recall("MAIN_WINDOW");

        actor.attemptsTo(
                WaitUntil.the(HOTEL_LISTING, isVisible()).forNoMoreThan(15).seconds(),
                Click.on(HOTEL_LISTING)
        );
        Set<String> ventanas = actor.usingAbilityTo(net.serenitybdd.screenplay.abilities.BrowseTheWeb.class)
                .getDriver()
                .getWindowHandles();

        for (String ventana : ventanas) {
            if (!ventana.equals(mainWindow)) {
                actor.attemptsTo(Switch.toWindow(ventana));
                break;
            }
        }
    }

    public static SeleccionarHotel enResultados() {
        return new SeleccionarHotel();
    }
}
