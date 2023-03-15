package com.cydeo.pages;

import com.cydeo.utilites.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ProfileSettingsPageBerti {
    public ProfileSettingsPageBerti() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id=\"expand\"]/div[1]/img")
    public WebElement ProfileModule;

    @FindBy(xpath = "//*[@id=\"expanddiv\"]/ul/li[2]/a")
    public WebElement Settings;

    @FindBy(xpath = "//*[@id=\"displayname\"]")
    public WebElement FullName;

    @FindBy(xpath = "//*[@id=\"email\"]")
    public WebElement Email;

    @FindBy(xpath = "//*[@id=\"phone\"]")
    public WebElement PhoneNumber;

    @FindBy(xpath = "//*[@id=\"address\"]")
    public WebElement Address;

    @FindBy(xpath = "//*[@id=\"website\"]")
    public WebElement Website;

    @FindBy(xpath = "//*[@id=\"twitter\"]")
    public WebElement Twitter;

    @FindBy(xpath = "//*[@id=\"languageinput\"]")
    public WebElement LanguageDropDown;

    @FindBy(xpath = "//*[@id=\"localeinput\"]")
    public WebElement LocaleDropDown;

    @FindBy(xpath = "//*[@id=\"nextcloud\"]/div")
    public WebElement dashboard;

    public void goToProfileModule(){
        ProfileModule.click();
        Settings.click();
    }
    public void getBackAndForwardIntoProfileModule(){
        dashboard.click();
        ProfileModule.click();
        Settings.click();
    }


}
