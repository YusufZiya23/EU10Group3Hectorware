Feature: Database testing
  Background: Login to librarian and search for users
    Given that you are in library and log in as librarian
    When you are at "users"

#Verify that we can navigate to Users successfully
#Verify that we can navigate to Users successfully
  Scenario: Login as LIBRARIAN or STUDENT
    Then you should see "users" into URL

#Verify that after searching by Id on search box, it will show all info for that user
#Verify that after searching by Id on search box, it will show all info for that user
  Scenario: Checking information for one account
    And you can search for users All
    And you search for user Id "10189"
    Then print all the information for that row

# Verify that after searching by Id UI information's matches with database information
# Verify that after searching by Id UI information's matches with database information
  Scenario Outline: Checking information UI  vs DataBase
    And you can search for users All
    And you search for user Id "<ID>"
    Then UI part must match with DataBase for given ID "<ID>"
    Examples:
      | ID    |
      | 10190 |