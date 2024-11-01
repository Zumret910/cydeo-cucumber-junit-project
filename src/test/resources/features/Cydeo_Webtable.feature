@cydeo_webTable
Feature: Cydeo web table app login functionality
  User story:User should be able to login with correct credentials

  Scenario: Positive login scenario
    Given user is on the Web Table login page
    When user enters correct username and password
    Then user clicks to login button
    Then user should see orders word in the URL

  Scenario: Positive login scenario
    Given user is on the Web Table login page
    When user enters "Test" username and  "Tester" password
    Then user clicks to login button
    Then user should see orders word in the URL

  Scenario: Positive login scenario
    Given user is on the Web Table login page
    When user enters below correct credentials
      | username | Test   |
      | password | Tester |
    Then user clicks to login button
    Then user should see orders word in the URL

  @cydeo_order_dropdown
      #Some of general functionality verifications
  Scenario: Dropdown options verifications
    Given user is already logged in to The Web table app
    When user is on the “Order” page
    Then user sees below options under “product” dropdown
      | MoneyCog   |
      | Familybea  |
      | Screenable |

  @cydeo_payment_dropdown
     #Some of general functionality verifications
  Scenario: Payment options verification
    Given user is already logged in to The Web table app
    When user is on the “Order” page
    Then user sees below options under Payment Information
      | Visa             |
      | MasterCard       |
      | American Express |

  @cydeo_order_place
     #Some of general functionality verifications
  Scenario: Order placement scenario
    Given user is already logged in to The Web table app
    When user is on the “Order” page
    And user enters quantity "2"
    Then user clicks to the calculate button
    And user enters customer name "Jane Doe"
    And user enters street "7th Street"
    And user enters city "New York"
    And user enters state "New York"
    And user enters zip "99999"
    And user selects payment option "Visa"
    And user enters credit card number "1111222233334444"
    And user enters expiration date "12/25"
    And user clicks to process order button
    Then user should see "Jane Doe" in the first row of the web table

  @cydeo_order_outline
  Scenario Outline: Order placement scenario with Scenario Outline
    Given user is already logged in to The Web table app
    When user is on the “Order” page
    And user enters quantity "<quantity>"
    Then user clicks to the calculate button
    And user enters customer name "<customer_name>"
    And user enters street "<street>"
    And user enters city "<city>"
    And user enters state "<state>"
    And user enters zip "<zip>"
    And user selects payment option "<payment_option>"
    And user enters credit card number "<credit_card_number>"
    And user enters expiration date "<expiration_date>"
    And user clicks to process order button
    Then user should see "<expected_name>" in the first row of the web table

    Examples:
      | quantity | customer_name | street | city | state | zip   | payment_option | credit_card_number | expiration_date |expected_name|
      | 3        | John Doe      | 7th st | NY   | NY    | 99999 | Visa           | 1111222233334444   | 12/25           | John Doe |
      | 3        | Jane Doe      | 7th st | NY   | NY    | 99999 | Visa           | 1111222233334444   | 12/25           | Jane Doe |
      | 3        | Jack Doe      | 7th st | NY   | NY    | 99999 | Visa           | 1111222233334444   | 12/25           | Jack Doe |



