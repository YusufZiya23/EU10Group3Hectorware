package com.cydeo.step_definitions;

import com.cydeo.pages.LoginPage;
import com.cydeo.pages.NotesEsmeraldi;
import com.cydeo.utilites.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class NotesEsmeraldi_StepDefinitions {

    NotesEsmeraldi notesEsmeraldi = new NotesEsmeraldi();
    LoginPage loginPage = new LoginPage();

    @Given("user login with valid credentials")
    public void user_login_with_valid_credentials() {
        loginPage.logIn();
    }

    @When("user verify and click notes icon")
    public void user_verify_and_click_notes_icon() {
        notesEsmeraldi.NoteIcon.click();

    }

    @When("user click to create new note text file")
    public void user_click_to_create_new_note_text_file() {
        notesEsmeraldi.NewNoteCreate.click();

    }

    @Then("user verify new note file is created")
    public void user_verify_new_note_file_is_created() {
        notesEsmeraldi.VerifyNewFile.getText();

    }

}
