package org.automationexercise.setup;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {
    private static final ThreadLocal<ExtentTest> test = new ThreadLocal<>();
    private static ExtentReports extent;
    static {
        if (extent == null) {
            ExtentSparkReporter spark = new ExtentSparkReporter("test-output/report.html");
            extent = new ExtentReports();
            extent.attachReporter(spark);
            extent.setSystemInfo("OS", System.getProperty("os.name"));
        }
    }
    public static ExtentReports getInstance() {
        return extent;
    }
    public static ExtentTest getTest() {
        return test.get();
    }
    public static ExtentTest createTest(String methodName) {
        ExtentTest extentTest = extent.createTest(methodName);
        test.set(extentTest);
        return extentTest;
    }
    public static void removeTest() {
        test.remove(); // recommended to prevent memory leaks
    }

}
