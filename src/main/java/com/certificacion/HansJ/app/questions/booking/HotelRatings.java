package com.certificacion.HansJ.app.questions.booking;

import net.serenitybdd.screenplay.Question;
import org.openqa.selenium.By;

import java.util.List;
import java.util.stream.Collectors;

import static net.serenitybdd.screenplay.abilities.BrowseTheWeb.as;

public class HotelRatings {
    public static Question<List<Double>> displayed() {
        return actor -> as(actor).findAll(By.cssSelector(".hotel-rating")).stream()
                .map(element -> Double.parseDouble(element.getText()))
                .collect(Collectors.toList());
    }
}
