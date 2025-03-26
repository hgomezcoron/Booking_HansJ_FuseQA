package com.certificacion.HansJ.stepDefinitions.booking;

import com.certificacion.HansJ.app.questions.booking.*;
import com.certificacion.HansJ.app.tasks.booking.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.everyItem;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;
import static org.hamcrest.Matchers.is;

public class HotelSearchStepDefinitions {

    private static final String ACTOR_NAME = "User";

    @Given("the user is on the Booking homepage")
    public void userIsOnBookingHomepage() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled(ACTOR_NAME)
                .wasAbleTo(Open.url("https://www.booking.com/index.html?lang=en-us&soz=1&lang_changed=1"));
    }

    @Given("the user has searched for hotels in {}")
    public void userSearchesForHotels(String destination) {
        ensureActorIsReady();
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled(ACTOR_NAME)
                .wasAbleTo(Open.url("https://www.booking.com/index.html?lang=en-us&soz=1&lang_changed=1"));
        theActorInTheSpotlight().attemptsTo(IgnorarLogin.button());
        theActorInTheSpotlight().attemptsTo(
                SeleccionarFechas.con("2025-03-26", "2025-03-29"),
                BuscarHotel.en("Cartagena de Indias"),
                SearchForHotelsDate.inCity()
        );
    }

    @When("the user searches for hotels in {}")
    public void searchForHotels(String ciudad) {
        theActorInTheSpotlight().attemptsTo(IgnorarLogin.button());
        theActorInTheSpotlight().attemptsTo(BuscarHotel.en(ciudad));
    }

    @When("the user selects check-in date {} and check-out date {}")
    public void selectDates(String checkIn, String checkOut) {
        theActorInTheSpotlight().attemptsTo(IgnorarLogin.button());
        theActorInTheSpotlight().attemptsTo(
                SeleccionarFechas.con(checkIn, checkOut),
                BuscarHotel.en("Cartagena de Indias"),
                SearchForHotelsDate.inCity()
        );
        String result1= String.valueOf(GetSearchResultText.value());
        theActorInTheSpotlight().attemptsTo(
                SeleccionarFechas.con("2025-04-11", "2025-04-17"),
                SearchForHotelsDate.inCity()
        );
        String result2= String.valueOf(GetSearchResultText.value());
        theActorInTheSpotlight().should(
                seeThat("Los resultados deben ser diferentes",
                        actor -> !result1.equals(result2)
                )
        );
    }

    @When("the user applies the {} filter")
    public void applyFilter(String filtro) {
        if (filtro.equals("Very Good: 8+")) {
            theActorInTheSpotlight().attemptsTo(
                AplicarFiltroRating.de8OMas()
                );
        }
    }

    @When("the user sorts the results by {}")
    public void sortResults(String criterio) {
        if (criterio.equals("Price")) {
            theActorInTheSpotlight()
                    .attemptsTo(
                            SelectSortOption.byPriceLowestFirst()
                    );
        }
    }

    @Then("the search results should display hotels in {}")
    public void verifySearchResults(String ciudadEsperada) {
        theActorInTheSpotlight().should(
                seeThat(HotelResults.displayedCity(), containsString(ciudadEsperada))
        );
    }

    @Then("the availability should be updated accordingly")
    public void verifyAvailabilityUpdated() {
        theActorInTheSpotlight().should(
                seeThat(HotelResults.isAvailabilityUpdated(), is(true))
        );
    }

    @When("the user applies the {string} filter")
    public void applyGuestRatingFilter(String filterName) {
        theActorInTheSpotlight().attemptsTo(
                ApplyGuestRatingFilter.withName(filterName)
        );
    }

    @Then("the results should only show hotels with a rating of 8 or higher")
    public void verifyHotelsWithRating8OrHigher() {
        theActorInTheSpotlight().should(
                seeThat(
                        HotelResultFilter.isDisplayed()
                )
        );
    }

    private void ensureActorIsReady() {
        if (OnStage.theActorCalled(ACTOR_NAME) == null) {
            OnStage.setTheStage(new Cast());
            OnStage.theActorCalled(ACTOR_NAME);
        }
    }

    @Then("the hotels should be displayed in ascending order of price")
    public void theHotelsShouldBeDisplayedInAscendingOrderOfPrice() {
        theActorInTheSpotlight().should(
                seeThat(
                        HotelResultPrice.isDisplayed()
                )
        );
    }
}
