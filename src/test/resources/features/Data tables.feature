@dataTable
Feature: Cucumber data tables implementation practices

  Scenario: List of fruits and vegetables I like
    Given User should see below list
      | orange     |
      | apple      |
      | kiwi       |
      | strawberry |
      | tomato     |
      | pear       |
      | eggplant   |

    #type of pets
  Scenario: List of pet types I love
    Given User should see pets type list
      | cat      |
      | dog      |
      | parrot   |
      | rabbit   |
      | goldfish |
      | chicken  |
      | turtle   |

  Scenario: Officer reads data about driver
    Then officer reads the driver information
      | name    | Jane |
      | surname | Doe  |
      | age     | 29   |
      | state   | CA   |


