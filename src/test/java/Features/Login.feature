Feature: LoginFeature
  This feature deals with the login functionality of the application

  Scenario: Login with correct username and password
    Given I navigate to the login page
    And I enter the following for Login
    And I click login button
    Then I should see the userform page


  Scenario: Login with correct username and password
    Given I navigate to the login page
    And I enter the username as "admin" and password as "admin"
    And I click login button
    Then I should see the userform page


  Scenario: Login with correct username and password
    Given I navigate to the login page
    And I enter users email address with Email:admin
    And I verify count of salary digits for Rs 100000

    And i just need to see how cucumber java 8 looks
    And i enter following details for the login to site
      | username | password |
      | admin    | password |
    And I click login button
    Then I should see the userform page


  Scenario Outline: Login with correct username and password and Scenario Outline
    Given I navigate to the login page
    When I enter login details <username> and password as <password>
    And I click login button
    Then I should see the userform page

    Examples:
      | username | password |
      | admin    | password |
      | viral    | shah     |
      | Test     | viral    |

