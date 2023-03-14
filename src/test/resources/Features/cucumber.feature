Feature: TestDemo Php website
	Scenario: PhpDemo website scenario
	Given Open anyBrowser and type URL
	When user type invalid test data into all editboxes
	And get the captcha numbers 
	And combined two captcha numbers and send to captcha editbox
	Then click on Submit button
	And Print Thank you message
	
	Scenario Outline:PHP login scenario with multiple test data sets
	Given Open anyBrowser and type URL
	When user type invalid "<first_name>" and "<last_name>" and "<business_name>" and "<email>"
	And get the captcha numbers
	And combined two captcha numbers and send to captcha editbox
	Then click on Submit button
	And Print Thank you message
	
	Examples:
	|first_name|last_name|business_name|email|
	|Test1      |Bdd1    |testBdd1       |abc@gmail.com|
	|Test2      |Bdd2     |testBdd2      |afgs@gmail.com|
	|Test3       |Bdd3    |testBdd3       |asfg@gmail.com|