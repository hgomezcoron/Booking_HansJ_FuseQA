package com.certificacion.HansJ.app.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class HotelSearchResultsPage {

    public static final Target HOTEL_LISTING = Target.the("Hotel listing link")
            .locatedBy("(//div[contains(@data-testid,'title')])[4]");

    public static final Target NEW_TAB_INDICATOR = Target.the("Indicador de nueva pestaña")
            .locatedBy("//body");

}
