Feature: Profile information

  Background: Login in the hectorware
    Given that you are in hectorWare



  Scenario: Checking all options for the LANGUAGE drop down list

    When you click profile module
    And when you click setting under profile module
    Then you should see all the options of dropdown

  @berti
  Scenario Outline: Verify the Full name field with valid input
    Given that you are in profile module information
    When you write "<valid>" input
    Then you should see the "<expected>" on the phone number
    Examples:
      | valid        | expected     |
      | Albert Shima | Albert Shima |


