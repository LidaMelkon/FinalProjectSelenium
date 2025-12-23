package org.automationexercise.flows;

import org.automationexercise.pages.AccountCreatedPage;
import org.automationexercise.pages.LoginPage;
import org.automationexercise.pages.SignUpPage;

public class SignUpFlow {
    SignUpPage signUpPage = new SignUpPage();
    LoginPage loginpage = new LoginPage();
    public void registerNewUser(String name, String email){
        loginpage.openPage();
        loginpage.fillName("Test");
        loginpage.fillEmail("811p@mechanicspedia.com");
        loginpage.clickSignupButton();
        signUpPage.fillAccountInformation("Mrs","Jenny","bemiwi2134@jxbav.com","test1234","4","9","2005",true,true);
        signUpPage.fillAddressInformation("Jennifer","Lopez","Sony","Hollywood","Brooklyn","United States","california","Los Angeles","002","12345689");
        signUpPage.clickOnCreateAccountButton();
    }
}
