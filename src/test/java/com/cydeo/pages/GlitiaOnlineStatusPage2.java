package com.cydeo.pages;

import com.cydeo.utilites.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GlitiaOnlineStatusPage2 {
    public GlitiaOnlineStatusPage2() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath ="//div[@class='menutoggle']")
    public WebElement avatarButton;

    @FindBy(xpath ="//div[@class='user-status-menu-item__toggle']")
    public WebElement SetStatusLinkDropdown;


    //@FindBy(id = "submit-form")
    //public WebElements ;


}