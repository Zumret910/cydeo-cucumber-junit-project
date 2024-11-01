Feature: Bing search functionality
  Agile story:As a user, when i am on the Bing search page
  I should be able to search anything and see relevant results.


#  @wip_bing
#  Scenario:Search result Title Verification（without parameters)
#    Given User on the Bing search page
#    Then User search for orange
#    Then User should see orange in the title

  @wip_parameters
  Scenario: Search result title verification
    Given User on the Bing search page
    When user enters "apple" in the Bing search box
    Then user should see "apple" in the title