
Feature: TestDemo Php website
	Scenario: PhpDemo website scenario
	Given Open anyBrowser and type URL
	And user type invalid test data into all editboxes
	And get the numbers 
	And addition the above two numbers and type into Results editboxes
	When click on Submit button
	Then get the thank you message and print into console