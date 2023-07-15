package com.codewithciaran.Resources;

import com.codewithciaran.Browser_BaseSetup.BaseSetup;
import org.openqa.selenium.WebDriver;

public class Window extends BaseSetup {

    WebDriver driver;


    public Window(WebDriver driver) {
        this.driver = driver;
    }

    public void maxWindow(){
        driver.manage().window().maximize();
    }
}
