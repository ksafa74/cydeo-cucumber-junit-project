Feature: Cydeo Web tables login functionality

  Agile Story: As a user, I should be able to login to the Cydeo Web Tables
  application with valid credentials

  Scenario: Login Scenario

    Given user is on Cydeo Web Tables login page
    When user enters valid username
    And user enters valid password
    And user clicks Login button
    Then user should see that URL ends with the word “orders”

  Scenario: Login Scenario 2

    Given user is on Cydeo Web Tables login page
    When user enters "Test" username and "Tester" password
    And user clicks Login button
    Then user should see that URL ends with the word “orders”

  Scenario: Login Scenario 3

    Given user is on Cydeo Web Tables login page
    When user enters below correct credentials
      | userName | Test   |
      | password | Tester |
    And user clicks Login button
    Then user should see that URL ends with the word “orders”