
Feature: Flipkart login

  Scenario Outline: application test
    Given User want to go to Application <browser>
    When User enter the <username> and <password> on login page
    Then Verify user able to successfully able to login in the application

    Examples:
    |username|password| browser  |
    |123|12344|edge              |
