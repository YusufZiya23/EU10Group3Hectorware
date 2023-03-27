Feature: Default

	#{*}User Story: T{*}alk functionality- Create a new conversation.  
	#
	#{*}AC{*}: In order to create a new conversation user should be able to click the plus sign which is in the left part of the window, immediately under the talk module
	#
	# 

	@HEC10-146
		@Anda
	Scenario: 1. Verify that In order to create a new conversation user is able to click the plus sign which is in the left part of the window, immediately under the talk module
		Scenario: Verify that In order to create a new conversation
		  user is able to click the plus sign which is in the left part of the window,
		  immediately under the talk module.
		
		   Given login to the hectorware
		    And navigate to talk module
		    And click the talk module
		   Then Click plus sign in order to create a new conversation