package com.cydeo.step_definitions;

import com.cydeo.pages.DashboardPage;
import com.cydeo.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class DashboardPage_StepDef {
    DashboardPage page=new DashboardPage();
    @Then("user should be able to see following modules")
    public void user_should_be_able_to_see_following_modules(List<String> expectedMenu) {
        BrowserUtils.waitForTitleContains("Dashboard");
        System.out.println(page.actualModels());
        List<String>actual=page.actualModels();
       // System.out.println("BrowserUtils.getElementsText(page.models) = " + BrowserUtils.getElementsText(page.models));
        Assert.assertEquals(expectedMenu,actual);
    }





}
