@dropdown
Feature: Navigating to specific accounts in Account Activity

  Scenario: Savings account redirect
    Given the user is logged in
    When the user clicks on Savings link on the Account Summary page
    Then the Account Activity page should be displayed
    And Account drop down should have "Savings" option selected

  Scenario: Brokerage account redirect
    Given the user is logged in
    When the user clicks on Savings link on the Account Summary page
    Then the Account Activity page should be displayed
    And Account drop down should have "Brokerage" option selected

  Scenario: Checking account redirect
    Given the user is logged in
    When the user clicks on Savings link on the Account Summary page
    Then the Account Activity page should be displayed
    And Account drop down should have "Checking" option selected

  Scenario: Credit Card account redirect
    Given the user is logged in
    When the user clicks on Savings link on the Account Summary page
    Then the Account Activity page should be displayed
    And Account drop down should have "Credit Card" option selected

  Scenario: Loan account redirect
    Given the user is logged in
    When the user clicks on Savings link on the Account Summary page
    Then the Account Activity page should be displayed
    And Account drop down should have "Loan" option selected