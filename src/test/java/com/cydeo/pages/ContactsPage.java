package com.cydeo.pages;

import com.cydeo.utilites.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsPage {

    public ContactsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//ul[@id='appmenu']//li[@data-id='contacts']")
    public WebElement contactsButton;

    @FindBy(id = "new-contact-button")
    public WebElement newContactButton;

    @FindBy(id = "contact-fullname")
    public WebElement name;

    @FindBy(id = "contact-org")
    public WebElement company;

    @FindBy(id = "contact-title")
    public WebElement title;

    @FindBy(xpath = "//header[@class='contact-header']")
    public WebElement emptyArea;

    @FindBy(xpath = "//div[@class='vue-recycle-scroller app-content-list ready direction-vertical showdetails']")
    public WebElement contactList;

    @FindBy(xpath = "//div[@class='app-content-details']")
    public WebElement page;
}
