package com.cydeo.pages;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VytrackLoginPage {
    public VytrackLoginPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id = "prependedInput")
   public WebElement userName;
    @FindBy(id = "prependedInput2")
   public WebElement passWord;
    @FindBy(id = "_submit")
    public WebElement loinButton;
    @FindBy(id = "user-menu")
   public WebElement profileMenu;
    @FindBy (xpath = "//fieldset/div[1]/div[1]")
    public WebElement errorMsg;

    public void login(String username,String password){
        this.userName.sendKeys(username);
        this.passWord.sendKeys(password);
        this.loinButton.click();
    }
    public void login(String userType){
        this.userName.sendKeys(ConfigurationReader.getProperty(userType+"_username"));
        this.passWord.sendKeys(ConfigurationReader.getProperty(userType+"_password"));
        this.loinButton.click();
    }
}
