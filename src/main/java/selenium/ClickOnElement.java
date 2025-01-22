package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ClickOnElement {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.driver.chrome","chromedriver");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://www.wikipedia.org");

        WebElement englishButton = driver.findElement(By.id("js-link-box-en"));
        englishButton.click();

        String expectedValue = "Welcome to Wikipedia";
        WebElement titleofEnglishPage = driver.findElement(By.id("Welcome_to_Wikipedia"));

        if(titleofEnglishPage.getText().equals(expectedValue)){
            System.out.println("Test Passed");
        }else{
            System.out.println("Text has failed click() was not successful");
        }
        driver.close();
    }
}
