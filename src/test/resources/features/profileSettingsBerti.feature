Feature: Profile information

  Background: Login in the hectorware
    Given that you are in hectorWare
    And that you are in profile module information

  #Full name verification
  #Full name verification
  @fullname @berti
  Scenario Outline: Verify the FULL NAME field with VALID input

    When you write "<valid>" input on the full name field
    Then you should see the "<expected>" on the full name
    Examples:
      | valid        | expected     |
      | Albert Shima | Albert Shima |
      | berti        | berti        |

  #EMAIL VERIFICATION
  #EMAIL VERIFICATION
  @email @berti
  Scenario Outline: Verify the EMAIL field with VALID input

    When you write "<input>" input on email field
    And going form email to dashboard and again to profile module
    Then you should see the "<expected>" on the email field

    @validemail
    Examples: Valid input
      | input              | expected           |
      | albertsh@gmail.com | albertsh@gmail.com |
      | shalbert@gmail.com | shalbert@gmail.com |

  @email @berti
  Scenario Outline: Verify the EMAIL field with INVALID input

    When you write "<invalid>" input on email field
    And going form email to dashboard and again to profile module
    Then you should not see the "<invalid>" on the email field


    @invalidemail
    Examples: Valid input
      | invalid           |
      | albertsh@gmail    |
      | albertshgmail.com |
      | 123456789         |
      |                   |

  #Phone number VERIFICATION
  #Phone number VERIFICATION
  @phonenumber @berti
  Scenario Outline: Verify the PHONE NUMBER field with VALID input

    When you write "<input>" input on phone number field
    And going form phone number to dashboard and again to profile module
    Then you should see the "<expected>" on the phone number field

    @validphonenumber
    Examples: Valid input
      | input      | expected   |
      | 0692724576 | 0692724576 |
      | 0175638723 | 0175638723 |

  @phonenumber @berti
  Scenario Outline: Verify the PHONE NUMBER field with INVALID input
    When you write "<invalid>" input on phone number field
    And going form phone number to dashboard and again to profile module
    Then you should not see the "<invalid>" on the phone number field

    @invalidphonenumber
    Examples: Invalid input
      | invalid    |
      | sakdjh3424 |
      | letters    |
      | lette123rs |
      |            |

  #Language dropdown verification
  #Language dropdown verification
  @language @berti
  Scenario: Checking all options for the LANGUAGE drop down list

    When you click profile module
    And when you click setting under profile module
    Then you should see all the options of dropdown


