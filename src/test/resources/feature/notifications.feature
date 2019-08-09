@profile
Feature: Get user notifications

  Background: Authorization
    Given User is logged in

  Scenario: Show user notifications page
      Given User is on the main page
      When User navigates to notifications page
      Then User should be on the notifications page