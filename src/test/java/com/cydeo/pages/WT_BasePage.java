package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WT_BasePage {
    public WT_BasePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
//    @FindBy(css = "button.__hamburger")
//    public WebElement greenButton;
    @FindBy(xpath = "//button[.='Order']")
    public WebElement orderManu;

}
