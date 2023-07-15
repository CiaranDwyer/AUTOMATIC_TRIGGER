package com.codewithciaran.Resources;

import com.codewithciaran.Browser_BaseSetup.BaseSetup;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

public class SCREENSHOTS extends BaseSetup {




    public String takeScreenshot(String testName) throws IOException {

        this.driver = BaseSetup.get_WebDriver_Object();
        File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File destination = new File(System.getProperty("user.dir") + "/src/PASSED_TESTS/" + " " +testName + ".gif");
        FileUtils.copyFile(source,destination);
        return System.getProperty("user.dir") + "/src/PASSED_TESTS/" + " " + testName + ".gif";
    }
}
