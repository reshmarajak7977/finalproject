package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;

public class LoginPage extends WebTestBase {
    @FindBy(xpath = "//a[@title='Profile']")
    WebElement profileBtn;

    @FindBy(xpath = "//a[text()='Login']")
    WebElement loginBtn;

    @FindBy(id = "email")
    WebElement emailBox;

    @FindBy(id = "pass")
    WebElement passwordBox;

    @FindBy(id = "send2")
    WebElement loginContinueBtn;

    public LoginPage(){
        PageFactory.initElements(driver, this);}
    public void loginClick() {
        profileBtn.click();
        loginBtn.click();
    }
    public void loginBox(String email, String password){
        emailBox.sendKeys(email);
        passwordBox.sendKeys(password);
    }
    public void loginContinue(){
        loginContinueBtn.click();
    }
}
