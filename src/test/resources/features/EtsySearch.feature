@etsy_search
Feature: Etsy search features
  User story:user should be able to type any keyword and see relevant information
  Background:  For all scenarios user is on the Etsy home page
    Given User on the Etsy home page

    Scenario: Etsy Title Verification
      Then User sees title is as expected.
    #Expected: Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone

  Scenario: Etsy Search Functionality Title Verification (without parameterization)
    And User types Wooden Spoon into the search bar
    And User clicks on the search button
    Then User sees Wooden Spoon is in the title

    Scenario: Etsy Search Functionality Title Verification (with parameterization)
      And User types "Wooden Spoon" into the search bar
      And User clicks on the search button
      Then User sees "Wooden Spoon" is in the title

