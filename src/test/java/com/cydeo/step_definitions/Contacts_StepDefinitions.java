package com.cydeo.step_definitions;

import com.cydeo.pages.ContactsPage;
import com.cydeo.pages.LoginPage;
import com.cydeo.utilites.ConfigurationReader;
import com.cydeo.utilites.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Contacts_StepDefinitions {

    LoginPage loginPage = new LoginPage();
    ContactsPage contactsPage = new ContactsPage();

    @Given("login to the {string}")
    public void login_to_the(String string) {
        String urlLink = ConfigurationReader.getProperty("urlLink");
        Driver.getDriver().get(urlLink);
        loginPage.username.sendKeys(ConfigurationReader.getProperty("username"));
        loginPage.password.sendKeys(ConfigurationReader.getProperty("password"));
        loginPage.LoginButton.click();

    }

    @When("Navigate to Contacts module on the left side of the page")
    public void navigate_to_contacts_module_on_the_left_side_of_the_page() {


    }
    @When("Click New contact button")
    public void click_new_contact_button() {



    }
    @When("Enter {string} in to Name inbox")
    public void enter_in_to_name_inbox(String name) {



    }
    @When("Enter {string} in to Company inbox")
    public void enter_in_to_company_inbox(String string) {

    }
    @When("Enter {string} in to Title inbox")
    public void enter_in_to_title_inbox(String string) {

    }
    @When("Click any empty area on the page")
    public void click_any_empty_area_on_the_page() {

    }
    @Then("Verify new contact is shown in contact list")
    public void verify_new_contact_is_shown_in_contact_list() {

    }
}
