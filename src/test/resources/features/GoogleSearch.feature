Feature: Google search functionality
  Agile story:As a user, when i am on the Google search page
  I should be able to search anything and see relevant results

  Scenario: Search page default title verification
    When I am on the Google search page
    Then  I see the title is Google
