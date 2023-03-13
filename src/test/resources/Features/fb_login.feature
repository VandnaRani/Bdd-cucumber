Feature: Facebook login feature
	Scenario: Facebook login with invalid testdata credentials
	Given Open any browser with fb URL
	When User type invalid "abc12!@gmail.com" and "ansbsbdd"
	And click on login button
	Then System should display "The email you entered isn’t connected to an account" message

	
//Scenario: Facebook login with invalid testdata credentials
	//Given Open any browser with fb URL
	//When User type invalid "abc@gmail.com" and "ansbsbdd"
	//And click on login button
	//Then System should display "The password you’ve entered is incorrect" message