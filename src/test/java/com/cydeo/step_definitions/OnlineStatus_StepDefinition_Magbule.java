package com.cydeo.step_definitions;

import com.cydeo.pages.LoginPage;
import com.cydeo.pages.OnlineStatusPageMagbule;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class OnlineStatus_StepDefinition_Magbule {

    LoginPage loginPage = new LoginPage();

    OnlineStatusPageMagbule onlineStatusPageMagbule=new OnlineStatusPageMagbule();

    @Given("user navigates to the URL {string}")
    public void user_navigates_to_the_url(String string) {
       loginPage.logIn();
    }
    @When("user click to the avatar")
    public void user_click_to_the_avatar() {

        onlineStatusPageMagbule.avatarButton.click();

    }







    @Then("verify user view Set status message at second row of  dropdown menu")
    public void verify_user_view_set_status_message_at_second_row_of_dropdown_menu() {
        String expectedText = "Set status";
        String actualText = onlineStatusPageMagbule.SetStatusLinkDropDown.getText();

        Assert.assertTrue(actualText.equals(expectedText));
    }



    @When("Click to the Set status link text.")
    public void click_to_the_set_status_link_text() throws InterruptedException {

      onlineStatusPageMagbule.SetStatusLinkDropDown.click();
      Thread.sleep(3000);


    }
    @Then("verify user view Online status box.")
    public void verify_user_view_online_status_box() {
        onlineStatusPageMagbule.OnlineStatusBox.isDisplayed();
    }

    @When("User see Online status text.")
    public void user_see_online_status_text() {
        String expectedOnlineStatusText = "Online status";
        String actualOnlineStatusText = onlineStatusPageMagbule.OnlineStatusText.getText();


        Assert.assertTrue(actualOnlineStatusText.equals(expectedOnlineStatusText));
        onlineStatusPageMagbule.OnlineStatusText.isDisplayed();


    }
    @When("User see Online option need to be at the left top")
    public void user_see_online_option_need_to_be_at_the_left_top() {

    }
    @When("User see Away option need to be at the left top")
    public void user_see_away_option_need_to_be_at_the_left_top() {

    }
    @When("User see Do not disturb option need to be at the left top")
    public void user_see_do_not_disturb_option_need_to_be_at_the_left_top() {

    }
    @When("User see Invisible option need to be at the left top")
    public void user_see_invisible_option_need_to_be_at_the_left_top() {

    }
    @Then("verify user click the Online option.")
    public void verify_user_click_the_online_option() {

    }
    @Then("verify user click the Away option.")
    public void verify_user_click_the_away_option() {

    }
    @Then("verify user click the Do not disturb option.")
    public void verify_user_click_the_do_not_disturb_option() {

    }
    @Then("verify user click the Invisible option.")
    public void verify_user_click_the_invisible_option() {

    }







}
