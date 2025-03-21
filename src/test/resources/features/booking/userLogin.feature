#language:en

@BookingR
Feature: User Login & Profile Update

  As a registered user,
  I want to log in and update my account details,
  So that my profile remains up to date.

  @BookingUS3   @Login
  Scenario: Logging in with valid credentials should navigate to the user dashboard
    Given the user is on the login page
    When the user logs in with valid credentials
    Then the user should be redirected to the dashboard

  @BookingUS3   @InvalidLogin
  Scenario: Entering incorrect credentials should display an error message
    Given the user is on the login page
    When the user attempts to log in with invalid credentials
    Then an error message should be displayed

  @BookingUS3   @ProfileUpdate
  Scenario: Updating profile details should save successfully
    Given the user is logged in
    When the user updates their profile details
    Then the profile should be updated successfully

  @BookingUS3   @Logout
  Scenario: Logging out should redirect to the home page
    Given the user is logged in
    When the user logs out
    Then the user should be redirected to the home page
