package com.cydeo.step_definitions;

import com.cydeo.pages.LoginPage;
import com.cydeo.pages.NotesEsmeraldi;
import com.cydeo.utilites.BrowserUtils;
import com.cydeo.utilites.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.bytebuddy.asm.Advice;
import org.apache.commons.collections4.sequence.DeleteCommand;
import org.apache.poi.sl.usermodel.TextBox;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class NotesEsmeraldi_StepDefinitions {

    NotesEsmeraldi notesEsmeraldi = new NotesEsmeraldi();
    LoginPage loginPage = new LoginPage();


    @Given("user login with valid credentials")
    public void user_login_with_valid_credentials() {
        loginPage.logIn();
    }

    @When("user verify and click notes icon")
    public void user_verify_and_click_notes_icon() {
        BrowserUtils.waitForPageToLoad(10);
        notesEsmeraldi.NoteIcon.click();

    }

    @When("user click to create new note text file")
    public void user_click_to_create_new_note_text_file() {
        BrowserUtils.waitForPageToLoad(10);
        notesEsmeraldi.NewNoteCreate.click();

    }

    @Then("user verify new note file is created")
    public void user_verify_new_note_file_is_created() {
        BrowserUtils.waitForPageToLoad(10);
        notesEsmeraldi.VerifyNewFile.getText();

    }

    @When("user is able to click the three dots")
    public void user_is_able_to_click_the_three_dots(){
        BrowserUtils.waitForPageToLoad(10);
        WebElement webElement = Driver.getDriver().findElement(By.xpath("//*[@id=\"app-navigation-vue\"]/ul/li[3]/div/div/div/div/button"));

        // Create a JavascriptExecutor object
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

        // Click the element using JavaScript
        js.executeScript("arguments[0].click();", webElement);

    }

    @When("user is able click at the option of file rename")
    public void user_is_able_click_at_the_option_of_file_rename() {
        notesEsmeraldi.RenameTheFile.click();

    }

    @When("user can delete old file name")
    public void user_can_delete_old_file_name() {



    }

    @When("user is able to type new file name")
    public void user_is_able_to_type_new_file_name() {
        notesEsmeraldi.NewFileTitle.sendKeys("Notes");

    }

    @Then("use can save the name of file")
    public void use_can_save_the_name_of_file() {
       notesEsmeraldi.SaveTitle.click();

    }


}
