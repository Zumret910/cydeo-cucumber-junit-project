package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import io.cucumber.java.zh_cn.假如;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class Cydeo_Webtable_Page extends WT_BasePage {
    public Cydeo_Webtable_Page() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(css = "input[name='username']")
    public WebElement userNameInput;
    @FindBy(css = "input[name='password']")
    public WebElement passwordInput;
    @FindBy(css = "button[type='submit']")
    public WebElement submitButton;
    @FindBy(xpath = "//select[@name='product']")
    public WebElement productDropdown;


    @FindBy(xpath = "//input[@name='quantity']")
    public WebElement quantityInput;
    @FindBy(xpath = "//input[@name='name']")
    public WebElement customerNameInput;
    @FindBy(xpath = "//input[@name='street']")
    public WebElement streetInput;
    @FindBy(xpath = "//input[@name='city']")
    public WebElement cityInput;
    @FindBy(xpath = "//input[@name='state']")
    public WebElement stateInput;
    @FindBy(xpath = "//input[@name='zip']")
    public WebElement zipInput;
    @FindBy(xpath = "//input[@name='cardNo']")
    public WebElement cardNumber;
    @FindBy(xpath = "//input[@name='cardExp']")
    public WebElement expiryInput;
    @FindBy(xpath = "//button[.='Calculate']")
    public WebElement calculateButton;
    @FindBy(xpath = "//button[.='Process Order']")
        public WebElement processOrderButton;

    public void login(){
        this.userNameInput.sendKeys("Test");
        passwordInput.sendKeys("Tester");
        submitButton.click();
    }
    public void login(String username,String password){
        this.userNameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        submitButton.click();
    }
    public List<String> radioButtons(){
         List<WebElement> radioButtons=Driver.getDriver().findElements(By.name("card"));
         List<String> radioButtonList=new ArrayList();
        for (WebElement each : radioButtons) {
            radioButtonList.add(each.getAttribute("value"));
        }
        return radioButtonList;
    }
    public void clickRadioButton(String value){
        List<WebElement> radioButtons=Driver.getDriver().findElements(By.name("card"));
        for (WebElement each : radioButtons) {
            if (each.getAttribute("value").equals(value)){
                each.click();
                break;
            }
        }

    }

    @FindBy(xpath = "//table/tbody/tr[1]/td[1]")
    public WebElement firstLineFirstElement;


}
