package com.cydeo.step_definitions;

import com.cydeo.pages.LoginPage;
import com.cydeo.pages.TalkPageByAnda;
import com.cydeo.utilites.ConfigurationReader;
import com.cydeo.utilites.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class Talk_StepDefinitions_Anda {
    LoginPage loginPage = new LoginPage();
    TalkPageByAnda talkPageByAnda = new TalkPageByAnda();


    @Given("login to the hectorware")
    public void login_to_the_hectorware() {
        String urlLink = ConfigurationReader.getProperty("urlLink");
        Driver.getDriver().get(urlLink);
        loginPage.username.sendKeys(ConfigurationReader.getProperty("username"));
        loginPage.password.sendKeys(ConfigurationReader.getProperty("password"));
        loginPage.LoginButton.click();
    }

    @Given("navigate to talk module")
    public void navigate_to_talk_module() {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(talkPageByAnda.Talkbutton).perform();
    }

    @Given("click the talk module")
    public void click_the_talk_module() {
        talkPageByAnda.Talkbutton.click();
    }

    @Then("Click plus sign in order to create a new conversation")
    public void click_plus_sign_in_order_to_create_a_new_conversation() {
        talkPageByAnda.PlusSignButton.click();
    }


    @Given("Click the conversation name box")
    public void click_the_conversation_name_box() {
talkPageByAnda.ConversationNameBox.click();
    }

    @Given("Write a {string}")
    public void write_a(String conversationName) throws InterruptedException {
       talkPageByAnda.ConversationNameBox.sendKeys("QA Engineers 1#");

       Thread.sleep(3000);
    }
    @Then("verify {string} is same as the input")
    public void verify_is_same_as_the_input(String conversationName) {
        String expectedConversationName= "QA Engineers 1#";
        String actualConversationName=talkPageByAnda.ConversationNameBox.getText();

        Assert.assertEquals(expectedConversationName,actualConversationName);
    }






}
