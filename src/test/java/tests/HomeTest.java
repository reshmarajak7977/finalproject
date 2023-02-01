package tests;

import javafx.scene.layout.Priority;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import testbase.WebTestBase;


public class HomeTest extends WebTestBase {
    private HomePage homePage;

    public HomeTest(){
        super();
    }
    @BeforeMethod
    public void beforeMethod() {
        initialization();
        homePage = new HomePage();
    }
    @Test(priority = 1)
    public void verifySearchClick(){
        SoftAssert softAssert = new SoftAssert();
        homePage.searchClick();
        homePage.searchBox(prop.getProperty("searchText"));
        homePage.searchBtnClick();
        softAssert.assertAll();
    }

    @Test(priority = 2)
    public void verifyMouseHover(){
        SoftAssert softAssert = new SoftAssert();
        homePage.mouseClick();
        softAssert.assertAll();
    }

    @Test(priority = 3)
    public void verifyGetWindows(){
        SoftAssert softAssert = new SoftAssert();
        homePage.windowClick();
        softAssert.assertAll();

    }

    @Test(priority = 4)
    public void verifyCookies() {
        SoftAssert softAssert = new SoftAssert();
        homePage.cookieAcess();
        softAssert.assertAll();
    }
    @Test(priority=5)
    public void verifydropDown() {
        SoftAssert softAssert = new SoftAssert();
        homePage.searchBox(prop.getProperty("searchText"));
        homePage.setDrop();

    }

        @AfterMethod
    public void afterMethod(){
        driver.close();
    }

}
