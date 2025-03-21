package com.certificacion.HansJ.app.questions.booking;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.thucydides.core.webdriver.SerenityWebdriverManager;
import org.openqa.selenium.WebDriver;

public class TheHotelURL implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        WebDriver driver = SerenityWebdriverManager.inThisTestThread().getCurrentDriver();
        return driver.getCurrentUrl().contains("hotel");
    }

    public static TheHotelURL isCorrect() {
        return new TheHotelURL();
    }
}
