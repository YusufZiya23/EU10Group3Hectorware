package com.cydeo.pages;

import com.cydeo.utilites.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OnlineStatusPage {



    public OnlineStatusPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }



    @FindBy(xpath = "//div[@class='menutoggle']")
    public WebElement avatarButton;

    @FindBy(xpath = "//a[@class='user-status-menu-item__toggle']")
    public WebElement SetStatusLinkDropDown;









}
