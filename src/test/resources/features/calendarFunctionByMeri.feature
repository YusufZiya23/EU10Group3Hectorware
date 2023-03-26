Feature: calendar functionality
  @meri
  Scenario: User can see the Calendar module and create new event
    Given User is on home page
    When User click on calendar button
    Then User should see  new event
    When User click to new event button
    Then User should see in right side Event title field
    And User enters random text in title field
    And  User  fills date "26.03.2023" and time "10.00" and "11.00" in both fields
    And User fill other fields and click save button
    Then User should see  event date "2023-03-26" and time "10:00 - 11:00" on the calendar


    Scenario: User can see the Calendar module and
               change the view by day, week, month

      Given User is on home page
      When User click on calendar button
      Then User should see view button
      And User should be able to change by day,week,month


    Scenario: Verify that in view list page appears in English
        Given User is on home page
        When User click on calendar button
        Then User should see view button
        And User click on list option
        Then User should see "<days>" of the week in english

    | Monday  |
    | Tuesday |
    | Wednesday|
    | Thursday|
    | Friday  |
    | Saturday|
    | Sunday  |








