package com.cydeo.step_definitions;

import com.cydeo.pages.DropDownPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DataTable_StepDefinitions {
    @Given("User should see below list")
    public void user_should_see_below_list(List<String> fruitsAndVegetables) {
        System.out.println(fruitsAndVegetables);
    }


    @Given("User should see pets type list")
    public void userShouldSeePetsTypeList(List<String> petsType) {
        System.out.println("petsType = " + petsType);
    }

    @Then("officer reads the driver information")
    public void officerReadsTheDriverInformation(Map<String,String> driverInfo) {
        System.out.println(driverInfo);
    }

    @Given("User on the Cydeo practice page and click the {string} from the available examples list")
    public void userOnTheCydeoPracticePageAndClickTheFromTheAvailableExamplesList(String dropDown) {
        Driver.getDriver().get(ConfigurationReader.getProperty("cydeo_practice_url"));
        Driver.getDriver().findElement(By.linkText(dropDown)).click();
    }

    @When("User click october of the date of birth dropdown and can see tevelf months options")
    public void userClickOctoberOfTheDateOfBirthDropdownAndCanSeeTevelfMonthsOptions(List<String> months) {
        DropDownPage page=new DropDownPage();
        Select month=new Select(page.monthDropDown);
        List<WebElement> actualMonth=month.getOptions();
        List<String>autualMonthList=new ArrayList();
        for (WebElement each : actualMonth) {
            autualMonthList.add(each.getText());
        }
        Assert.assertTrue(autualMonthList.equals(months));
    }
}
