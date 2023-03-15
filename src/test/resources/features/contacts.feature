Feature: Contacts function

  User story: As a user, I should be able to create a new contact so that I can communicate with



  Scenario: User can create a new contact by clicking "+ New contact" button

    Given login to the "HECTORWARE-QA"
    And Navigate to Contacts module on the left side of the page
    When Click New contact button
    And Enter "name" in to Name inbox
    And Enter "company" in to Company inbox
    And Enter "title" in to Title inbox
    And Click any empty area on the page
    Then Verify new contact is shown in contact list

