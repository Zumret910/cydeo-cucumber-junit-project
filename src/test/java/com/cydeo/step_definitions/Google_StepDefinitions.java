package com.cydeo.step_definitions;

import com.cydeo.pages.GooglePage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class Google_StepDefinitions {
    @When("I am on the Google search page")
    public void i_am_on_the_google_search_page() {
        Driver.getDriver().get("https://www.google.com");
    }
    @Then("I see the title is Google")
    public void i_see_the_title_is_google() {
       String actualTitle=Driver.getDriver().getTitle();
       String expected="Google";
       Assert.assertEquals(actualTitle,expected);
       Driver.closeDriver();
    }
    GooglePage searchPage=new GooglePage();

    //day 13
    @Given("User on the Google search page")
    public void user_on_the_google_search_page() {
       Driver.getDriver().get(ConfigurationReader.getProperty("googleUrl"));
    }
    @Then("User search for {word}")
    public void user_search_for_apple(String word) {
        searchPage.searchBox.sendKeys(word+ Keys.ENTER);
    }
    @Then("User should see {word} in the title")
    public void user_should_see_apple_in_the_title(String word) {
       BrowserUtils.verifyTitleContains(word);
    }
}
