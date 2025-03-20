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

    public static final Target SEARCH_BUTTON = Target.the("Search button")
            .located(By.cssSelector("button[type='submit']"));

    public static final Target FILTER_GUEST_RATING = Target.the("Guest Rating 8+ filter")
            .located(By.xpath("//div[contains(@data-filters-group, 'review_score')]//span[contains(text(), '8+')]"));

    public static final Target SORT_LOWEST_PRICE = Target.the("Sort by lowest price")
            .located(By.xpath("//button[contains(@aria-label, 'Lowest Price')]"));
}
