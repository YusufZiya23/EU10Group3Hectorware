package com.cydeo.step_definitions;

import com.cydeo.pages.LoginPage;
import com.cydeo.pages.LoginPageByMeri;
import com.cydeo.pages.OnlineStatusPageMagbule;
import com.cydeo.utilites.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class OnlineStatus_StepDefinition_Magbule {

   LoginPageByMeri loginPageByMeri=new LoginPageByMeri();

    OnlineStatusPageMagbule onlineStatusPageMagbule=new OnlineStatusPageMagbule();

    @Given("user navigates to the URL {string}")
    public void user_navigates_to_the_url(String string) {

        loginPageByMeri.login("Employee101","Employee123");

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
        String expectedOnlineOption = "Online";
        String actualOnlineOption = onlineStatusPageMagbule.OnlineOption.getText();


        Assert.assertTrue(actualOnlineOption.equals(expectedOnlineOption));
        onlineStatusPageMagbule.OnlineOption.isDisplayed();
    }
    @When("User see Away option need to be at the left top")
    public void user_see_away_option_need_to_be_at_the_left_top() {
        String expectedOnlineOption = "Away";
        String actualOnlineOption = onlineStatusPageMagbule.AwayOption.getText();


        Assert.assertTrue(actualOnlineOption.equals(expectedOnlineOption));
        onlineStatusPageMagbule.AwayOption.isDisplayed();
    }
    @When("User see Do not disturb option need to be at the left top")
    public void user_see_do_not_disturb_option_need_to_be_at_the_left_top() {
        String expectedOnlineOption = "Do not disturb";
        String actualOnlineOption = onlineStatusPageMagbule.DoNotDisturbOption.getText();


        Assert.assertTrue(actualOnlineOption.equals(expectedOnlineOption));
        onlineStatusPageMagbule.DoNotDisturbOption.isDisplayed();

    }

    @When("User see Invisible option need to be at the left top")
    public void user_see_invisible_option_need_to_be_at_the_left_top() {

        String expectedOnlineOption = "Invisible";
        String actualOnlineOption = onlineStatusPageMagbule.Invisible.getText();


        Assert.assertTrue(actualOnlineOption.equals(expectedOnlineOption));
        onlineStatusPageMagbule.Invisible.isDisplayed();

    }
    @Then("verify user click the Online option.")
    public void verify_user_click_the_online_option() {
        onlineStatusPageMagbule.OnlineOption.click();
        BrowserUtils.waitFor(3);

    }
    @Then("verify user click the Away option.")
    public void verify_user_click_the_away_option() {
       onlineStatusPageMagbule.AwayOption.click();
        BrowserUtils.waitFor(3);
    }
    @Then("verify user click the Do not disturb option.")
    public void verify_user_click_the_do_not_disturb_option() {
        onlineStatusPageMagbule.DoNotDisturbOption.click();
        BrowserUtils.waitFor(3);

    }

    @Then("verify user click the Invisible option.")
    public void verify_user_click_the_invisible_option() {
        onlineStatusPageMagbule.Invisible.click();
        BrowserUtils.waitFor(3);

    }


    @Then("verify user click any space on the page to close the Online status box")
    public void verifyUserClickAnySpaceOnThePageToCloseTheOnlineStatusBox() {
        onlineStatusPageMagbule.AnySpaceOnPage.click();

    }
}
