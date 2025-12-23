package tests;

import org.automationexercise.setup.ExtentManager;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static org.automationexercise.setup.DriverManager.initWebDriver;
import static org.automationexercise.setup.DriverManager.quitDriver;

public class BaseTest {
    @BeforeMethod
    public void setUp(ITestResult result){
        System.out.println("Setting up before each test method");
        initWebDriver();
        ExtentManager.createTest(result.getMethod().getMethodName());
    }

    @AfterMethod
    public void tearDown(){
        System.out.println("Tearing down after each test method");
        quitDriver();
    }



}
