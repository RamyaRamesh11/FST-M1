@Activity4
Feature: Data driven test without Example

  Scenario: Testing with Data from Scenario
    Given User is on the Login page
    When User enters the "admin" and "password"
    Then Read the pagetitle and confirmation message
    And Close the Browser

