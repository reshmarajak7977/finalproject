package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import testbase.WebTestBase;

import java.time.Duration;
import java.util.Set;

public class Utility extends WebTestBase {
    public static final long PAGE_LOAD_TIMEOUT =40;
    public static final long IMPLICITLY_WAIT = 40;

    public static void waitUntilElementToBeClick(WebDriver driver, WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(IMPLICITLY_WAIT));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }
    public static void addCookie() {
        Cookie cookie = new Cookie("hello", "friends");
        driver.manage().addCookie(cookie);

    }

    public static void setCookies() {
        Set<Cookie> cookies = driver.manage().getCookies();
        for (Cookie c : cookies) {
            System.out.println(c);
        }
    }

    public static void selectValue(WebElement element, String term, String value) {
        Select dropDown = new Select(element);
        if (term.equalsIgnoreCase("byValue")) {
            dropDown.selectByValue(value);
        } else if (term.equalsIgnoreCase("byIndex")) {
            dropDown.selectByIndex(Integer.parseInt(value));
        } else if (term.equalsIgnoreCase("byVisibleText")) {
            dropDown.selectByVisibleText(value);
        } else {
            System.out.println("Please select the correct value");
        }
    }

}
