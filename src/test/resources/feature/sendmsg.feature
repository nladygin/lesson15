@chat
Feature: Send message to support team

  Background: Authorization
    Given User is logged in

  Scenario Outline: Send message to support
      Given User is on the main page
#      When User opens chat
#      And Sends "<message>"
#      Then Message "<message>" is added to chat

    Examples:
    | message                                             |
    | Добрый день!                                        |
    | Подскажите пожалуйста как добавить фото к профайлу? |