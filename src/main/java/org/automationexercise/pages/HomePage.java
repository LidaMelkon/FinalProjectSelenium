package org.automationexercise.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.automationexercise.constants.Constants.BASE_URL;

public class HomePage extends BasePage{

    @FindBy(xpath= "//img[@alt='Website for automation practice']")
    private WebElement PAGE_LOGO;

    @FindBy(xpath = "//a[text()=' Signup / Login']")
    private WebElement SIGNUP_LOGIN;
    @FindBy(xpath = "//a[text()=' Delete Account']")
    private WebElement DELETE_ACCOUNT;

    @FindBy(xpath= "//a[contains(text(),' Logged in as ')]")
    private WebElement LOGGED_IN_AS_USERNAME;



    public void openPage(){
        openPage(BASE_URL);
    }
    public boolean isHomePageVisible() {
        return isElementVisible(PAGE_LOGO);
    }
    public void clickSignupLogin() {
        scrollAndClickOnElement(SIGNUP_LOGIN);
    }
    public boolean isLoggedInAsUsernameIsVisible(){
        return isElementVisible(LOGGED_IN_AS_USERNAME);
    }
    public void clickDeleteAccount(){
        scrollAndClickOnElement(DELETE_ACCOUNT);
    }




}
