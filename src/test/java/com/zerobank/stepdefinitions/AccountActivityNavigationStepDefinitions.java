package com.zerobank.stepdefinitions;

import com.zerobank.pages.AccountActivityPage;
import com.zerobank.pages.AccountSummaryPage;
import com.zerobank.pages.BasePage;
import com.zerobank.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AccountActivityNavigationStepDefinitions {

    LoginPage loginPage = new LoginPage();
    AccountSummaryPage accountSummaryPage = new AccountSummaryPage();
    BasePage basePage = new BasePage();
    AccountActivityPage accountActivityPage = new AccountActivityPage();


    @Given("the user is logged in")
    public void the_user_is_logged_in() {
       loginPage.login();
        System.out.println("User is logged in!");
    }

    @When("the user clicks on {string} link on the Account Summary page")
    public void the_user_clicks_on_link_on_the_Account_Summary_page(String link) {
        accountSummaryPage.clickTheLink(link);
        System.out.println("User clicked on "+link+" link!");

    }

    @Then("the Account Activity page should be displayed")
    public void the_Account_Activity_page_should_be_displayed() {
        Assert.assertTrue(basePage.accountActivity.isDisplayed());
        System.out.println(basePage.accountActivity.getText()+" is displayed!");
    }

    @Then("Account drop down should have {string} option selected")
    public void account_drop_down_should_have_option_selected(String option) {
        Assert.assertTrue(accountActivityPage.dropdownOption(option).isSelected());
        System.out.println(accountActivityPage.dropdownOption(option).getText()+" is Selected!");


    }







}
