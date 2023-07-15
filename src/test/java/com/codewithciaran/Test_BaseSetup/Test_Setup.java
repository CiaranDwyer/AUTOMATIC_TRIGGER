package com.codewithciaran.Test_BaseSetup;

import com.codewithciaran.Browser_BaseSetup.BaseSetup;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import java.io.IOException;

public class Test_Setup {

    WebDriver driver;
    BaseSetup baseSetup;

    @BeforeSuite
    public void call_BaseSetup() throws IOException, InterruptedException {

        baseSetup = new BaseSetup();
        driver = baseSetup.browserConfiguration();
    }


    @AfterSuite
    public void tearDown() {
        driver.quit();
    }
}
