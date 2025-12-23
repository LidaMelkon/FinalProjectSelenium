package tests;

import org.automationexercise.flows.SignUpFlow;
import org.automationexercise.pages.*;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class RegisterUserTest extends BaseTest {
    @Test
    public void VerifyRegisterUser(){
        SoftAssert softAssert = new SoftAssert();
        HomePage homePage = new HomePage();
        LoginPage loginPage = new LoginPage();
        SignUpPage signUpPage = new SignUpPage();
        AccountCreatedPage accountCreatedPage = new AccountCreatedPage();
        DeleteAccountPage deleteAccountPage = new DeleteAccountPage();
        homePage.openPage();
        softAssert.assertTrue(homePage.isHomePageVisible(),"Home page is NOT visible.");
        homePage.clickSignupLogin();
        softAssert.assertTrue(loginPage.isNewUserSignUpVisible(), "'New User Signup!' is NOT visible");
        loginPage.fillName("Test");
        loginPage.fillEmail("pihodssdat530@forexru.com");
        loginPage.clickSignupButton();
        softAssert.assertTrue(signUpPage.isEnterAccountInformationIsVisible(), "'Enter Account Information' Is NOT Visible");
        signUpPage.fillAccountInformation("Mrs","Jenny","bemiwi2134@jxbav.com","test1234","4","9","2005",true,true);
        signUpPage.fillAddressInformation("Jennifer","Lopez","Sony","Hollywood","Brooklyn","United States","california","Los Angeles","002","12345689");
        signUpPage.clickOnCreateAccountButton();
        softAssert.assertTrue(accountCreatedPage.isACCOUNTCREATEDTEXTVisible(),"'ACCOUNT CREATED!' is NOT visible");
        accountCreatedPage.clickContinueButton();
        softAssert.assertTrue(homePage.isLoggedInAsUsernameIsVisible(),"'Logged in as username' is NOT visible");
        homePage.clickDeleteAccount();
        softAssert.assertTrue(deleteAccountPage.isACCOUNTDELETEDIsVisible(),"'ACCOUNT DELETED!' is NOT visible");
        softAssert.assertAll();








    }
}

