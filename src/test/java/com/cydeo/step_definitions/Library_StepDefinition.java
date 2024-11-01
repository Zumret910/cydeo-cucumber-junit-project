package com.cydeo.step_definitions;

import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class Library_StepDefinition {
    @Given("User on the library login page")
    public void user_on_the_library_login_page() {
        System.out.println("User on the home page.");
    }
    @Given("User enters librarian as the username")
    public void user_enters_librarian_as_the_username() {
        System.out.println("User enters librarian username.");
    }
    @Given("User enters librarian as the password")
    public void user_enters_librarian_as_the_password() {
        System.out.println("User enters librarian password.");
    }
    @When("User click on the login button")
    public void user_click_on_the_login_button() {
        System.out.println("user click on the login button");
    }
    @Then("User should see the dashboard page")
    public void user_should_see_the_dashboard_page() {
        System.out.println("log see the dashboard");
    }
    @Given("User enters student as the username")
    public void user_enters_student_as_the_username() {
        System.out.println("User enters student username.");
    }
    @Given("User enters student as the password")
    public void user_enters_student_as_the_password() {
        System.out.println("User enters student password.");
    }

}
