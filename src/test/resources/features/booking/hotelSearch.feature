#language:en

@Booking
Feature: Hotel Search and Filtering
As a user,
I want to search for hotels in a specific city and apply filters,
So that I can find a suitable place to stay.

  @BookingUS1    @Searching
Scenario: Searching for hotels in a specific city
Given the user is on the Booking homepage
When the user searches for hotels in Barcelona
Then the search results should display hotels in Barcelona

  @BookingUS1   @Selecting
Scenario: Selecting check-in and check-out dates
Given the user is on the Booking homepage
When the user selects check-in date 2025-03-25 and check-out date 2025-03-29
Then the availability should be updated accordingly

  @BookingUS1   @Applying
Scenario: Applying a Very Good 8+ filter
Given the user has searched for hotels in Barcelona
When the user applies the Very Good: 8+ filter
Then the results should only show hotels with a rating of 8 or higher

  @BookingUS1   @Sorting
Scenario: Sorting results by price
Given the user has searched for hotels in Barcelona
When the user sorts the results by Price
Then the hotels should be displayed in ascending order of price
