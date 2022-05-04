package com.parasoft.parabank.pages;

import com.parasoft.parabank.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    By username = By.xpath("//input[@name='username']");
    By password  = By.xpath("//body/div[@id='mainPanel']/div[@id='bodyPanel']/div[@id='leftPanel']/div[@id='loginPanel']/form[1]/div[3]/input[1]");
    By loginButton = By.xpath("//input[@value='Log In']");
    By actualMessage = By.xpath("");
    By actualMessage1 = By.xpath("//p[text()='The username and password could not be verified.']");
    By logout = By.xpath("//a[text()='Log Out']");

    public void enterUserName(String text) { sendTextToElement(username,text);}
    public void enterPassword(String text) { sendTextToElement(password,text);}
    public void clickOnLoginButton() { clickOnElement(loginButton);}
    public String verifyAccountOverview() {
        return getTextFromElement(actualMessage);
    }
    public String verifyTheErrorMessage() {
        return getTextFromElement(actualMessage1);
    }
}
