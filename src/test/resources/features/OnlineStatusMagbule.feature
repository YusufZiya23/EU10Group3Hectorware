Feature: Online status function


  User story: View and Change Online Status

  Background:
    Given user navigates to the URL "HECTORWARE-QA"
    When user click to the avatar

  @Magbule
  Scenario:User can view "Set status" text link at the second row
  of the dropdown menu when they click the avatar which is at the
  top right side of the page.


    Then verify user view Set status message at second row of  dropdown menu


   @Magbule
    Scenario:User should click the "Set status" link text on the dropdown menu,
    than the "Online status" box need to appear at the middle of the page.


    When Click to the Set status link text.
    Then verify user view Online status box.

Scenario: User should see 4 options under the "Online status"
text to change the "Online status" by clicking the options.
"Online" option need to be at the left top, "Away" option need to be at the right top,
"Do not disturb" option at the left bottom under the "Online" options,
"Invisible" option at the right bottom under the "Away" option.

          When User see "Online status" text. And  the options by the right order.
          And  User click the "Online" option.
          Then verify user click the "Away" option   .