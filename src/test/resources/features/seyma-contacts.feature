Feature: Default

	#*US:*
	#
	#As a user, I should be able to create a new contact so that I can communicate with
	#
	#*AC:*
	#
	#*User can create a new contact by clicking "New contact" button
	#*Name, Company and Title information must be filled
	#*Name  can contain up to 20 characters, uppercase and lowercase letters and space but cannot contain special and numeric characters
	#* Company’s name can contain up to 20 characters, uppercase and lowercase letters and space but cannot contain special and numeric characters
	#* Title can contain up to 10 characters, uppercase and lowercase letters and space but cannot contain special and numeric characters
	#*Created contact should be shown in list
	#*When click on a contact, user can see detail information page
	@seyma
	@HEC10-147

		Scenario: User can create a new contact by clicking "+ New contact" button
		
		    Given login to the "HECTORWARE-QA"
		    And Navigate to Contacts module on the left side of the page
		    When Click New contact button
		    And Enter "name" in to Name inbox
		    And Enter "company" in to Company inbox
		    And Enter "title" in to Title inbox
		    And Click any empty area on the page
		    Then Verify new contact is shown in contact list