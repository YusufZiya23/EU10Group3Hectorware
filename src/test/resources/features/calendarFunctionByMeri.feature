Feature: calendar functionality
  @meri
  Scenario: User can see the Calendar module and create new event
    Given User is on home page
    When User click on calendar button
    Then User should see  new event
    When User click to new event button
    Then User should see in right side Event title field
    And  User  fill all the fields
    Then User should see in calendar event








