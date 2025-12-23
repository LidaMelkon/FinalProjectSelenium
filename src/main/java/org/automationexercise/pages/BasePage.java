package org.automationexercise.pages;

import org.automationexercise.setup.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    WebDriver driver = DriverManager.getDriver();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    JavascriptExecutor js = (JavascriptExecutor) driver;


    public BasePage(){
        PageFactory.initElements(driver,this);
    }
    public void openPage(String url){
        driver.get(url);
    }

//    public void clickOnElement(WebElement locator){
//        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
//        element.click();
//    }
    public void scrollAndClickOnElement(WebElement locator) {
        try {
            js.executeScript("arguments[0].scrollIntoView(true);", locator);
            wait.until(ExpectedConditions.elementToBeClickable(locator));
            js.executeScript("arguments[0].click();", locator);
        } catch (Exception e) {
            System.out.println("Scroll and click failed for element: " + locator);
            e.printStackTrace();
        }
    }

    public boolean isElementVisible(WebElement locator) {
        try {
            return wait.until(ExpectedConditions.visibilityOf(locator)).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
    public void fillInput(WebElement locator, String text) {
        try {
            wait.until(ExpectedConditions.visibilityOf(locator));
            locator.clear();
            locator.sendKeys(text);
        } catch (Exception e) {
            System.out.println("Unable to fill input field: " + e.getMessage());
        }
    }
    public void clickCheckbox(WebElement locator) {
        try {
            WebElement checkbox = wait.until(ExpectedConditions.elementToBeClickable(locator));
            if (!checkbox.isSelected()) {
                checkbox.click();
            }
        } catch (Exception e) {
            System.out.println("Failed to click checkbox: " + locator);
            e.printStackTrace();
        }
    }






}
