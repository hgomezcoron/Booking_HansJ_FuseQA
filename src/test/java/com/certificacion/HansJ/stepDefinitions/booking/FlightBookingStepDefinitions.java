package com.certificacion.HansJ.stepDefinitions.booking;

import com.certificacion.HansJ.app.questions.booking.*;
import com.certificacion.HansJ.app.tasks.booking.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.junit.Assert.assertTrue;

public class FlightBookingStepDefinitions {

    private WebDriver driver;
    private static final String ACTOR_NAME = "User";

    @Given("the user is on the flight booking page")
    public void userIsOnFlightBookingPage() {
        ensureActorIsReady();
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled(ACTOR_NAME)
                .wasAbleTo(
                        Open.url("https://www.booking.com/flights/index.html?aid=304142&label=gen173bo-1DCAEoggI46AdIMVgDaDKIAQGYATG4AQfIAQzYAQPoAQH4AQOIAgGYAgKoAgO4ApjC6L4GwAIB0gIkZjllZDg5MGMtZGRhMy00NjZlLWI2ZDMtY2Y2ZDM4OTFiZGFm2AIE4AIB&sid=a06cf24bdd6b11d53afdcac4a3a3327e&from=booking&")
                );
    }

    @When("the user chooses a round-trip option")
    public void userSelectsRoundTrip() {
        theActorInTheSpotlight().attemptsTo(
                //SelectRoundTrip.option()
        );
    }

    @Then("the return date field should become available")
    public void returnDateFieldShouldBeAvailable() {
        boolean isEnabled = theActorInTheSpotlight().asksFor(ReturnDateField.isEnabled());
        Assertions.assertTrue(isEnabled, "El campo de fecha de regreso no está habilitado");
    }

    private void ensureActorIsReady() {
        if (OnStage.theActorCalled(ACTOR_NAME) == null) {
            OnStage.setTheStage(new Cast());
            OnStage.theActorCalled(ACTOR_NAME);
        }
    }

    @And("the user selects {} as the departure city")
    public void theUserSelectsDepartureCity(String departureCity) {
        theActorInTheSpotlight().attemptsTo(
                SelectDepartureAndDestination.withCities(departureCity, "")
        );
    }

    @And("the user selects {} as the destination city")
    public void theUserSelectsDestinationCity(String destinationCity) {
        theActorInTheSpotlight().attemptsTo(
                SelectDepartureAndDestination.withCities("", destinationCity)
        );
    }

    @When("the user searches for available flights")
    public void theUserSearchesForAvailableFlights() {
        theActorInTheSpotlight().attemptsTo(SearchForFlights.now());
    }

    @Then("a list of available flights should be displayed")
    public void aListOfAvailableFlightsShouldBeDisplayed() {
        assertTrue(theActorInTheSpotlight().asksFor(FlightResults.areDisplayed()));
    }

    @And("the user selects a return date earlier than the departure date")
    public void theUserSelectsInvalidDateRange() {
        theActorInTheSpotlight().attemptsTo(
                SelectDepartureAndDestination.withCities("", "")
        );
    }

    @When("the user searches for flights")
    public void theUserSearchesForFlights() {
        theActorInTheSpotlight().attemptsTo(SearchForFlights.now());
    }

    @Then("an error message should inform about the invalid date selection")
    public void anErrorMessageShouldAppear() {
        assertTrue(theActorInTheSpotlight().asksFor(InvalidDateMessage.isDisplayed()));
    }

    @Given("the user has selected a flight from {} to {}")
    public void userHasSelectedAFlight(String departure, String destination) {
        ensureActorIsReady();
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled(ACTOR_NAME)
                .wasAbleTo(
                        Open.url("https://www.booking.com/flights/index.html?aid=304142&label=gen173bo-1DCAEoggI46AdIMVgDaDKIAQGYATG4AQfIAQzYAQPoAQH4AQOIAgGYAgKoAgO4ApjC6L4GwAIB0gIkZjllZDg5MGMtZGRhMy00NjZlLWI2ZDMtY2Y2ZDM4OTFiZGFm2AIE4AIB&sid=a06cf24bdd6b11d53afdcac4a3a3327e&from=booking&")
                );
        theActorInTheSpotlight().attemptsTo(
                SelectDepartureAndDestination.withCities(departure, destination),
                SelectFlight.fromTo()
        );
    }

    @When("the user proceeds to checkout")
    public void userProceedsToCheckout() {
        theActorInTheSpotlight().attemptsTo(ProceedToCheckout.now());
    }

    @Then("the booking summary should display")
    public void bookingSummaryShouldDisplay() {
        assertTrue(
                theActorInTheSpotlight()
                        .asksFor(
                                SelectYourTicket.isDisplayed()
                        )
        );
    }
}
