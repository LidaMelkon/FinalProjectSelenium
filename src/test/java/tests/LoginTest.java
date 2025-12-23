package tests;

import lombok.extern.java.Log;
import org.automationexercise.pages.HomePage;
import org.automationexercise.pages.LoginPage;
import org.automationexercise.pages.SignUpPage;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginTest extends BaseTest{
    @Test
    public void verifyENTERACCOUNTINFORMATIONIsVisible(){
        SoftAssert softAssert = new SoftAssert();
        LoginPage loginpage = new LoginPage();
        SignUpPage signUpPage = new SignUpPage();
        loginpage.openPage();
        loginpage.fillName("Test");
        loginpage.fillEmail("pihodat530@forexru.com");
        loginpage.clickSignupButton();
        softAssert.assertTrue(signUpPage.isEnterAccountInformationIsVisible(), "'Enter Account Information' Is NOT Visible");
        softAssert.assertAll();
    }
    //(dependsOnMethods = {"HomePageTest.verifyHomePageIsVisible"})
    @Test
    public void verifyLoginToYourAccountIsVisible(){
        HomePage homePage = new HomePage();
        SoftAssert softAssert = new SoftAssert();
        LoginPage loginPage = new LoginPage();
        HomePageTest homePageTest = new HomePageTest();
        homePageTest.verifyHomePageIsVisible();
        homePage.clickSignupLogin();
        softAssert.assertTrue(loginPage.isLoginToYourAccountIsVisible(),"'Login to your account' is NOT visible");

    }

}
