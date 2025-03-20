package com.certificacion.HansJ.app.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FlightResultsPage {

    public static final Target FLIGHT_LIST = Target.the("List of available flights")
            .located(By.xpath("//div[contains(@class, 'flight-results')]"));
}
