Feature: Google search functionality
  Agile story:As a user, when i am on the Google search page
  I should be able to search anything and see relevant results.

  @wip_day13
  Scenario:Search result Title Verification
    Given User on the Google search page
    Then User search for apple
    Then User should see apple in the title

