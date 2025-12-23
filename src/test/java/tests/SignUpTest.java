package tests;

import org.automationexercise.pages.AccountCreatedPage;
import org.automationexercise.pages.BasePage;
import org.automationexercise.pages.LoginPage;
import org.automationexercise.pages.SignUpPage;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SignUpTest extends BaseTest {
    @Test
    public void  verifyACCOUNTCREATEDIsVisible(){
        SoftAssert softAssert = new SoftAssert();
        SignUpPage signUpPage = new SignUpPage();
        LoginPage loginpage = new LoginPage();
        AccountCreatedPage accountCreatedPage = new AccountCreatedPage();
        loginpage.openPage();
        loginpage.fillName("Test");
        loginpage.fillEmail("811bxp@mechanicspedia.com");
        loginpage.clickSignupButton();
        signUpPage.fillAccountInformation("Mrs","Jenny","bemiwi2134@jxbav.com","test1234","4","9","2005",true,true);
        signUpPage.fillAddressInformation("Jennifer","Lopez","Sony","Hollywood","Brooklyn","United States","california","Los Angeles","002","12345689");
        signUpPage.clickOnCreateAccountButton();
        softAssert.assertTrue(accountCreatedPage.isACCOUNTCREATEDTEXTVisible());
        softAssert.assertAll();
    }
}
