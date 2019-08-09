@profile
Feature: Get user docs

  Background: Authorization
    Given User is logged in

  Scenario: Show user docs page
      Given User is on the main page
      When User navigates to docs page
      Then User should be on the docs page