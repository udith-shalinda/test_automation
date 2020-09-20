package com.test.qa.pageobjects.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;

import com.test.qa.pageobjects.utils.PageBase;

/**
 * LoginSecurePage.java - class to verify LoginSecure Page functions Created by
 * SrirankanK on 10/3/2018.
 */
public class LoginSecurePage extends PageBase {
    private static final Logger LOGGER = Logger.getLogger(LoginSecurePage.class);

    private static By hdrLoginSecure = By.xpath("//h2");
    private static By alertMessage = By.id("flash");
    private static By buttonLogout = By.xpath("//a[@href='/logout']");

    public static boolean isLoginSecurePageDisplayed(){
        return getDriver().findElement(hdrLoginSecure).isDisplayed();

    }

    public static boolean isAlertDisplay(){
        return getDriver().findElement(alertMessage).isDisplayed();
    }

    public static String getAlertContent(){
        waiTillVisible(alertMessage,10);
        String result =  getDriver().findElement(alertMessage).getText();
        System.out.println("message"+result);
        return  result;

    }

    public static void clickLogoutButton(){
        getDriver().findElement(buttonLogout).click();
    }
}
