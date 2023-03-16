Feature: Profile Settings Functionality, if visiable and changeable

  @ali
  Scenario: User should see Settings under the profile module
    When User logs in with valid credentions
    And User clicks on Avatar on the rights side of the top
    Then User sees dropdown with Set status,Settings,about,help,Log out inside
    Then User Clicks on Settings button
