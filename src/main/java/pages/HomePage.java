package pages;

import jdk.jfr.Frequency;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import util.ActionStuff;
import util.Utility;

import javax.xml.xpath.XPath;

public class HomePage extends WebTestBase {
    @FindBy(id = "search")
    WebElement searchTextBox;

    @FindBy(xpath = "//button[@title='Search']")
    WebElement searchBtn;

    @FindBy(xpath = "//a[text()='Gold Rate']")
    WebElement goldRateBtn;

    @FindBy(xpath = "//a[@class='twitter icon-twitter-01']")
    WebElement twitterIcon;

    @FindBy(xpath = "//span[text()='No, thanks']")
    WebElement popUpBlock;

    @FindBy(xpath = "//div[@class='olark-button-focus-wrapper']")
    WebElement closeBtn;

    @FindBy(xpath = "//img[@title='Mine Diamond Studded Bands Gold Ring HKRRGF1276SLB']")
    WebElement imageSelect;

    @FindBy(id = "ringSize")
    WebElement dropDown;

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    public void block(){
        Utility.waitUntilElementToBeClick(driver,closeBtn);
        closeBtn.click();
    }

    public void searchClick() {
        searchTextBox.click();
    }

    public void searchBox(String searchText) {
        searchTextBox.sendKeys(searchText);
    }

    public void searchBtnClick() {
        Utility.waitUntilElementToBeClick(driver,searchBtn);
        searchBtn.click();
    }
    public void setDrop(){
        imageSelect.click();
        dropDown.click();
        Utility.selectValue(dropDown,"byValue","610037");
    }

    public void mouseClick() {
        ActionStuff.moveToElement(driver, goldRateBtn);
        goldRateBtn.click();
    }
     public void windowClick(){
         twitterIcon.click();
        ActionStuff.switchToWindows(driver);

       // popUpBlock.click();
     }
    public void cookieAcess(){
        Utility.addCookie();
        Utility.setCookies();


    }
}