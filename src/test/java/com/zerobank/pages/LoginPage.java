package com.zerobank.pages;

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

    public LoginPage() {
        //it's mandatory if you want to use @FindBy annotation
        //this means LoginPage class
        //Driver.get() return webdriver object
        PageFactory.initElements(Driver.get(), this);
    }

    /**
     * reusable login method
     * just call this method to login
     * provide username and password as parameters
     *
     * @param userName
     * @param password
     */
    public void login(String userName, String password) {
        userInput.sendKeys(userName);
        //Keys.ENTER to replace login click
        passwordInput.sendKeys(password, Keys.ENTER);
    }


}
