package com.zerobank.pages;


import com.zerobank.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class AccountActivityPage extends BasePage{

    @FindBy(xpath = "//select[@name=\"accountId\"]")
    public WebElement accountDropdown;

    public WebElement dropdownOption(String option){
      WebElement element = Driver.get().findElement(By.xpath("//option[text()=\""+option+"\"]"));
      return element;
    }



}
