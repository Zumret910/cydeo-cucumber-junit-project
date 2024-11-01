package com.cydeo.step_definitions;

import com.cydeo.pages.EtsyPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Etsy_StepDefinitions {
    EtsyPage page=new EtsyPage();
    @Given("User on the Etsy home page")
    public void user_on_the_etsy_home_page() {
        Driver.getDriver().get("https://www.amazon.ca/?tag=hydcaabkg-20&hvadid=677796472754&hvpos=&hvnetw=g&hvrand=5015295887354805807&hvpone=&hvptwo=&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9191785&hvtargid=kwd-31636821&ref=pd_sl_2gqjnc4wf3_e&hydadcr=11828_13481604&gad_source=1");
        BrowserUtils.sleep(10);
    }
    @Then("User sees title is as expected.")
    public void user_sees_title_is_as_expected() {
        String expected="Amazon.ca: Low Prices – Fast Shipping – Millions of Items";
        BrowserUtils.verifyTitle(expected);
    }

    @And("User types Wooden Spoon into the search bar")
    public void userTypesWoodenSpoonIntoTheSearchBar() {
     page.searchBox.sendKeys("Wooden Spoon");

    }

    @And("User clicks on the search button")
    public void userClicksOnTheSearchButton() {
          page.searchButton.click();
    }

    @Then("User sees Wooden Spoon is in the title")
    public void userSeesWoodenSpoonIsInTheTitle() {
        BrowserUtils.verifyTitleContains("Wooden Spoon");
    }


    @And("User types {string} into the search bar")
    public void userTypesIntoTheSearchBar(String keyword) {
        page.searchBox.sendKeys(keyword);
    }

    @Then("User sees {string} is in the title")
    public void userSeesIsInTheTitle(String expectedTitle) {
        BrowserUtils.verifyTitleContains(expectedTitle);
    }
}
