package com.certificacion.HansJ.app.tasks.booking;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.thucydides.core.webdriver.SerenityWebdriverManager;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SwitchToNewTab implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver = SerenityWebdriverManager.inThisTestThread().getCurrentDriver();
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
    }

    public static SwitchToNewTab now() {
        return instrumented(SwitchToNewTab.class);
    }
}
