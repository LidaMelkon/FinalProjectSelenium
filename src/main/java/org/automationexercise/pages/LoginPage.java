package org.automationexercise.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.lang.model.element.Name;

import static org.automationexercise.constants.Constants.BASE_URL;

public class LoginPage extends BasePage {

    @FindBy(xpath = "//h2[text()='New User Signup!']")
    private WebElement NEW_USER_SIGNUP;
    @FindBy(css = "[data-qa='signup-name']")
    private WebElement NAME;
    @FindBy(css = "[data-qa='signup-email']")
    private WebElement EMAIL;
    @FindBy(css = "button[data-qa = 'signup-button']")
    private WebElement SIGNUP_BUTTON;
    @FindBy(xpath = "//h2[text()='Login to your account']")
    private WebElement LOGIN_TO_YOUR_ACCOUNT;
    @FindBy(css = "[data-qa='login-email']")
    private WebElement EMAIL_LOGIN;
    @FindBy(css = "[data-qa='login-password']")
    private WebElement PASSWORD;
    @FindBy(css = "[data-qa='login-button']")
    private WebElement LOGIN_BUTTON;


    public boolean isNewUserSignUpVisible(){
        return isElementVisible(NEW_USER_SIGNUP);
    }
    public void openPage(){
        openPage(BASE_URL + "/login");
    }
    public void fillName(String name){
        fillInput(NAME,name);
    }
    public void fillEmail(String email){
        fillInput(EMAIL,email);
    }
    public void clickSignupButton(){
        scrollAndClickOnElement(SIGNUP_BUTTON);
    }

    public boolean isLoginToYourAccountIsVisible(){
        return isElementVisible(LOGIN_TO_YOUR_ACCOUNT);
    }
    public void fillEmailLogin(String emailLogin){
        fillInput(EMAIL_LOGIN,emailLogin);
    }
    public void fillPassword(String password){
        fillInput(PASSWORD,password);
    }
    public void clickLoginButton(){
        scrollAndClickOnElement(LOGIN_BUTTON);
    }


}
