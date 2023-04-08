Feature: Online status function


  User story: View and Change Online Status

  Background:
    Given user navigates to the URL "HECTORWARE-QA"
    When user click to the avatar

  @Magbule1
  Scenario:User can view "Set status" text link at the second row
  of the dropdown menu when they click the avatar which is at the
  top right side of the page.


    Then verify user view Set status message at second row of  dropdown menu


   @Magbule2
    Scenario:User should click the "Set status" link text on the dropdown menu,
    than the "Online status" box need to appear at the middle of the page.


    When Click to the Set status link text.
    Then verify user view Online status box.

  @Magbule3
Scenario: User should see 4 options under the "Online status"
text to change the "Online status" by clicking the options.
"Online" option need to be at the left top, "Away" option need to be at the right top,
"Do not disturb" option at the left bottom under the "Online" options,
"Invisible" option at the right bottom under the "Away" option.


    Then verify user view Set status message at second row of  dropdown menu
    When Click to the Set status link text.
    Then verify user view Online status box.
          When User see Online status text.
          And User see Online option need to be at the left top
          And User see Away option need to be at the right top
          And User see Do not disturb Mute all notifications option need to be at the left bottom
          And User see Invisible Appear offline option need to be at the right bottom
          Then verify user click the Online option.
          Then verify user click the Away option.
          Then verify user click the Do not disturb option.
          Then verify user click the Invisible option.
   @Magbule4

    Scenario: User should click anywhere on the webpage to close the Online status box

      Then verify user click any space on the page to close the Online status box
@Magbule5
      Scenario: User should see one of the chosen option under profile drop down menu

        Then verify user view Set status message at second row of  dropdown menu
        When Click to the Set status link text.
        Then verify user view Online status box.
        When User see Online status text.
        And User see Online option need to be at the left top
        And User see Away option need to be at the right top
        And User see Do not disturb Mute all notifications option need to be at the left bottom
        And User see Invisible Appear offline option need to be at the right bottom
        Then verify user click the Online option.
        Then verify user click the Away option.
        Then verify user click the Do not disturb option.
        Then verify user click the Invisible option.

        When user click any space on page
        Then verify user see Online text under drop down menu
        Then verify user see Away text under drop down menu
        Then verify user see Do not disturb text under drop down menu
        Then verify user see Invisible under drop down menu

  @Magbule6
  Scenario Outline:verify Online status
    Examples:

    Given user navigates to the URL "HECTORWARE-QA"
    When user click to the avatar
    Then verify user view Set status message at second row of  dropdown menu
    And user click on "<currentStatus>"
    And user click on "<afterStatus>" option
    Then verify user see"<currentStatus>" changed.


      | currentStatus  | afterStatus    |
      | Set status     | Online         |
      | Online         | Away           |
      | Away           | Do not disturb |
      | Do not disturb | Invisible      |


