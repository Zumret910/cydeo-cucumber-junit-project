@wip-dashboard
Feature: Role-Based Menu Customization
  @wip-dashboard-1
  Scenario: Menu Options for driver
    Given user is on the login page
    When user enters the "driver" information
    Then user should be able to see following modules
      | Fleet      |
      | Customers  |
      | Activities |
      | System     |


  @wip-dashboard-2
  Scenario: Menu Options for salesmanager
    Given user is on the login page
    When user enters the "sales manager" information
    Then user should be able to see following modules
      | Dashboards         |
      | Fleet              |
      | Customers          |
      | Sales              |
      | Activities         |
      | Marketing          |
      | Reports & Segments |
      | System             |


  @wip-dashboard-3
  Scenario: Menu Options for storemanager
    Given user is on the login page
    When user enters the "store manager" information
    Then user should be able to see following modules
      | Dashboards         |
      | Fleet              |
      | Customers          |
      | Sales              |
      | Activities         |
      | Marketing          |
      | Reports & Segments |
      | System             |