package org.automationexercise.listeners;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.automationexercise.setup.ExtentManager;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;




public class ExtentTestNGListener implements ITestListener {
    private static final ExtentReports extent = ExtentManager.getInstance();
    //   ExtentTest test = ExtentTestNGListener.getTest();
    public static ExtentTest getTest() {
        return ExtentManager.getTest();
    }
    @Override
    public void onTestStart(ITestResult result) {
        ExtentTest test = ExtentTestNGListener.getTest();
        String methodName = result.getMethod().getMethodName();
        test.info(methodName);
        test.info("------------------------------------Test Start-------------------------------------");
        test.info("-----------------------------------------------------------------------------------");

    }
    @Override
    public void onTestSuccess(ITestResult result) {
        ExtentTest test = ExtentTestNGListener.getTest();
        test.info("-----------------------------------------------------------------------------------");
        test.info("-------------------------------------Test End--------------------------------------");
        test.info("-----------------------------------------------------------------------------------");
        getTest().pass("Test Passed");
    }
    @Override
    public void onTestFailure(ITestResult result) {
        ExtentTest test = ExtentTestNGListener.getTest();
        test.fail(result.getMethod().getMethodName() + " TEST HAS FAILED");
        test.fail("----------------Test fail cause-----------------");
        getTest().fail(result.getThrowable());
    }
    @Override
    public void onTestSkipped(ITestResult result) {
        getTest().skip(result.getMethod().getMethodName() + " TEST HAS SKIPPED");
    }
    @Override
    public void onFinish(ITestContext context) {
        extent.flush();
    }
}
