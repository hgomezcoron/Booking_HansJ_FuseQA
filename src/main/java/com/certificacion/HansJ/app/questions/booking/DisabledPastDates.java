package com.certificacion.HansJ.app.questions.booking;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Presence;
import net.serenitybdd.screenplay.targets.Target;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DisabledPastDates implements Question<Boolean> {
    private static final Target DISABLED_DATES = Target.the("Disabled dates in calendar")
            .locatedBy("//td[contains(@class, 'bui-calendar__date--disabled')]");

    private static final Target ALL_DATES = Target.the("All dates in calendar")
            .locatedBy("//td[@data-date]");

    @Override
    public Boolean answeredBy(Actor actor) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate today = LocalDate.now();
        boolean hasDisabledDates = Presence.of(DISABLED_DATES).answeredBy(actor);
        return hasDisabledDates && ALL_DATES.resolveAllFor(actor).stream()
                .anyMatch(element -> {
                    String dateValue = element.getAttribute("data-date");
                    LocalDate date = LocalDate.parse(dateValue, formatter);
                    return date.isBefore(today) &&
                            element.getAttribute("class").contains("bui-calendar__date--disabled");
                });
    }

    public static Question<Boolean> arePastDatesDisabled() {
        return new DisabledPastDates();
    }
}
