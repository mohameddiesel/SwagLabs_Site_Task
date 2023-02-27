  	Feature: Login Functionalty

  	
  	Scenario Outline: Valid Login
    Given navigated to Login Page
    When Valid username and password are entered
    And clicked on submit button
    Then user's homepage is displauyed

  	Scenario Outline: Invalid Login
    Given navigated to Login Page
    When Invalid username and password are entered
    And clicked on submit button
    Then Error massage will be displayed