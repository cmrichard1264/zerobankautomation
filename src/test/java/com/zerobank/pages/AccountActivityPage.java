package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class AccountActivityPage extends BasePage {

    @FindBy(xpath = "//a[text()=\"Account Activity\"]")
    public WebElement accountActivityPage;

    @FindBy(xpath = "//a[text()=\"Find Transactions\"]")
    public WebElement findTransactions;

    @FindBy(xpath = "//input[@name=\"fromDate\"]")
    public WebElement fromDate;

    @FindBy(xpath = "//input[@name=\"toDate\"]")
    public WebElement toDate;

    @FindBy(xpath = "//button")
    public WebElement findButton;

    @FindBy(xpath = "//*[@id=\"filtered_transactions_for_account\"]//tbody/tr/td[1]")
    public List<WebElement> foundDates;


    public void accountActivityPageIsDisplayed() {
        Assert.assertTrue(accountActivityPage.isDisplayed());
    }


    public void AccountDropbox(String text) {
        WebElement dropdown = Driver.get().findElement(By.xpath("//select[@id]"));
        Select account = new Select(dropdown);
        account.selectByVisibleText(text);
        WebElement option = Driver.get().findElement(By.xpath("//option[text()=\"" + text + "\"]"));
        Assert.assertTrue(option.isSelected());
    }

    public void FindTransactions(String start, String end) {
        BrowserUtils.wait(1);
        fromDate.sendKeys(start);
        toDate.sendKeys(end);
        BrowserUtils.wait(1);
    }

    public void sortedBetweenDates(String start, String end) {
        BrowserUtils.wait(1);
        List<Integer> dates = new ArrayList<>();
        for (WebElement date : foundDates) {
            String text = date.getText();
            text = text.substring(8, 10);
            Integer num = Integer.parseInt(text);
            dates.add(num);
        }
        start = start.substring(8, 10);
        end = end.substring(8, 10);
        Integer startNum = Integer.parseInt(start);
        Integer endNum = Integer.parseInt(end);


        for (Integer date : dates) {
            if (date >= startNum || date <= endNum) {
                System.out.println("Dates are within the range!");
            } else {
                System.out.println("Failed!");
            }
        }
    }

    public void sortedByMostRecentDate() {
        List<Integer> dates = new ArrayList<>();
        for (WebElement date : foundDates) {
            String text = date.getText();
            text = text.substring(8, 10);
            Integer num = Integer.parseInt(text);
            dates.add(num);
        }




    }
}

