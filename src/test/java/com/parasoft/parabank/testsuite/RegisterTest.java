package com.parasoft.parabank.testsuite;

import com.parasoft.parabank.pages.HomePage;
import com.parasoft.parabank.pages.RegisterPage;
import com.parasoft.parabank.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterTest extends TestBase {

    RegisterPage registerPage = new RegisterPage();
    HomePage homePage = new HomePage();

    @Test
    public void userShouldRegisterAccountSuccessfully() {
        homePage.setClickRegister();
        Assert.assertEquals(registerPage.verifySignUpEasyMessage(),"Signing up is easy!","");
        registerPage.enterFirstName("sam");
        registerPage.enterLastName("Patil");
        registerPage.enterAddress("Mumbai High Street");
        registerPage.enterCityName("Mumbai");
        registerPage.enterStateName("Maharastra");
        registerPage.enterZipCode("m2569846");
        registerPage.enterPhoneNumber("07566677788899");
        registerPage.enterSSNNumber("786786");
        registerPage.enterUserName("sunderprem");
        registerPage.enterPassword("123456");
        registerPage.setReconfirmPassword("123456");
        registerPage.setClickRegister1();


    }
}
