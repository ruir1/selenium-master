package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SendText {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        System.setProperty("web.driver.chrome","chromedriver.exe");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://www.wikipedia.org");

        WebElement searchBox = driver.findElement(By.id("searchInput"));
        String searchStr = "Selenium Webdriver";
        searchBox.sendKeys(searchStr);

        WebElement clickSearchButton = driver.findElement(By.cssSelector("#search-form > fieldset > button"));
        clickSearchButton.click();
    }
}
