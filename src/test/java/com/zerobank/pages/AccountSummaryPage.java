package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountSummaryPage extends BasePage {

    @FindBy(xpath = "//a[contains(@href, \"=1\")]")
    public WebElement savings;


    public void clickSavings() {
        savings.click();
    }

}
