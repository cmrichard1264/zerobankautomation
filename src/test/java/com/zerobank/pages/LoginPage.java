package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//according to page object model design
//we have to create corresponded page class
//for each page of application
//login page = login page class
//every page class will store webelements and methods related to that page
public class LoginPage extends BasePage{


    @FindBy(xpath = "//input[@id=\"user_login\"]")
    public WebElement userInput;

    @FindBy(xpath = "//input[@id=\"user_password\"]")
    public WebElement passwordInput;

    @FindBy(xpath = "//input[@value=\"Sign in\"]")
    public WebElement signInButton;


    public void login() {
        Driver.get().get(ConfigurationReader.getProperty("url"));
        userInput.sendKeys("username");
        passwordInput.sendKeys("password", Keys.ENTER);
    }


}
