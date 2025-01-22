package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Executor {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        System.setProperty("web.driver.chrome","chromedriver.exe");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.reserveamerica.com");

        WebElement signUp = driver.findElement(By.cssSelector("#container > div > nav > div > div > div.main-header-wrapper > div.topbar-navigation__row-2.hidden-xs > div.main-header__links.home-page > div > div > div.menu-item__container.menu-item__container--vertical > a > div.menu-item__text-container--vertical > div"));

        ((JavascriptExecutor)driver).executeAsyncScript("arguments[0].click()", signUp);
        driver.close();
    }
}
