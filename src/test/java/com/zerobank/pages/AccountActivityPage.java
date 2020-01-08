package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AccountActivityPage extends BasePage{

    @FindBy(xpath = "//a[text()=\"Account Activity\"]")
    public WebElement accountActivityPage;



    public void accountActivityPageIsDisplayed(){
       Assert.assertTrue(accountActivityPage.isDisplayed());
    }


    public void AccountDropbox(String text){
        WebElement dropdown = Driver.get().findElement(By.xpath("//select[@id]"));
        Select account = new Select(dropdown);
        account.selectByVisibleText(text);
        WebElement option = Driver.get().findElement(By.xpath("//option[text()=\""+text+"\"]"));
        Assert.assertTrue(option.isSelected());
    }
}
