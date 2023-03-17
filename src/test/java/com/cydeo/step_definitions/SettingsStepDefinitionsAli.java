package com.cydeo.step_definitions;

import com.cydeo.pages.SettingsPageAli;
import com.cydeo.utilites.ConfigurationReader;
import com.cydeo.utilites.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SettingsStepDefinitionsAli {
SettingsPageAli settings= new SettingsPageAli();

    @When("User logs in with valid credentions")
    public void user_logs_in_with_valid_credentions() {
Driver.getDriver().get("https://qa.hectorware.com/index.php/login");
settings.username.sendKeys(ConfigurationReader.getProperty("username"));
settings.password.sendKeys(ConfigurationReader.getProperty("password"));
settings.LoginButton.click();

    }


    @When("User clicks on Avatar on the rights side of the top")
    public void user_clicks_on_avatar_on_the_rights_side_of_the_top() {
        settings.avatarButton.click();

    }
    @Then("User sees dropdown with Set status,Settings,about,help,Log out inside")
    public void userSeesDropdownWithSetStatusSettingsAboutHelpLogOutInside() {
        settings.SetStatus.isDisplayed();
        settings.SettingsButton.isDisplayed();
        settings.HelpButton.isDisplayed();
    }

    @Then("User Clicks on Settings button")
    public void userClicksOnSettingsButton() {
        settings.SettingsButton.click();
    }
}
