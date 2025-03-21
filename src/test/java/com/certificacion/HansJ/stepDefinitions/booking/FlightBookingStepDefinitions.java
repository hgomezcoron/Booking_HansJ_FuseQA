package com.certificacion.HansJ.stepDefinitions.booking;

import com.certificacion.HansJ.app.questions.booking.*;
import com.certificacion.HansJ.app.tasks.booking.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.openqa.selenium.WebDriver;

import static com.certificacion.HansJ.app.userinterfaces.BookingHomePage.SEARCH_BUTTON;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertTrue;
import static org.hamcrest.CoreMatchers.is;

public class FlightBookingStepDefinitions {

    private WebDriver driver;
    private static final String ACTOR_NAME = "User";

    @Given("the user is on the flight booking page")
    public void theUserIsOnTheFlightBookingPage() {
        ensureActorIsReady();
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled(ACTOR_NAME)
                .wasAbleTo(
                        Open.url("https://www.booking.com/flights/index.html?aid=304142&label=gen173bo-1DCAEoggI46AdIMVgDaDKIAQGYATG4AQfIAQzYAQPoAQH4AQOIAgGYAgKoAgO4ApjC6L4GwAIB0gIkZjllZDg5MGMtZGRhMy00NjZlLWI2ZDMtY2Y2ZDM4OTFiZGFm2AIE4AIB&sid=a06cf24bdd6b11d53afdcac4a3a3327e&from=booking&")
                );
    }

    @When("the user chooses a round-trip option")
    public void theUserChoosesRoundTripOption() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                SelectRoundTripOption.roundTrip()
        );
    }

    @Then("the return date field should become available")
    public void theReturnDateFieldShouldBecomeAvailable() {
        OnStage.theActorInTheSpotlight().should(
                seeThat("Return date field is available", ReturnDateVisibility.isAvailable(), equalTo(true))
        );
    }





    private void ensureActorIsReady() {
        if (OnStage.theActorCalled(ACTOR_NAME) == null) {
            OnStage.setTheStage(new Cast());
            OnStage.theActorCalled(ACTOR_NAME);
        }
    }

    @And("the user selects {} as the destination city")
    public void theUserSelectsDestinationCity(String destinationCity) {
        theActorInTheSpotlight().attemptsTo(
                SelectDepartureAndDestination.withCities("", destinationCity)
        );
    }

    @When("the user searches for available flights")
    public void theUserSearchesForAvailableFlights() {
        theActorInTheSpotlight().attemptsTo(
                SelectFlightDestination.fromTo()
        );
    }

    @Then("a list of available flights should be displayed")
    public void aListOfAvailableFlightsShouldBeDisplayed() {
        assertTrue(
                theActorInTheSpotlight().asksFor(
                        FlightAvailable.isDisplayed()
                )
        );
    }

    @And("the user selects a return date {} earlier than the departure date {}")
    public void theUserSelectsInvalidDateRange(String returnDate, String departureDate) {
        theActorInTheSpotlight().attemptsTo(
                SelectDepartureAndDestination.withCities("", "Bogota")
        );
        theActorInTheSpotlight().attemptsTo(
                SelectOneWay.withoutDestination()
        );
        theActorInTheSpotlight().attemptsTo(
                SeleccionarFechasBookingFlight.con(departureDate, returnDate)
        );
    }

    @When("the user searches for flights")
    public void theUserSearchesForFlights() {

    }

    @Then("an error message should inform about the invalid date selection")
    public void anErrorMessageShouldAppear() {
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
