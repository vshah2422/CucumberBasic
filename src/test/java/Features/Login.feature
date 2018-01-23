Feature: LoginFeature
  This feature deals with the login functionality of the application





  Scenario: Login with failed  username and password
    Given I navigate to the login page
    And i enter following details for the login to site
      | username | password |
      | urviral    | Monday44 |
    And I click login button
    Then I should see failed step

  Scenario: Login with correct username and password
    Given I navigate to the login page
    And i enter following details for the login to site
      | username | password |
      | urviral    | Monday44 |
    And I click login button
    Then I should see the userform page
