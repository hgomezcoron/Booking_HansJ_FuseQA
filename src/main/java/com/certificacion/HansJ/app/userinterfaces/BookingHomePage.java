package com.certificacion.HansJ.app.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BookingHomePage {
    public static final Target INPUT_DESTINATION = Target.the("Search input field")
            .located(By.cssSelector("input[name='ss']"));

    public static final Target CHECK_IN_DATE = Target.the("Check-in date picker")
            .located(By.cssSelector("button[data-testid='date-display-field-start']"));

    public static final Target CHECK_OUT_DATE = Target.the("Check-out date picker")
            .located(By.cssSelector("button[data-testid='date-display-field-end']"));

    public static final Target DIV_MAIN = Target.the("Refres site")
            .located(By.cssSelector("//div[@data-capla-component-boundary='b-search-web-searchresults/SearchResultsDesktop']"));

    public static final Target SEARCH_BUTTON = Target.the("Search button")
            .located(By.cssSelector("button[type='submit']"));

    public static final Target IGNORE_LOGIN_BUTTON = Target.the("ignore login button")
            .located(By.xpath("//button[contains(@aria-label, 'Dismiss')]"));

    public static final Target LABEL_REVIEW_SCORE = Target.the("Very Good 8+ filter")
            .located(By.xpath("//button[@aria-label='Very Good: 8+']"));

    public static final Target PRICE_LOWEST_FIRST_RESULT = Target.the("Very Good 8+ filter")
            .located(By.xpath("(//button[contains(@data-selected-sorter,'price')])"));

    public static final Target FILTER_VERY_GOOD = Target.the("Very Good 8+ filter")
            .located(By.cssSelector("input[name='review_score=80']"));

    public static final Target FILTER_VERY_GOOD_HEADER = Target.the("Very Good 8+ filter")
            .located(By.cssSelector("button[aria-label='Very Good: 8+'] span[class='cac967781c']"));

    public static final Target SORT_LOWEST_PRICE = Target.the("Sort by lowest price")
            .located(By.xpath("//button[contains(@aria-label, 'Lowest Price')]"));


    public static final Target SORT_DROPDOWN = Target.the("Sort by dropdown")
            .located(By.xpath("//button[@data-testid='sorters-dropdown-trigger']"));

    public static final Target PRICE_LOWEST_FIRST = Target.the("Price (lowest first) option")
            .located(By.xpath("//span[contains(text(), 'Price (lowest first)')]"));

    public static final Target RESULT_SEARCH_GET = Target.the("Price (lowest first) option")
            .located(By.xpath("//h1[contains(text(), 'properties found')]"));

    // Campo de fecha de salida
    public static final Target DEPARTURE_DATE = Target.the("Departure date field")
            .locatedBy("//input[@name='flights-search-departure-date']");

    // Campo de fecha de regreso
    public static final Target RETURN_DATE = Target.the("Return date field")
            .locatedBy("//input[@name='flights-search-return-date']");

}
