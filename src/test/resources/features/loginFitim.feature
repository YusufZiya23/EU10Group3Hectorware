Feature: Login function Fitim
@fitim
  Scenario:Login with valid credentials

    Given user visits Hectorware
    When user enters valid username in username field
    When user enters valid password in password field
    And user clicks the login button
    Then user should see the dashboard