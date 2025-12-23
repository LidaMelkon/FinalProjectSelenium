package tests;

import org.automationexercise.flows.SignUpFlow;
import org.automationexercise.pages.AccountCreatedPage;
import org.automationexercise.pages.HomePage;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AccountCreatedTest extends BaseTest {

    @Test
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



}

