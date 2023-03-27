Feature: Default

	#{*}User Story:{*}Talk functionality- Create a new conversation.  
	#
	# 
	#
	#{*}AC:2{*}. User should be  able to see conversation name box that is right in the middle of the page and type  conversation name which is no longer than 20 characters, and it can be as many words as he wants. User can put in conversation name box specia
	@HEC10-176
	Scenario: Verify that user is able to type type valid conversation name     which is no longer than 20 characters and it can be as many words as he wants.     User can put in conversation name box special characters and numbers.
		Scenario:  Verify that user is able to type type valid conversation name
		    which is no longer than 20 characters,and it can be as many words as he wants.
		    User can put in conversation name box special characters and numbers.
		
		    Given login to the hectorware
		    And navigate to talk module
		    And click the talk module
		    And  Click plus sign in order to create a new conversation
		    And Click the conversation name box
		   And Write a conversation name
		  Then verify conversation name is same as the input