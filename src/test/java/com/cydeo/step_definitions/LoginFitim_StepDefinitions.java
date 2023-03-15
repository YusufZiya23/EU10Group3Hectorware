package com.cydeo.step_definitions;

import com.cydeo.pages.LoginFitim;
import com.cydeo.utilites.ConfigurationReader;
import com.cydeo.utilites.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class LoginFitim_StepDefinitions {

    LoginFitim loginFitim = new LoginFitim();
    @Given("user visits Hectorware")
    public void user_visits_hectorware() {
        Driver.getDriver().get(ConfigurationReader.getProperty("urlLink"));
    }
    @When("user enters valid username in username field")
    public void user_enters_valid_username_in_username_field() {
    loginFitim.inputUsername.sendKeys(ConfigurationReader.getProperty("username"));
    }
    @When("user enters valid password in password field")
    public void user_enters_valid_password_in_password_field() {
    loginFitim.inputPassword.sendKeys(ConfigurationReader.getProperty("password"));
    }
    @When("user clicks the login button")
    public void user_clicks_the_login_button() {
    loginFitim.loginButton.click();
    }
    @Then("user should see the dashboard")
    public void user_should_see_the_dashboard() {
    Assert.assertTrue(loginFitim.ProfileAvatar.isDisplayed());
    }


}
