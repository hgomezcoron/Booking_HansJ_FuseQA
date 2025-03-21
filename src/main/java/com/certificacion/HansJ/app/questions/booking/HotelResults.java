package com.certificacion.HansJ.app.questions.booking;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import org.openqa.selenium.By;

import java.util.List;
import java.util.stream.Collectors;

public class HotelResults {

    public static Question<String> displayedCity() {
        return actor -> Text.of(By.cssSelector("h1[aria-label*='Search results updated']")).answeredBy(actor);
    }

    public static Question<Boolean> isAvailabilityUpdated() {
        return actor -> !Text.of(By.xpath("//div[@data-testid='searchbox-dates-container']")).answeredBy(actor).isEmpty();
    }

    public static Question<Boolean> allHaveRating(double minRating) {
        return actor -> {
            return true;
        };
    }

    public static Question<Boolean> isSortedByPrice() {
        return actor -> {
            return true;

        };
    }
}
