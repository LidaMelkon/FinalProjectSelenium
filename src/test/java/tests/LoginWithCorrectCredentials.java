package tests;

import org.automationexercise.flows.SignUpFlow;
import org.automationexercise.pages.AccountCreatedPage;
import org.automationexercise.pages.DeleteAccountPage;
import org.automationexercise.pages.HomePage;
import org.automationexercise.pages.LoginPage;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginWithCorrectCredentials extends BaseTest{
    @Test(priority = 1)
    public void verifyHomePageIsVisible(){
        SoftAssert softAssert = new SoftAssert();
        HomePage homePage = new HomePage();
        homePage.openPage();
        softAssert.assertTrue(homePage.isHomePageVisible(),"Home page is NOT visible.");
        softAssert.assertAll();

    }
    @Test(priority = 2)
    public void verifyLoginToYourAccountIsVisible(){
        HomePage homePage = new HomePage();
        SoftAssert softAssert = new SoftAssert();
        LoginPage loginPage = new LoginPage();
        HomePageTest homePageTest = new HomePageTest();
        homePageTest.verifyHomePageIsVisible();
        homePage.clickSignupLogin();
        softAssert.assertTrue(loginPage.isLoginToYourAccountIsVisible(),"'Login to your account' is NOT visible");

    }
    @Test(priority = 3)
    public void verifyLoggedInAsUsernameIsVisible(){
        SoftAssert softAssert = new SoftAssert();
        SignUpFlow signUpFlow = new SignUpFlow();
        AccountCreatedPage accountCreatedPage = new AccountCreatedPage();
        HomePage homePage = new HomePage();
        signUpFlow.registerNewUser("test","test123hfhfdg@test.com");
        accountCreatedPage.clickContinueButton();
        softAssert.assertTrue(homePage.isLoggedInAsUsernameIsVisible(),"'Logged in as username' is NOT visible");
        softAssert.assertAll();


    }
    @Test(priority = 4)
    public void verifyACCOUNTDELETEDIsVisible(){
        SoftAssert softAssert = new SoftAssert();
        HomePage homePage = new HomePage();
        SignUpFlow signUpFlow = new SignUpFlow();
        AccountCreatedPage accountCreatedPage = new AccountCreatedPage();
        DeleteAccountPage deleteAccountPage = new DeleteAccountPage();
        signUpFlow.registerNewUser("test1", "test59hgdgh@test.com");
        accountCreatedPage.clickContinueButton();
        homePage.clickDeleteAccount();
        softAssert.assertTrue(deleteAccountPage.isACCOUNTDELETEDIsVisible(),"'ACCOUNT DELETED!' is NOT visible");
        deleteAccountPage.clickContinueButton();
        softAssert.assertAll();

    }

}
