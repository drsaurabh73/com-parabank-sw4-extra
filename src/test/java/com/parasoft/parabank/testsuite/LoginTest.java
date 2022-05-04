package com.parasoft.parabank.testsuite;

import com.parasoft.parabank.pages.HomePage;
import com.parasoft.parabank.pages.LoginPage;
import com.parasoft.parabank.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();

@Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {

    loginPage.enterUserName("SunderPraptichekam");
    loginPage.enterPassword("123456");
    loginPage.clickOnLoginButton();

    }
   @Test
   public void verifyTheErrorMessage() {
    loginPage.enterUserName("SundePraptichekam");
    loginPage.enterPassword("124567");
    loginPage.clickOnLoginButton();
       Assert.assertEquals(loginPage.verifyTheErrorMessage(),"The username and password could not be verified.","");


   }
   @Test
   public void userShouldLogoutSuccessfully() {
    loginPage.enterUserName("SunderPraptichekam");
    loginPage.enterPassword("123456");
    loginPage.clickOnLoginButton();
   loginPage.clickOnLoginButton();


   }

}
