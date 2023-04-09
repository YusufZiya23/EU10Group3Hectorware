Feature: calendar functionality

  Background:
    Given User is on home page
    When User click on calendar button

  Scenario: User can see the Calendar module and create new event

    Then User should see  new event
    When User click to new event button
    Then User should see in right side Event title field
    And User enters random text in title field
    And  User  fills date "03/29/2023" and time "10.00" and "11.00" in both fields
    And User fill other fields and click save button
    Then User should see  event date "2023-03-29" and time "10:00 AM - 11:00 AM" on the calendar

#User can see the Calendar module
  @HEC10-142
  Scenario: User can see the Calendar module
    Then User should see calendar module


  @HEC10-143
    Scenario: User can see the Calendar module and
               change the view by day, week, month
      Then User should see view button
      And User should be able to change by day,week,month

  @meri
    Scenario: Verify that in view list page appears in English
        Then User should see view button
        And User click on list option
        Then User should see days of the week in english

          |Saturday, Monday, Friday|

  @HEC10-203
  Scenario: Update calendar event
    Then User should see  new event
    When User click to new event button
    Then User should see in right side Event title field
    And User enters random text in title field
    And  User  fills date "04/03/2023" and time "10.00" and "11.00" in both fields
    And User fill other fields and click save button
    Then User should see  event date "2023-04-03" and time "10:00 AM - 11:00 AM" on the calendar
    And User click on that event
    And User  changes title in title field
    Then User clicks update button
    Then user clicks on that event and delete it










