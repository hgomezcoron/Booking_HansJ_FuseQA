#language:en

@Booking
Feature: Flight Booking Process
  As a user, I want to search and book a flight, so that I can plan my trip.

  @BookingUS2   @SearchingRoundTrip
  Scenario: Selecting a round-trip flight enables return date selection
    Given the user is on the flight booking page
    When the user chooses a round-trip option
    Then the return date field should become available

  @BookingUS2   @SelectingDestination
  Scenario: Displaying available flights after selecting departure and destination
    Given the user is on the flight booking page
    And the user selects Cartagena as the destination city
    When the user searches for available flights
    Then a list of available flights should be displayed

  @BookingUS2   @Entering
  Scenario: Triggering an error message for an invalid date range
    Given the user is on the flight booking page
    And the user selects a return date 2025-04-15 earlier than the departure date 2025-04-22
    When the user searches for flights
    Then an error message should inform about the invalid date selection

  @BookingUS2   @CheckoutProcess
  Scenario: Proceeding to checkout should display a booking summary
    Given the user has selected a flight from Cartagena to Medellin
    When the user proceeds to checkout
    Then the booking summary should display
