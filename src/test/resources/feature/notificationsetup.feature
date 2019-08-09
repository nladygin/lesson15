@profile
Feature: Get user notification setup

  Background: Authorization
    Given User is logged in

  Scenario: Show user notification setup page
      Given User is on the main page
      When User navigates to notification setup page
      Then User should be on the notification setup page