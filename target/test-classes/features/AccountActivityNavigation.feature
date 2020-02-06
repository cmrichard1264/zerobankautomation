@navigation
Feature: Navigating to specific accounts in Account Activity

  @test
  Scenario Outline: <option> is selected
    Given the user is logged in
    When the user clicks on "<option>" link on the Account Summary page
    Then the Account Activity page should be displayed
    And Account drop down should have "<option>" option selected
    Examples:
    |option      |
    |Savings     |
    |Brokerage   |
    |Checking    |
    |Credit Card |
    |Loans       |











