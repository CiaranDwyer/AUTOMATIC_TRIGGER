package com.codewithciaran.Test_BaseSetup;

import com.codewithciaran.Browser_BaseSetup.BaseSetup;
import com.codewithciaran.PageObjects.loginPage;
import com.codewithciaran.Resources.Window;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import java.io.IOException;

import static com.codewithciaran.Browser_BaseSetup.BaseSetup.myProperties;

public class Tests extends Test_Setup {



    @Test
    public void Test1() throws InterruptedException, IOException {

        loginPage loginPage = new loginPage(BaseSetup.get_WebDriver_Object());
        loginPage.enterUSERNAME(myProperties.getProperty("userName"));
        loginPage.enterPASSWRD(myProperties.getProperty("password"));
        loginPage.clickLOGIN_BUTTON();

        Window window = new Window(BaseSetup.get_WebDriver_Object());
        window.maxWindow();

    }
}
