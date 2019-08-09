@services
Feature: Get funded part of the retirement pension report

  Background: Authorization
    Given User is logged in

  Scenario: Get funded part of the retirement pension report
      Given User is on the main page
      When User requests the pension report
      Then Report is created