package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class DashboardPage {
    public DashboardPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(css ="div#main-menu>ul>li")
    public List<WebElement> models;


    public List<String> actualModels() {
       // models=Driver.getDriver().findElements(By.cssSelector("div#main-menu>ul>li"));
        List<String> modelNames = new ArrayList<>();
        for (WebElement model : models) {
            modelNames.add(model.getText());
        }
        return modelNames;
    }
}

