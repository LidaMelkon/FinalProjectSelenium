package org.automationexercise.flows;

import lombok.extern.java.Log;
import org.automationexercise.pages.HomePage;
import org.automationexercise.pages.LoginPage;

public class LoginFlow {
    public void loginWithCredentials(String email, String password){
        HomePage homePage = new HomePage();
        LoginPage loginPage = new LoginPage();
        loginPage.openPage();
        loginPage.fillEmailLogin("test@test.com");
        loginPage.fillPassword("test1234");
        loginPage.clickLoginButton();
    }


}
