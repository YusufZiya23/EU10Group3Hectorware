package com.cydeo.step_definitions;

import com.cydeo.pages.BooKManagementPage_Berti;
import com.cydeo.pages.LoginPageLibrarian;
import com.cydeo.pages.PageBase;
import com.cydeo.utilites.BrowserUtils;
import com.cydeo.utilites.ConfigurationReader;
import com.cydeo.utilites.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class USER_Database_Testing_Step_definition_Berti extends PageBase {
    LoginPageLibrarian loginPage = new LoginPageLibrarian();
    BooKManagementPage_Berti booKManagementPage_berti = new BooKManagementPage_Berti();


    // Login and verify the URL
    // Login and verify the URL
    // Login and verify the URL
    @Given("that you are in library and log in as {word}")
    public void that_you_are_in_library_and_log_in_as_librarian(String word) {
        String userName = "";
        String password = "";

        switch (word) {
            case "librarian":
                userName = ConfigurationReader.getProperty("librarian_email");
                password = ConfigurationReader.getProperty("librarian_password");
                break;
            case "student":
                userName = ConfigurationReader.getProperty("student_email");
                password = ConfigurationReader.getProperty("student_password");
                break;

        }
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        loginPage.login(userName, password);
    }

    @When("you are at {string}")
    public void you_are_at(String str) {
        if (str.equalsIgnoreCase("users")) {
            users.click();
        } else if (str.equalsIgnoreCase("books")){
            books.click();
        }

    }

    @Then("you should see {string} into URL")
    public void you_should_see_into_URL(String str) {
        String actual = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actual.contains(str));
    }

    //Database testing
    //Database testing
    //Database testing

    @When("you can search for users {word}")
    public void you_can_search_for_users_actions(String word) {
        users.click();
        Select dropdown = new Select(booKManagementPage_berti.userGroup);
        for (WebElement option : dropdown.getOptions()) {
            if (option.getText().equalsIgnoreCase(word)) {
                option.click();
            }
        }
    }


    @When("you search for user Id {string}")
    public void you_search_for_user_Id(String id) {
        //How many lines you want to show
        //Select dropdownShew = new Select(booKManagementPage_berti.showUsers);
        //dropdownShew.selectByIndex(4);

        booKManagementPage_berti.searchBox.click();
        booKManagementPage_berti.searchBox.sendKeys(id + Keys.ENTER);
        BrowserUtils.waitFor(3);
        String userId = booKManagementPage_berti.userId.getText();
        Assert.assertEquals(userId, id);
    }

    @Then("print all the information for that row")
    public void print_all_the_information_for_that_row() {
        System.out.println("booKManagementPage_berti.userId.getText() = " + booKManagementPage_berti.userId.getText());
        System.out.println("booKManagementPage_berti.fullName.getText() = " + booKManagementPage_berti.fullName.getText());
        System.out.println("booKManagementPage_berti.email.getText() = " + booKManagementPage_berti.email.getText());
        System.out.println("booKManagementPage_berti.group.getText() = " + booKManagementPage_berti.group.getText());
        System.out.println("booKManagementPage_berti.status.getText() = " + booKManagementPage_berti.status.getText());
    }


}
