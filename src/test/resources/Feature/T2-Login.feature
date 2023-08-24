Feature: verify users could use login functionality to use their accounts
  Scenario: user could login with valid email and password
    Given user is on login page
    When user login using valid email
    And user login using valid password
    And user press on login button
    Then user loggedin successfully
    And user logout to homepage
    And user went back to login page
    And user login using invalid email
    And user login using invalid password
    And user press on login button with invalid data
    Then user login is unsuccessful