package org.automationexercise.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountCreatedPage extends BasePage{
    @FindBy(css = "[data-qa ='account-created']")
    WebElement ACCOUNT_CREATED_TEXT;
    @FindBy(css = "[data-qa ='continue-button']")
    WebElement CONTINUE_BUTTON;



    public boolean isACCOUNTCREATEDTEXTVisible(){
        return isElementVisible(ACCOUNT_CREATED_TEXT);
    }
    public void clickContinueButton(){
        scrollAndClickOnElement(CONTINUE_BUTTON);
    }




}
