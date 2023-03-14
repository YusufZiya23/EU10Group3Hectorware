Feature: Profile information

  @berti
  Scenario: Checking all options for the LANGUAGE drop down list

    Given that you are in hectorWare
    When you click profile module
    And when you click setting under profile module
    Then you should see all the options of dropdown