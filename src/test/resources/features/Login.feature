Feature: Library login feature
  User Story:
  As a user, I should be able to login with correct credentials to different accounts.And dashboard should be displayed.
  Accounts are: librarian, student, admin
#this is how we give commands in feature file
  @librarian @smoke
  Scenario: Login as librarian
    Given User on the library login page
    And User enters librarian as the username
    And User enters librarian as the password
    When User click on the login button
    Then User should see the dashboard page

  @student @smoke
  Scenario: Login as student
    Given User on the library login page
    And User enters student as the username
    And User enters student as the password
    When User click on the login button
    Then User should see the dashboard page

