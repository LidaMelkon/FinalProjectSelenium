package org.automationexercise.setup;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {

    // should add Singleton Pattern Support  ThreadLocal<WebDriver>.
    // browser flexibility
    // implicit/explicit wait   WaitUtils.
    //Logging log4j or SLF4J
    private static WebDriver webDriver;
    public static void initWebDriver(){
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
    }

    public static WebDriver getDriver(){
        return webDriver;
    }
    public static void quitDriver(){
        if(webDriver!=null){
            webDriver.quit();
            webDriver = null;
        }
    }
}
