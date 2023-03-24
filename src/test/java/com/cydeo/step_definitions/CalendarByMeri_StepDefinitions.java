package com.cydeo.step_definitions;

import com.cydeo.pages.CalendarPageByMeri;
import com.cydeo.utilites.BrowserUtils;
import com.cydeo.utilites.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

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

    @Then("User enters random text in title field")
    public void user_enters_random_text_in_title_field() {

        calendarPageByMeri.eventTitleField.sendKeys(faker.name().title());
    }

    @Then("User  fills date {string} and time {string} and {string} in both fields")
    public void user_fills_date_and_time_and_both_fields(String date, String time1,String time2) {

        calendarPageByMeri.firstDate.click();
        calendarPageByMeri.firstDate.clear();
        //BrowserUtils.sleep(4);
        calendarPageByMeri.firstDate.sendKeys("from"+date+"at"+time1);



        calendarPageByMeri.secondDate.click();
        calendarPageByMeri.secondDate.clear();
        BrowserUtils.sleep(4);

        calendarPageByMeri.secondDate.sendKeys("to"+date+"at"+time2);
        BrowserUtils.sleep(4);

    }
    @Then("User fill other fields and click save button")
    public void user_fill_other_fields_and_click_save_button() {


        calendarPageByMeri.location.sendKeys(faker.country().name());
        calendarPageByMeri.description.sendKeys(faker.letterify("Some text"));
        BrowserUtils.sleep(4);
        //calendarPageByMeri.status.click();
        calendarPageByMeri.confirmed.click();
        calendarPageByMeri.showSharedField.click();
        calendarPageByMeri.onlyBusy.click();
        calendarPageByMeri.categories.click();
        calendarPageByMeri.meeting.click();
        calendarPageByMeri.saveBtn.click();
    }

    @Then("User should see  event date {string} and time {string} on the calendar")
    public void user_should_see_event_date_and_time_on_the_calendar(String date, String expectedTime) {



        WebElement actualTime = Driver.getDriver().findElement
                (By.xpath("//td[@data-date='" + date + "']//div[@class='fc-event-main-frame']//div[.='" + expectedTime + "']"));
        Assert.assertTrue(actualTime.isDisplayed());
        Assert.assertEquals(actualTime.getText(),expectedTime);


    }


    @Then("User should see view button")
    public void user_should_see_view_button() {

        Assert.assertTrue(calendarPageByMeri.viewBtn.isDisplayed());

    }
    @Then("User should be able to change by day,week,month")
    public void user_should_be_able_to_change_by_day_week_month() {

        calendarPageByMeri.viewBtn.click();
        calendarPageByMeri.day.click();
        calendarPageByMeri.week.click();
        calendarPageByMeri.month.click();


    }
}
