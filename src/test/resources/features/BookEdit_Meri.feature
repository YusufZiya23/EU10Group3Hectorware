Feature:Library edit book
 
  Background:
    Given I am on the login page
    When I login to application as a librarian
    And I navigate to "Books" page

  @meri
  Scenario: verify edit book button function
    When l can edit Book

	#US: "As a librarian I should be able to edit books"
  @HEC10-255
  Scenario: Verify book information

    Then  Verify that Edit book  have name,author,description,category,ISBN,year fields

    #US: "As a librarian I should be able to edit books"
  @HEC10-256
  Scenario: Verify book information_part2
   And Verify that year parameter should have only digits
    And Verify that all categories are in list
    Then book categories should match with database


  Scenario:
    And Librarian can select related category using dropdown
    And Librarian can use show  records dropdown for getting number
    Then Librarian can find book by using search box