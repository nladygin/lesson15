@services
Feature: Get service categories

  Background: Authorization
    Given User is logged in

  Scenario: Show service categories list
      Given User is on the main page
      When User navigates to categories page
      Then User should be on the categories page
      And Categories number is 16