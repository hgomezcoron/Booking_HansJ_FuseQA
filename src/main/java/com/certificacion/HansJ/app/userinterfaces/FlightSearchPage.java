package com.certificacion.HansJ.app.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FlightSearchPage {

    public static final Target DEPARTURE_FIELD = Target.the("Departure city field")
            .located(By.cssSelector("div[class='Stack-module__root___FsKZM Stack-module__root--direction-column___-BYrY Stack-module__root--grow-false___YHki0'] div:nth-child(1) div:nth-child(1) div:nth-child(1) div:nth-child(1) div:nth-child(1) button:nth-child(1)"));

    public static final Target DESTINATION_FIELD = Target.the("Destination city field")
            .located(By.cssSelector(".ShellButton-module__btn___lMwQM[tabindex='0'][data-ui-name='input_location_to_segment_0']"));
    public static final Target DESTINATION_FIELD_2 = Target.the("Destination city field")
            .located(By.xpath("//input[@placeholder='Airport or city']"));

    public static final Target SEARCH_BUTTON = Target.the("Search flights button")
            .located(By.cssSelector(".Actionable-module__root___rChq9.Button-module__root___-8vjy.Button-module__root--variant-primary___rcbQm.Button-module__root--size-medium___CZwSD.Button-module__root--variant-primary-action___5oXvD.Submit-module__cta___kjj9T.undefined"));

    public static final Target DEPARTURE_DATE_FIELD = Target.the("Departure date field")
            .located(By.id("departure-date"));

    public static final Target RETURN_DATE_FIELD = Target.the("Return date field")
            .located(By.id("return-date"));

    public static final Target ERROR_MESSAGE = Target.the("Invalid date range error message")
            .located(By.xpath("//div[@class='error-message']"));


    public static final Target DEPARTURE_CITY_FIELD = Target.the("Departure city input field")
            .located(By.id("origin"));

    public static final Target DESTINATION_CITY_FIELD = Target.the("Destination city input field")
            .located(By.id("destination"));

    public static final Target SELECT_DESTINATION_CITY = Target.the("Search flights button")
            .located(By.cssSelector("svg[xmlns='http://www.w3.org/2000/svg'][viewBox='0 0 128 128']"));

    public static final Target SEARCH_FLIGHTS_BUTTON = Target.the("Search flights button")
            .located(By.xpath("//span[@class='Button-module__text___NUJeL']"));

    public static final Target SELECT_FLIGHT_BUTTON = Target.the("Select flight button")
            .located(By.cssSelector("div[id='flight-card-0'] div[class='Box-module__root___Dj3jf Box-module__root--background-color-elevation_one___J6Sm7 Box-module__root--border-color-neutral_alt___wIgcx Box-module__root--border-width-100___joDs8 Box-module__root--border-radius-200___ODQzI Box-module__root--overflow-hidden___CJrC+'] div[class='Frame-module__flex-direction_row___xHVKZ Frame-module__padding_4___mVTBX'] div[class='Frame-module__justify-content_center___dZBwL Frame-module__flex-direction_column___ms2of FlightCardBound-desktop-module__priceBlock___TYtyY'] div button[aria-label='View details Flexible ticket upgrade available'] span[class='Button-module__text___NUJeL']"));

    public static final Target SELECT_ONE_WAY = Target.the("Select flight button")
            .located(By.cssSelector("//label[@for='search_type_option_ONEWAY']"));

    public static final Target CALENDAR_FLIGHT = Target.the("Select flight button")
            .located(By.xpath("//button[@placeholder='Depart – Return']"));
}
