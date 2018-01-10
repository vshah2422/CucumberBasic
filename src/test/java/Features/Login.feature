Feature: LoginFeature
  This feature deals with the login functionality of the application


  Scenario: Login with correct username and password
    Given I navigate to the login page
    And i enter following details for the login to site
      | username | password |
      | admin    | password1 |
    And I click login button
    Then I should see the userform page

