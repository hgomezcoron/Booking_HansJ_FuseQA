package com.certificacion.HansJ.app.tasks.booking;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchForHotels implements Task {

    private final String city;

    public SearchForHotels(String city) {
        this.city = city;
    }

    public static SearchForHotels inCity(String city) {
        return new SearchForHotels(city);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(city).into(Target.the("search box").located(By.xpath("//input[@name='ss']"))),
                Click.on(Target.the("search button").located(By.xpath("//span[normalize-space()='Search']")))
        );
    }
}
