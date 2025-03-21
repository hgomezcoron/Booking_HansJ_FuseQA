#language:en

@Booking
Feature: Hotel Details & Amenities Verification
  As a user,
  I want to view detailed information about a hotel,
  So that I can make an informed decision about my stay.

  Background:
    Given the user is on the hotel search results page
    And has searched for hotels in a specific destination

  @HotelDetails @Navigation
  Scenario: Navigate to the hotel details page
    When the user selects a hotel listing to navigate to its details page
    Then the hotel details page should be displayed
    And the URL should reflect the selected hotel

  @HotelDetails @BasicInfo
  Scenario: Verify essential hotel details are displayed
    Given the user is on the hotel details page
    Then the hotel details page should display essential information

  @HotelDetails @Gallery
  Scenario: Verify that the photo gallery is present and navigable
    Given the user is on the hotel details page
    Then a photo gallery should be present and navigable

  @HotelDetails @Amenities
  Scenario: Verify that the hotel amenities are displayed
    Given the user is on the hotel details page
    Then a list of hotel amenities should be visible

  @HotelDetails @UserReviews
  Scenario: Verify that user reviews and ratings are displayed
    Given the user is on the hotel details page
    Then user reviews and ratings should be displayed
