package com.cydeo.step_definitions;

import com.cydeo.pages.CalendarPageByMeri;
import com.cydeo.utilites.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CalendarByMeri_StepDefinitions {

    CalendarPageByMeri calendarPageByMeri = new CalendarPageByMeri();
    Faker faker = new Faker();


    @When("User click on calendar button")
    public void user_click_on_calendar_button() {

        calendarPageByMeri.calendarBtn.click();
    }
    @Then("User should see  new event")
    public void user_should_see_new_event() {

        Assert.assertTrue(calendarPageByMeri.newEventBtn.isDisplayed());
    }
    @When("User click to new event button")
    public void user_click_to_new_event_button() {

       calendarPageByMeri.newEventBtn.click();

    }
    @Then("User should see in right side Event title field")
    public void user_should_see_in_right_side_event_title_field() {

        Assert.assertTrue(calendarPageByMeri.eventTitleField.isDisplayed());

    }
   //Select select = new Select((WebElement) calendarPageByMeri.showSharedField);
    @Then("User  fill all the fields")
    public void user_fill_all_the_fields() {
        calendarPageByMeri.eventTitleField.sendKeys(faker.name().title());
        calendarPageByMeri.firstDate.clear();
        calendarPageByMeri.firstDate.sendKeys("16.03.2023");
        calendarPageByMeri.secondDate.clear();
        calendarPageByMeri.secondDate.sendKeys("17.03.2023");
        calendarPageByMeri.location.sendKeys(faker.country().name());
        calendarPageByMeri.description.sendKeys(faker.letterify("Some text"));
        //select.selectByIndex(1);


    }
    @Then("User should see in calendar event")
    public void user_should_see_in_calendar_event() {

    }
}
