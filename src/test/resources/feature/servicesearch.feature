@services
Feature: Search service

  Background: Authorization
    Given User is logged in

  Scenario Outline: Search some services
      Given User is on the main page
      When User opens search dialog
      And User puts search query "<query>"
      Then User should be on the search result page
      And Search result is "<result>" and "<details>"

   Examples:
     | query               | result                                                                                 | details                             |
     | паспорт рф          | Результаты поиска                                                                      | Паспорт гражданина РФ               |
     | заграничный паспорт | Результаты поиска                                                                      | Заграничный паспорт старого образца |
     | абракадабра         | Ничего не найдено. Попробуйте исправить поисковый запрос или найдите услугу в каталоге |                                     |