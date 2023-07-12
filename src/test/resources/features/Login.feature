@regression @login
Feature: Library login feature

  User Story:
  As a user, I should be able to login with correct credentials to different
  accounts. And dashboard should be displayed.
  Accounts are: librarian, student, admin


  Background: user should be on login page for all Scenarios
  Given user is on the login page of the application

#this is how we comment in the feature file using "#"

  @librarian@smoke
  Scenario: Login as librarian
    When user enters librarian username
    And user enters librarian password
    Then user should see the dashboard

  @student@smoke
  Scenario: Login as student
    When user enters student username
    And user enters student password
    Then user should see the dashboard

  @admin@smoke
  Scenario: Login as admin
    When user enters admin username
    And user enters admin password
    Then user should see the dashboard