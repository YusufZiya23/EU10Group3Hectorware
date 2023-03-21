package com.cydeo.step_definitions;

import com.cydeo.pages.CalendarPageByMeri;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

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

    @Then("User  fill all the fields")
    public void user_fill_all_the_fields() {
        calendarPageByMeri.eventTitleField.sendKeys(faker.name().title());
        calendarPageByMeri.firstDate.clear();
        String day = "17";
        String month = "03";
        String year = "2023";
        calendarPageByMeri.firstDate.sendKeys(day+"."+month+"."+year);
        calendarPageByMeri.secondDate.clear();
        calendarPageByMeri.secondDate.sendKeys(day+"."+month+"."+year);
        calendarPageByMeri.location.sendKeys(faker.country().name());
        calendarPageByMeri.description.sendKeys(faker.letterify("Some text"));
        calendarPageByMeri.status.click();
        calendarPageByMeri.confirmed.click();
        calendarPageByMeri.showSharedField.click();
        calendarPageByMeri.onlyBusy.click();
        calendarPageByMeri.categories.click();
        calendarPageByMeri.meeting.click();
        calendarPageByMeri.saveBtn.click();







    }
    @Then("User should see calendar event")
    public void user_should_see_calendar_event() {

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
