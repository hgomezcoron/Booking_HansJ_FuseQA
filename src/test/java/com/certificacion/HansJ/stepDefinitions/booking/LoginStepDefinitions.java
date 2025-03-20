package com.certificacion.HansJ.stepDefinitions.booking;

import com.certificacion.HansJ.app.questions.booking.HomePage;
import com.certificacion.HansJ.app.questions.booking.LoginErrorMessage;
import com.certificacion.HansJ.app.questions.booking.LoginSuccess;
import com.certificacion.HansJ.app.questions.booking.ProfileUpdateConfirmation;
import com.certificacion.HansJ.app.tasks.booking.Login;
import com.certificacion.HansJ.app.tasks.booking.Logout;
import com.certificacion.HansJ.app.tasks.booking.UpdateProfile;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.junit.Assert.assertTrue;

public class LoginStepDefinitions {

    private static final String ACTOR_NAME = "User";

    @When("the user logs in with valid credentials")
    public void theUserLogsInWithValidCredentials() {
        theActorInTheSpotlight().attemptsTo(Login.withCredentials("user@example.com", "SecurePassword123"));
    }

    @Then("the user should be redirected to the dashboard")
    public void theUserShouldBeRedirectedToTheDashboard() {
        assertTrue(
                theActorInTheSpotlight()
                        .asksFor(
                                LoginSuccess.isDisplayed()
                        )
        );
    }

    @When("the user attempts to log in with invalid credentials")
    public void theUserAttemptsToLogInWithInvalidCredentials() {
        theActorInTheSpotlight().attemptsTo(Login.withCredentials("user@example.com", "WrongPassword"));
    }

    @Then("an error message should be displayed")
    public void anErrorMessageShouldBeDisplayed() {
        assertTrue(theActorInTheSpotlight().asksFor(LoginErrorMessage.isDisplayed()));
    }

    @When("the user updates their profile details")
    public void theUserUpdatesTheirProfileDetails() {
        theActorInTheSpotlight().attemptsTo(UpdateProfile.withPhoneNumber("1234567890"));
    }

    @Then("the profile should be updated successfully")
    public void theProfileShouldBeUpdatedSuccessfully() {
        assertTrue(theActorInTheSpotlight().asksFor(ProfileUpdateConfirmation.isDisplayed()));
    }

    @When("the user logs out")
    public void theUserLogsOut() {
        theActorInTheSpotlight().attemptsTo(Logout.now());
    }

    @Then("the user should be redirected to the home page")
    public void theUserShouldBeRedirectedToTheHomePage() {
        assertTrue(theActorInTheSpotlight().asksFor(HomePage.isDisplayed()));
    }

    @Given("the user is on the login page")
    public void theUserIsOnTheLoginPage() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled(ACTOR_NAME)
                .wasAbleTo(Open.url("https://account.booking.com/sign-in?op_token=EgVvYXV0aCLSBAoUT1NicnVhMFVVWkVRUUI2WU1CZDUSCWF1dGhvcml6ZRoxaHR0cHM6Ly9mbGlnaHRzLmJvb2tpbmcuY29tL2FwaS9vYXV0aC9jYWxsYmFjay92Myr2AzUyZjgwMTkzOWJjYjRkMGVkYjEwYzNkMGZkMTMyYzZhYjNkOGYxMWRkNjMyNjI1NTllZDcwOGQ3NWNjZDM1Y2VhNTk4MjlkNjYzNTE5Yjg1OTZiMGY4MjIzMzkzNmMyNzY0NmViY2ViZjQzMjFhY2UxNjUxMmUwZGEwMjM5ZTFiMWI4MTdmMmFhNjM0MTM2YjE2ZTAyODRiMjVjZWNkZTA4MzlmYzUyMDM0M2JiYzNiNTI0MGFmNzJjNjlkMjUzMDMyOWRjNWJhODU1M2I3MGJmNjRlMjkxZDJjZjI0OGY4OTk2OTU5MmQ4Njk1ODg4NTk5OWVlNGVjZTMzNzJjY2IxNDEyMmVlM2M2MGJlNjVkNjRkYWY0ZTE5ZjA0MDM4Njk1MWU4NzBkZTk1N2RkN2RiYTUzZTg1YWNiMjI4ZWRkMmQzZjM1MDViY2NlYTExODk2OTQxZjk2NjRiYWUwZmViNGJhNWE2YWY5Nzc4Zjc1Y2Y1NDA0N2VlNmRmZjdkMWQ2YTg0ZjdmZmI0MmRhMzJhNmUzYjQ1Y2U1ZGI0MmRiMWRiYTM5OGZhNjUwZTA5YWUzMDExNDcxMTU1MzNlYTY0ZWNiYzU0NzEwNmRlNjQ0MmFlZDliNGY1MDA2NTNiZDYxYTI5NGY3MGVlOGI1NzdlNjZjYTRCA3NzbyoTMJis5YWXzyc6AEIAWLaThvvaMg"));
    }

    @Given("the user is logged in")
    public void theUserIsLoggedIn() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled(ACTOR_NAME)
                .wasAbleTo(Open.url("https://account.booking.com/sign-in?op_token=EgVvYXV0aCLSBAoUT1NicnVhMFVVWkVRUUI2WU1CZDUSCWF1dGhvcml6ZRoxaHR0cHM6Ly9mbGlnaHRzLmJvb2tpbmcuY29tL2FwaS9vYXV0aC9jYWxsYmFjay92Myr2AzUyZjgwMTkzOWJjYjRkMGVkYjEwYzNkMGZkMTMyYzZhYjNkOGYxMWRkNjMyNjI1NTllZDcwOGQ3NWNjZDM1Y2VhNTk4MjlkNjYzNTE5Yjg1OTZiMGY4MjIzMzkzNmMyNzY0NmViY2ViZjQzMjFhY2UxNjUxMmUwZGEwMjM5ZTFiMWI4MTdmMmFhNjM0MTM2YjE2ZTAyODRiMjVjZWNkZTA4MzlmYzUyMDM0M2JiYzNiNTI0MGFmNzJjNjlkMjUzMDMyOWRjNWJhODU1M2I3MGJmNjRlMjkxZDJjZjI0OGY4OTk2OTU5MmQ4Njk1ODg4NTk5OWVlNGVjZTMzNzJjY2IxNDEyMmVlM2M2MGJlNjVkNjRkYWY0ZTE5ZjA0MDM4Njk1MWU4NzBkZTk1N2RkN2RiYTUzZTg1YWNiMjI4ZWRkMmQzZjM1MDViY2NlYTExODk2OTQxZjk2NjRiYWUwZmViNGJhNWE2YWY5Nzc4Zjc1Y2Y1NDA0N2VlNmRmZjdkMWQ2YTg0ZjdmZmI0MmRhMzJhNmUzYjQ1Y2U1ZGI0MmRiMWRiYTM5OGZhNjUwZTA5YWUzMDExNDcxMTU1MzNlYTY0ZWNiYzU0NzEwNmRlNjQ0MmFlZDliNGY1MDA2NTNiZDYxYTI5NGY3MGVlOGI1NzdlNjZjYTRCA3NzbyoTMJis5YWXzyc6AEIAWLaThvvaMg"));
        theActorInTheSpotlight().attemptsTo(Login.withCredentials("user@example.com", "SecurePassword123"));
    }
}
