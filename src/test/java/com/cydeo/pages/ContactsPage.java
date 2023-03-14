package com.cydeo.pages;

import com.cydeo.utilites.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsPage {

    public ContactsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//a[@class='active']")
    public WebElement contactsButton;

    @FindBy(id = "new-contact-button")
    public WebElement newContactButton;

    @FindBy(id = "contact-fullname")
    public WebElement name;

    @FindBy(id = "contact-org")
    public WebElement company;

}
