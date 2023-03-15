package com.cydeo.pages;

import com.cydeo.utilites.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginFitim {
    public LoginFitim(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "user")
    public WebElement inputUsername;

    @FindBy (id = "password")
    public WebElement inputPassword;

    @FindBy (id = "submit-form")
    public WebElement loginButton;

    @FindBy(xpath = "//*[@id=\"expand\"]/div[1]/img")
    public WebElement ProfileAvatar;

}
