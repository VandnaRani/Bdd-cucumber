Feature: Facebook login feature

  Scenario: Facebook login with invalid username testdata sceanrio
    Given Open any browser with fb URL
    When user will type valid password
    And Type invalid username
    And user clicks on login button
    Then system should display error message

  Scenario: Facebook login with invalid password testdata scenario
    Given Open any browser with fb URL
    When user will type valid email
    And Type invalid password
    And user clicks on login button
    Then System should display error message
