package com.cydeo.step_definitions;

import com.cydeo.pages.BingPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;

import java.lang.module.Configuration;

public class Bing_StepDefinitions {
    BingPage page=new BingPage();
    @Given("User on the Bing search page")
    public void user_on_the_bing_search_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("bing_Url"));
    }
    @Then("User search for orange")
    public void user_search_for_orange() {
       page.searchBox.sendKeys("orange"+ Keys.ENTER);
    }
    @Then("User should see orange in the title")
    public void user_should_see_orange_in_the_title() {
        BrowserUtils.sleep(3);
        BrowserUtils.verifyTitleContains("orange");
    }

    @When("user enters {string} in the Bing search box")
    public void userEntersInTheBingSearchBox(String searchKey) {
        page.searchBox.sendKeys(searchKey+Keys.ENTER);

    }

    @Then("user should see {string} in the title")
    public void userShouldSeeInTheTitle(String expectedTitle) {
        BrowserUtils.sleep(3);
        BrowserUtils.verifyTitleContains(expectedTitle);
    }
}
