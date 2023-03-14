package com.cydeo.step_definitions;

import com.cydeo.pages.LoginPage;
import com.cydeo.utilites.ConfigurationReader;
import com.cydeo.utilites.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OnlineStatusPage2 {

   LoginPage loginPage =new  LoginPage();

   //OnlineStatusPages onlineStatusPage=new OnlineStatusPage();

    @Given("user acces the HECTORWARE URL")
    public void user_acces_the_hectorware_url() {
        String urlLink = ConfigurationReader.getProperty("urlLink");
        Driver.getDriver().get(urlLink);
    }
    @Then("user can acces Set Status")
    public void user_can_acces_set_status() {

    }

    @When("user acces avatar")
    public void userAccesAvatar() {
    }
}
