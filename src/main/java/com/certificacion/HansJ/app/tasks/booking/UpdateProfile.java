package com.certificacion.HansJ.app.tasks.booking;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.certificacion.HansJ.app.userinterfaces.DashboardPage.*;

public class UpdateProfile implements Task {
    private final String phoneNumber;

    public UpdateProfile(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(PROFILE_ICON),
                Click.on(ACCOUNT_DETAILS)
        );
    }

    public static UpdateProfile withPhoneNumber(String phoneNumber) {
        return new UpdateProfile(phoneNumber);
    }
}
