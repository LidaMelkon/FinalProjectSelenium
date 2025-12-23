package tests;


import org.automationexercise.flows.SignUpFlow;
import org.automationexercise.pages.AccountCreatedPage;
import org.automationexercise.pages.DeleteAccountPage;
import org.automationexercise.pages.HomePage;
import org.automationexercise.pages.LoginPage;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HomePageTest extends BaseTest {

    @Test
    public void verifyHomePageIsVisible(){
        SoftAssert softAssert = new SoftAssert();
        HomePage homePage = new HomePage();
        homePage.openPage();
        softAssert.assertTrue(homePage.isHomePageVisible(),"Home page is NOT visible.");
        softAssert.assertAll();

    }
    @Test
    public void verifyNewUserSignupIsVisible(){
        SoftAssert softAssert = new SoftAssert();
        HomePage homePage = new HomePage();
        LoginPage loginPage = new LoginPage();
        homePage.openPage();
        homePage.clickSignupLogin();
        softAssert.assertTrue(loginPage.isNewUserSignUpVisible(), "'New User Signup!' is NOT visible");
        softAssert.assertAll();
    }
    @Test
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

