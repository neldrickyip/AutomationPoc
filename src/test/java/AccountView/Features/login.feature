Feature: feature to test mapping view functionality
  Scenario: check create mapping dialog is able display
    Given user is on mapping view
    When user click add button on bottom right
    Then mapping dialog is able to display
