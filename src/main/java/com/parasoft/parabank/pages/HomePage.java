package com.parasoft.parabank.pages;

import com.parasoft.parabank.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {

    By clickRegister = By.xpath("//a[contains(text(),'Register')]");


    public void setClickRegister() { clickOnElement(clickRegister);}











}
