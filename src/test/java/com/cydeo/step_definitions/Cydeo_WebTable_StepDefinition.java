package com.cydeo.step_definitions;

import com.cydeo.pages.Cydeo_Webtable_Page;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import javax.sql.rowset.BaseRowSet;
import java.util.List;
import java.util.Map;

public class Cydeo_WebTable_StepDefinition {
   Cydeo_Webtable_Page page=new Cydeo_Webtable_Page();

    @Given("user is on the Web Table login page")
    public void user_is_on_the_web_table_login_page() {
        Driver.getDriver().get("https://web-table-2.cydeo.com/login");
    }
    @When("user enters correct username and password")
    public void user_enters_correct_username_and_password() {
        page.userNameInput.sendKeys("Test");
        page.passwordInput.sendKeys("Tester");
    }
    @Then("user clicks to login button")
    public void user_clicks_to_login_button() {
      page.submitButton.click();
    }
    @Then("user should see orders word in the URL")
    public void user_should_see_orders_word_in_the_url() {
        BrowserUtils.verifyURLContains("orders");
    }

    @When("user enters {string} username and  {string} password")
    public void userEntersUsernameAndPassword(String userName, String Password) {
        page.userNameInput.sendKeys(userName);
        page.passwordInput.sendKeys(Password);
    }

    @When("user enters below correct credentials")
    public void userEntersBelowCorrectCredentials(Map<String,String> credentials) {
        page.userNameInput.sendKeys(credentials.get("username"));
        page.passwordInput.sendKeys(credentials.get("password"));
    }

    @Given("user is already logged in to The Web table app")
    public void user_is_already_logged_in_to_the_web_table_app() {
        Driver.getDriver().get("https://web-table-2.cydeo.com/login");
      page.login();
    }
    @When("user is on the “Order” page")
    public void user_is_on_the_order_page() {
       //page.greenButton.click();
       page.orderManu.click();
       BrowserUtils.sleep(3);
    }
    @Then("user sees below options under “product” dropdown")
    public void user_sees_below_options_under_product_dropdown(List<String> expextedOptions) {
       List<String> actual= BrowserUtils.dropdownOptions_as_STRING(page.productDropdown);
        Assert.assertTrue(expextedOptions.equals(actual));

    }

    @Then("user sees below options under Payment Information")
    public void userSeesBelowOptionsUnderPaymentInformation(List<String> paymentOptions) {
        System.out.println(page.radioButtons());
        System.out.println(paymentOptions);
        Assert.assertEquals(page.radioButtons(),paymentOptions);

    }

    @And("user enters quantity {string}")
    public void userEntersQuantity(String quantity) {
        page.quantityInput.clear();
        page.quantityInput.sendKeys(quantity);
    }
    @Then("user clicks to the calculate button")
    public void user_clicks_to_the_calculate_button() {
        page.calculateButton.click();
    }
    @Then("user enters customer name {string}")
    public void user_enters_customer_name(String userName) {
        page.customerNameInput.sendKeys(userName);
    }
    @Then("user enters street {string}")
    public void user_enters_street(String street) {
       page.streetInput.sendKeys(street);
    }
    @Then("user enters city {string}")
    public void user_enters_city(String city) {
        page.cityInput.sendKeys(city);
    }
    @Then("user enters state {string}")
    public void user_enters_state(String state) {
       page.stateInput.sendKeys(state);
    }
    @Then("user enters zip {string}")
    public void user_enters_zip(String zipcode) {
       page.zipInput.sendKeys(zipcode);
    }
    @Then("user selects payment option {string}")
    public void user_selects_payment_option(String paymentOption) {
       page.clickRadioButton(paymentOption);
    }
    @Then("user enters credit card number {string}")
    public void user_enters_credit_card_number(String cardumber) {
       page.cardNumber.sendKeys(cardumber);
    }
    @Then("user enters expiration date {string}")
    public void user_enters_expiration_date(String exDate) {
       page.expiryInput.sendKeys(exDate);
    }
    @Then("user clicks to process order button")
    public void user_clicks_to_process_order_button() {
        page.processOrderButton.click();
    }
    @Then("user should see {string} in the first row of the web table")
    public void user_should_see_in_the_first_row_of_the_web_table(String expectedName) {
      String actual= page.firstLineFirstElement.getText();
      Assert.assertEquals(expectedName,actual);
    }


}
