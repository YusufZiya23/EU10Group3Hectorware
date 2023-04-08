package com.cydeo.pages;

import com.cydeo.utilites.BrowserUtils;
import com.cydeo.utilites.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OnlineStatusPageMagbule {



    public OnlineStatusPageMagbule(){
        PageFactory.initElements(Driver.getDriver(),this);
    }



    @FindBy(xpath = "//*[@id=\"expand\"]")
    public WebElement avatarButton;

    @FindBy(xpath = "//*[@id=\"expanddiv\"]/ul/li[1]/div/a")
   public WebElement SetStatusLinkDropDown;

    @FindBy(xpath = "//div[@class='set-status-modal']")
    public WebElement OnlineStatusBox;

    @FindBy(xpath = "/html/body/div[8]/div[2]/div/div/div[1]/h3")
    public WebElement OnlineStatusText;

   @FindBy(xpath = "//label[@class='user-status-online-select__label icon-user-status-online']")
    public WebElement OnlineOption;

   @FindBy(xpath = "//label[@class='user-status-online-select__label icon-user-status-away']")
    public WebElement AwayOption;

   @FindBy(xpath = "(//em[@class='user-status-online-select__subline'])[3]/..")
    public WebElement DoNotDisturbOption;

   @FindBy(xpath = "(//em[@class='user-status-online-select__subline'])[4]/..")
    public WebElement Invisible;

   @FindBy(xpath="//div[@class='modal-wrapper modal-wrapper--normal']")
    public WebElement AnySpaceOnPage;






}
