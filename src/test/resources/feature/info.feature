@profile
Feature: Get user info

  Background: Authorization
    Given User is logged in

  Scenario: Show user personal page
      Given User is on the main page
      When User navigates to personal page
      Then User should be on the personal page