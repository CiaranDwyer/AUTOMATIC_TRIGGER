package com.codewithciaran.Browser_BaseSetup;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.DriverManagerType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class BaseSetup {

    /* CREATE A GLOBAL STATIC DRIVER VARIABLE SO IT CAN BE USED IN THE ENTIRE CLASS BY ALL METHODS */
    public static WebDriver driver;
    public static Properties myProperties;

    public WebDriver browserConfiguration() throws IOException {

        myProperties = new Properties();
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        FileInputStream myFileInputStream = new FileInputStream(System.getProperty("user.dir") + "/src/main/java/com/codewithciaran/Resources/global_data.properties");
        myProperties.load(myFileInputStream);

        /* PULL DATA FROM THE PROPERTIES FILE */
        //String myURL = myProperties.getProperty("url");
        String myBrowser = myProperties.getProperty("browser");

        if(myBrowser.equalsIgnoreCase("chrome")) {

            WebDriverManager.getInstance(DriverManagerType.CHROME).setup();
            driver = new ChromeDriver();
            System.out.println("STARTING AND LOADING CHROME BROWSER CONFIGURATION !!");


        } else if(myBrowser.equalsIgnoreCase("firefox")) {
            WebDriverManager.getInstance(DriverManagerType.FIREFOX).setup();
            driver = new FirefoxDriver();
            System.out.println("STARTING AND LOADING FIREFOX BROWSER CONFIGURATION !!");

        } else if(myBrowser.equalsIgnoreCase("safari")) {
            WebDriverManager.getInstance(DriverManagerType.SAFARI).setup();
            driver = new SafariDriver();
            System.out.println("STARTING AND LOADING FIREFOX BROWSER CONFIGURATION !!");

        } else {
            System.out.println("PLEASE ADD THE BROWSER TYPE IN THE CONFIGURATION FILE !!");
        }

        System.out.println("NAVIGATING TO THE TEST URL !!");
        driver.navigate().to(myProperties.getProperty("url"));
        return driver;
    }

    /* ALWAYS HAVE A WEB-DRIVER RETURN METHOD IN YOUR TEST - BEST PRACTISE */
    public static WebDriver get_WebDriver_Object() {
        return driver;
    }
}
