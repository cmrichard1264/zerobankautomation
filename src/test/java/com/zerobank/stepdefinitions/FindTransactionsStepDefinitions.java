package com.zerobank.stepdefinitions;

import com.zerobank.pages.AccountActivityPage;
import com.zerobank.pages.BasePage;
import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FindTransactionsStepDefinitions {
    LoginPage loginPage = new LoginPage();
    BasePage basePage = new BasePage();
    AccountActivityPage accountActivityPage = new AccountActivityPage();


    @Given("the user accesses the Find Transactions tab")
    public void the_user_accesses_the_Find_Transactions_tab() {
       loginPage.login();
       basePage.accountActivity.click();
       accountActivityPage.findTransactions.click();
       System.out.println("User accessed Find Transaction Tab!");

    }

    @When("the user enters date range from {string} to {string}")
    public void the_user_enters_date_range_from_to(String start, String end) {
      accountActivityPage.FindTransactions(start, end);
        System.out.println("Date range inserted!");
    }

    @When("clicks search")
    public void clicks_search() {
       accountActivityPage.findButton.click();
        System.out.println("Find button is clicked!");
    }

    @Then("results table should only show transactions dates between {string} to {string}")
    public void results_table_should_only_show_transactions_dates_between_to(String start, String end) {
        accountActivityPage.sortedBetweenDates(start, end);
        System.out.println("Transactions are sored between "+start+" and "+end+"!");
    }

    @Then("the results should be sorted by most recent date")
    public void the_results_should_be_sorted_by_most_recent_date() {
        accountActivityPage.sortedByMostRecentDate();
    }

    @Then("the results table should only not contain transactions dated {string}")
    public void the_results_table_should_only_not_contain_transactions_dated(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }
}
