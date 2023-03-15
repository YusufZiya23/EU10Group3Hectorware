Feature: Notes Functionality



  @Esmeraldi
  Scenario: User can create a new note text file

    Given user login with valid credentials
    When user verify and click notes icon
    And user click to create new note text file
    Then user verify new note file is created

