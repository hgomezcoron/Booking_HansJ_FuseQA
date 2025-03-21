package com.certificacion.HansJ.app.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FlightBookingPage {

    public static final Target ROUND_TRIP_OPTION = Target.the("Round-trip option")
            .located(By.xpath("//div[@data-ui-name='search_type_roundtrip']"));

    public static final Target DATE_FIELD = Target.the("Return date field")
            .located(By.xpath("//button[@placeholder='Depart – Return']"));

    public static final Target RETURN_DATE_FIELD = Target.the("Return date field")
            .located(By.xpath("//button[@placeholder='Depart – Return']"));
}
