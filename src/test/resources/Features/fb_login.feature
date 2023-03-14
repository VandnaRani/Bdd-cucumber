
Feature:Facebook login feature

  Scenario: Facebook login with invalid testdata sceanrio
    Given Open any browser with fb URL
    When user will type invalid email and password "abc@gmail.com" and "123"
    And user clicks on login button
    Then system should display error message
    
   
Scenario Outline: Facebook login scenario with multiple test data sets

    Given Open any browser with fb URL
    When  user will type invalid email and password "<email>" and "<password>"
    And user clicks on login button
   
    Examples:
    |email |password|
    |test@gmail.com| 123|
    |test2@gmail.com|23456|
    |test3@gmail.com|65789|
   
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
