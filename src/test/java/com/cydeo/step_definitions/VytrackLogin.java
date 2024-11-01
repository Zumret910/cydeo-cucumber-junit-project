package com.cydeo.step_definitions;

import com.cydeo.pages.VytrackLoginPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class VytrackLogin {
    VytrackLoginPage page=new VytrackLoginPage();
    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("vyTrackUrl"));
    }
    @When("user enters the driver information")
    public void user_enters_the_driver_information() {
        page.login(ConfigurationReader.getProperty("driver_username"),
                        ConfigurationReader.getProperty("driver_password"));
    }
    @Then("user should be able to login")
    public void user_should_be_able_to_login() {
        WebDriverWait wait=new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(page.profileMenu));
        BrowserUtils.verifyTitleContains("Dashboard");
    }

    @When("user enters the sales manager information")
    public void userEntersTheSalesManagerInformation() {
       page.login(ConfigurationReader.getProperty("sales_manager_username"),
               ConfigurationReader.getProperty("sales_manager_password"));


    }

    @When("user enters the store manager information")
    public void userEntersTheStoreManagerInformation() {
        page.login(ConfigurationReader.getProperty("store_manager_username"),
                ConfigurationReader.getProperty("store_manager_password"));
    }

    @When("user enters the {string} information")
    public void userEntersTheInformation(String userType) {
      page.login(userType.replace(" ","_"));

    }

    @When("the user login with {string},{string}")
    public void theUserLoginWith(String userName, String password) {
       page.login(userName, password);
    }

    @Then("the user should not be able to log in")
    public void theUserShouldNotBeAbleToLogIn() {
        BrowserUtils.verifyURLContains("login");
    }
}
