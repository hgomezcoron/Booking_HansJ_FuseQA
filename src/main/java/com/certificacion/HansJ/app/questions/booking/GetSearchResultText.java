package com.certificacion.HansJ.app.questions.booking;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static com.certificacion.HansJ.app.userinterfaces.BookingHomePage.*;

public class GetSearchResultText implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(RESULT_SEARCH_GET).answeredBy(actor);
    }

    public static GetSearchResultText value() {
        return new GetSearchResultText();
    }
}
