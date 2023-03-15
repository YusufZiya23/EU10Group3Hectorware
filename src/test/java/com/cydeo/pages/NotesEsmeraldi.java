package com.cydeo.pages;


import com.cydeo.utilites.Driver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NotesEsmeraldi {
    public NotesEsmeraldi() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id=\"appmenu\"]/li[8]")
    public WebElement NoteIcon;

    @FindBy(xpath = "//*[@id=\"notes_new_note\"]")
    public WebElement NewNoteCreate;

    @FindBy(xpath = "//span[@title='New note (3)']")
    public WebElement VerifyNewFile;






}
