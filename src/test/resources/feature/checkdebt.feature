@services
Feature: Check personal debt

  Background: Authorization
    Given User is logged in

  Scenario: Check no personal debt
      Given User is on the main page
      When User checks personal debt
      Then User has no personal debt