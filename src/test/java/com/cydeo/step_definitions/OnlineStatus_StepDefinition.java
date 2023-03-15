package com.cydeo.step_definitions;

import com.cydeo.pages.LoginPage;
import com.cydeo.pages.OnlineStatusPage;
import com.cydeo.utilites.ConfigurationReader;
import com.cydeo.utilites.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class OnlineStatus_StepDefinition {

    LoginPage loginPage = new LoginPage();

    OnlineStatusPage onlineStatusPage=new OnlineStatusPage();

    @Given("user navigates to the URL {string}")
    public void user_navigates_to_the_url(String string) {
       loginPage.logIn();
    }
    @When("user click to the avatar")
    public void user_click_to_the_avatar() {

        onlineStatusPage.avatarButton.click();

    }







    @Then("verify user view Set status message at second row of  dropdown menu")
    public void verify_user_view_set_status_message_at_second_row_of_dropdown_menu() {
        String expectedText = "Set status";
        String actualText = onlineStatusPage.SetStatusLinkDropDown.getText();

        Assert.assertTrue(actualText.equals(expectedText));
    }



    @When("Click to the Set status link text.")
    public void click_to_the_set_status_link_text() throws InterruptedException {

      onlineStatusPage.SetStatusLinkDropDown.click();
      Thread.sleep(3000);
    }
    @Then("View Online status box.")
    public void view_online_status_box() {

        onlineStatusPage.OnlineStatusBox.isDisplayed();

    }







}
