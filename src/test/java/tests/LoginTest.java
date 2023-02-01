package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.LoginPage;
import testbase.WebTestBase;

public class LoginTest extends WebTestBase {
    LoginPage loginPage;
    public LoginTest() {
        super();
    }

    @BeforeMethod
    public void beforeMethod() {
        initialization();
        loginPage = new pages.LoginPage();
    }

    @Test
    public void verifyLoginWithValidCredential() {
        SoftAssert softAssert = new SoftAssert();
        loginPage.loginClick();
        loginPage.loginBox(prop.getProperty("email"), prop.getProperty("password"));
        loginPage.loginContinue();
        softAssert.assertAll();
    }
    @AfterMethod
    public void afterMethod(){
        driver.close();
    }
}
