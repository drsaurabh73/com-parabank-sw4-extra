package com.parasoft.parabank.pages;

import com.parasoft.parabank.utility.Utility;
import org.openqa.selenium.By;

public class RegisterPage extends Utility {

    By actualMessageSignUpEasy = By.xpath("//h1[@class='title']");
    By firstname = By.xpath("//input[@name='customer.firstName']");
    By lastname = By.xpath("//input[@name='customer.lastName']");
    By addresss = By.xpath("//input[@id='customer.address.street']");
    By cityname = By.xpath("//input[@id='customer.address.city']");
    By statename = By.xpath("//input[@id='customer.address.state']");
    By zipcode = By.xpath("//input[@id='customer.address.zipCode']");
    By phonenumber = By.xpath("//input[@id='customer.phoneNumber']");
    By ssnNumber = By.xpath("//input[@id='customer.ssn']");
    By username = By.xpath("//input[@name='customer.username']");
    By password = By.xpath("//input[@name='customer.password']");
    By reconfirmPassword = By.xpath("//input[@name='repeatedPassword']");
    By register = By.xpath("//input[@value='Register']");


    public void enterFirstName(String text) { sendTextToElement(firstname,text);}
    public void enterLastName(String text) { sendTextToElement(lastname,text);}
    public void enterAddress(String text) { sendTextToElement(addresss,text);}
    public void enterCityName(String text) { sendTextToElement(cityname,text);}
    public void enterStateName(String text) { sendTextToElement(statename,text);}
    public void enterZipCode(String text) { sendTextToElement(zipcode,text);}
    public void enterPhoneNumber(String text){ sendTextToElement(phonenumber,text);}
    public void enterSSNNumber(String text) { sendTextToElement(ssnNumber,text);}
    public void enterUserName (String text) { sendTextToElement(username,text);}
    public void enterPassword(String text) { sendTextToElement(password,text);}
    public void setReconfirmPassword(String text) { sendTextToElement(reconfirmPassword,text);}
    public void setClickRegister1 () { clickOnElement(register);}

    public String verifySignUpEasyMessage() {
        return getTextFromElement(actualMessageSignUpEasy);
    }
}
