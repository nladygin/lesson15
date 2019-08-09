@profile
Feature: Get user cards

  Background: Authorization
    Given User is logged in

  Scenario: Show user cards page
      Given User is on the main page
      When User navigates to cards page
      Then User should be on the cards page