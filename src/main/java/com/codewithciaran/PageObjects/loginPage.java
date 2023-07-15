package com.codewithciaran.PageObjects;

import com.codewithciaran.Browser_BaseSetup.BaseSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage extends BaseSetup {

    /* CREATE A GLOBAL WEB-DRIVER VARIABLE */
    WebDriver driver;


    /* LOCATE THE REQUIRED WEB-ELEMENTS ON THE WEB PAGE */
    By USER_NAME = By.cssSelector("#user-name");
    By PASSWORD = By.cssSelector("#password");
    By LOGIN_BUTTON = By.cssSelector("#login-button");

    /* CREATE A CONSTRUCTOR AND PASS THE WEB DRIVER TO THE CLASS OBJECT */
    public loginPage(WebDriver driver) {
        this.driver = driver;
    }

    /* CLASS METHODS OR ACTIONS */
    public void enterUSERNAME(String userName) {
        driver.findElement(USER_NAME).sendKeys(userName);
    }

    public void enterPASSWRD(String password) {
        driver.findElement(PASSWORD).sendKeys(password);
    }

    public void clickLOGIN_BUTTON() {
        driver.findElement(LOGIN_BUTTON).click();
    }
}


