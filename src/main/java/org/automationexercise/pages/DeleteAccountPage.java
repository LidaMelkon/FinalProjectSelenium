package org.automationexercise.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DeleteAccountPage extends BasePage{
    @FindBy(css = "[data-qa ='account-deleted']")
    WebElement ACCOUNT_DELETED_TEXT;
    @FindBy(css = "[data-qa ='continue-button']")
    WebElement CONTINUE_BUTTON;


    public boolean isACCOUNTDELETEDIsVisible(){
        return isElementVisible(ACCOUNT_DELETED_TEXT);
    }
    public void clickContinueButton(){
        scrollAndClickOnElement(CONTINUE_BUTTON);
    }


}
