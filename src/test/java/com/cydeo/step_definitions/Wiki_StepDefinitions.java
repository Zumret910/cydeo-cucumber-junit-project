package com.cydeo.step_definitions;

import com.cydeo.pages.WikipediaPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;

public class Wiki_StepDefinitions {
    WikipediaPage page=new WikipediaPage();
    @Given("User is on Wikipedia home page")
    public void user_is_on_wikipedia_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("wikipedia_url"));
    }
    @When("User types {string} in the wiki search box")
    public void userTypesInTheWikiSearchBox(String searchValue) {
        page.searchBox.sendKeys(searchValue+ Keys.ENTER);
    }


    @Then("User sees {string} is in the wiki title")
    public void user_sees_is_in_the_wiki_title(String string) {
        BrowserUtils.verifyTitleContains(string);
    }


    @Then("User sees {string} is in the main header")
    public void userSeesIsInTheMainHeader(String expectedValue) {
        BrowserUtils.verifyTextContains(page.headText,expectedValue);
    }

    @Then("User sees {string} is in the image header")
    public void userSeesIsInTheImageHeader(String expectedValue) {
        BrowserUtils.verifyTextContains(page.imageTitle,expectedValue);
    }
}
