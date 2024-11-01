@dropDown
Feature: Cydeo practice dropdown menu
  user story:as a user, I should able to see 12months options in the "date of birth" dropdown

  Scenario: Show 12 months in the "date of birth" dropdown
    Given User on the Cydeo practice page and click the "Dropdown" from the available examples list
    When User click october of the date of birth dropdown and can see tevelf months options
      | January   |
      | February  |
      | March     |
      | April     |
      | May       |
      | June      |
      | July      |
      | August    |
      | September |
      | October   |
      | November  |
      | December  |