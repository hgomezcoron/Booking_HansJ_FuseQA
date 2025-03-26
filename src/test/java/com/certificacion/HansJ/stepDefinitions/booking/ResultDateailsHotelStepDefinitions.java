package com.certificacion.HansJ.stepDefinitions.booking;

import com.certificacion.HansJ.app.questions.booking.HotelDetails;
import com.certificacion.HansJ.app.questions.booking.TheHotelDetailsPage;
import com.certificacion.HansJ.app.questions.booking.TheHotelURL;
import com.certificacion.HansJ.app.tasks.booking.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.is;

public class ResultDateailsHotelStepDefinitions {

    private static final String ACTOR_NAME = "User";


    @When("the user selects a hotel listing to navigate to its details page")
    public void theUserSelectsAHotel() {
        theActorInTheSpotlight()
                .attemptsTo(
                        SeleccionarHotel.enResultados()
                );
    }

    @Then("the hotel details page should display essential information")
    public void verifyHotelDetails() {
        theActorInTheSpotlight().should(
                seeThat("Hotel name is visible", HotelDetails.hotelNameIsVisible(), is(true)),
                seeThat("Hotel location is visible", HotelDetails.locationIsVisible(), is(true)),
                seeThat("Hotel star rating is visible", HotelDetails.starRatingIsVisible(), is(true))
        );
    }

    @Then("a photo gallery should be present and navigable")
    public void verifyPhotoGallery() {
        theActorInTheSpotlight().should(
                seeThat("Photo gallery is visible", HotelDetails.photoGalleryIsVisible(), is(true))
        );
    }

    @Then("a list of hotel amenities should be visible")
    public void verifyAmenitiesList() {
        theActorInTheSpotlight().should(
                seeThat("Amenities list is visible", HotelDetails.amenitiesListIsVisible(), is(true))
        );
    }

    @Then("user reviews and ratings should be displayed")
    public void verifyUserReviews() {
        theActorInTheSpotlight().should(
                seeThat("User reviews are visible", HotelDetails.userReviewsAreVisible(), is(true))
        );
    }

    @Given("the user is on the hotel search results page")
    public void theUserIsOnTheHotelSearchResultsPage() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled(ACTOR_NAME)
                .wasAbleTo(Open.url("https://www.booking.com/index.html?lang=en-us&soz=1&lang_changed=1")
                );
    }

    @And("has searched for hotels in a specific destination")
    public void hasSearchedForHotelsInASpecificDestination() {
        theActorInTheSpotlight().attemptsTo(IgnorarLogin.button());
        theActorInTheSpotlight()
                .attemptsTo(
                        BuscarHotelDetails.en("Cartagena de Indias")
                );
    }

    @Then("the hotel details page should be displayed")
    public void theHotelDetailsPageShouldBeDisplayed() {
        OnStage.theActorInTheSpotlight().attemptsTo(SwitchToNewTab.now());
        OnStage.theActorInTheSpotlight().should(
                seeThat("Hotel details page is displayed",
                        TheHotelDetailsPage.isDisplayed(), is(true))
        );
    }

    @And("the URL should reflect the selected hotel")
    public void theURLShouldReflectTheSelectedHotel() {
        OnStage.theActorInTheSpotlight().should(
                seeThat("URL contains 'hotel'",
                        TheHotelURL.isCorrect(), is(true))
        );
    }

    @Given("the user is on the hotel details page")
    public void theUserIsOnTheHotelDetailsPage() {
        theActorInTheSpotlight()
                .attemptsTo(
                        SeleccionarHotel.enResultados(),
                        SwitchToNewTab.now()
                );
    }
}
