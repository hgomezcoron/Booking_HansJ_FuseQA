package com.certificacion.HansJ.app.tasks.booking;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.certificacion.HansJ.app.userinterfaces.BookingHomePage.IGNORE_LOGIN_BUTTON;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class IgnorarLogin implements Task {

    public IgnorarLogin() {
    }

    public static IgnorarLogin button() {
        return new IgnorarLogin();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try{
            actor.attemptsTo(
                    WaitUntil.the(IGNORE_LOGIN_BUTTON, isVisible()).forNoMoreThan(15).seconds(),
                    Click.on(IGNORE_LOGIN_BUTTON)
            );
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
