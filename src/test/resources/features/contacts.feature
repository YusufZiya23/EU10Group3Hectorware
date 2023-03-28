Feature: Contacts function

  User story: As a user, I should be able to create a new contact so that I can communicate with



  @seyma1
  Scenario: User can create a new contact by clicking "+ New contact" button and entering the valid name, valid
  title and valid company.
  Name  can contain up to 20 characters, uppercase and lowercase letters and space but cannot contain special
  and numeric characters
  Company’s name can contain up to 20 characters, uppercase and lowercase letters and space but cannot
  contain special and numeric characters
  Title can contain up to 10 characters, uppercase and lowercase letters and space but cannot contain
  special and numeric characters


    Given login to the "HECTORWARE-QA"
    And Navigate to Contacts module on the left side of the page
    When Click New contact button
    And Enter "name" in to Name inbox
    And Enter "company" in to Company inbox
    And Enter "title" in to Title inbox
    And Click any empty area on the page
    Then Verify new contact is shown in contact list

  @seyma2

  Scenario: User can not create a new contact by entering contact information outside the specified limits, user
  should see "Invalid Name", "Invalid Title" or "Invalid Title" error message on the page
  Name  can contain up to 20 characters, uppercase and lowercase letters and space but cannot contain special
  and numeric characters
  Company’s name can contain up to 20 characters, uppercase and lowercase letters and space but cannot
  contain special and numeric characters
  Title can contain up to 10 characters, uppercase and lowercase letters and space but cannot contain
  special and numeric characters

    Given login to the "HECTORWARE-QA"
    And Navigate to Contacts module on the left side of the page
    When Click New contact button
    And Enter invalid "name" in to Name inbox
    And Enter invalid "company" in to Company inbox
    And Enter invalid "title" in to Title inbox
    And Click any empty area on the page
    Then Verify Invalid Name, Invalid Company or Invalid Title error message occurs