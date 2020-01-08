package com.zerobank.stepdefinitions;

import com.zerobank.pages.AccountActivityPage;
import com.zerobank.pages.AccountSummaryPage;
import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AccountActivityNavigationStepDefinitions {

    LoginPage loginPage = new LoginPage();
    AccountActivityPage accountActivityPage = new AccountActivityPage();
    AccountSummaryPage accountSummaryPage = new AccountSummaryPage();


    @Given("the user is logged in")
    public void the_user_is_logged_in() {
        Driver.get().get(ConfigurationReader.getProperty("url"));
        String userName = ConfigurationReader.getProperty("username");
        String password = ConfigurationReader.getProperty("password");
        loginPage.login(userName, password);
        System.out.println("User is logged in!");
    }


    @When("the user clicks on Savings link on the Account Summary page")
    public void the_user_clicks_on_Savings_link_on_the_Account_Summary_page() {
        accountSummaryPage.clickSavings();
        System.out.println("Savings link is clicked!");
    }


    @Then("the Account Activity page should be displayed")
    public void the_Account_Activity_page_should_be_displayed() {
     accountActivityPage.accountActivityPageIsDisplayed();
        System.out.println("Account Activity Page is Displayed!");
    }


    @Then("Account drop down should have {string} option selected")
    public void account_drop_down_should_have_option_selected(String option) {
     accountActivityPage.AccountDropbox(option);
        System.out.println(option+ " is selected");
    }


}
