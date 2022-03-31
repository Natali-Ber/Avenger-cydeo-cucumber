Feature: Vytrack Login feature

  As a user I should be able to login



  Scenario: As a user  should be able to ligin with valid credential
    Given User is on the login page
    When User enters the valid username
    And User enters the valid password
    And User clicks the login button
    Then User should be able to see "Dashboard" as title

