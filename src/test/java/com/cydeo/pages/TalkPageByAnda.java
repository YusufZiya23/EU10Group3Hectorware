package com.cydeo.pages;

import com.cydeo.utilites.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TalkPageByAnda {

    public TalkPageByAnda(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//ul[@id='appmenu']//li[4]/a")
    public WebElement Talkbutton;

    @FindBy (xpath = "//button[@class='toggle has-tooltip']")
    public WebElement PlusSignButton;

@FindBy (xpath = "//input[@placeholder='Conversation name']")
    public WebElement ConversationNameBox;


@FindBy (xpath = "//div[@class='new-group-conversation talk-modal']")
    public WebElement ConversationNameModal;


@FindBy (xpath = "//div[@aria-describedby='popover_u35bhvtm8x']//button")
    public WebElement ConversationThreeDotsButton;








}
