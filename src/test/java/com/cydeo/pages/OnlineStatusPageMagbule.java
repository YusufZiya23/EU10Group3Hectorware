package com.cydeo.pages;

import com.cydeo.utilites.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OnlineStatusPageMagbule {



    public OnlineStatusPageMagbule(){
        PageFactory.initElements(Driver.getDriver(),this);
    }



    @FindBy(xpath = "//div[@class='avatardiv avatardiv-shown']")
    public WebElement avatarButton;

    @FindBy(xpath = "//div[@class='user-status-menu-item']/a")
   public WebElement SetStatusLinkDropDown;

    @FindBy(xpath = "//div[@class='set-status-modal']")
    public WebElement OnlineStatusBox;

    @FindBy(xpath = "//h3[.='Online status']")
    public WebElement OnlineStatusText;








}
