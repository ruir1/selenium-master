package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Locators {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "chromerdriver.exe");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://www.wikipedia.org");

        //locators
        //id
        Long start = System.currentTimeMillis();
        driver.findElement(By.id("js-link-box-en"));
        Long end = System.currentTimeMillis();

        System.out.println("Time needed to get a locator by ID is: " + (end - start));

        //xpath
        start = System.currentTimeMillis();
        driver.findElement((By.xpath("//*[@id=\"www-wikipedia-org\"]/main/nav[1]/div[2]")));
        end = System.currentTimeMillis();
        System.out.println("Time needed to get a locator by XPATH is: " + (end - start));

        //cssSelector
        start = System.currentTimeMillis();
        driver.findElement((By.cssSelector("#www-wikipedia-org > main > nav.central-featured > div.central-featured-lang.lang2")));
        end = System.currentTimeMillis();
        System.out.println("Time needed to get a locator by CSS is: " + (end - start));

        driver.close();

    }
}