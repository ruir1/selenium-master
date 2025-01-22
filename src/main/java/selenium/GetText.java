package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class GetText {
    public static void main(String[] args) throws Exception {
        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.driver.chrome", "chromedriver.exe");
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.get("http://www.wikipedia.org");

        WebElement titleOfWebPage = driver.findElement(By.cssSelector("#www-wikipedia-org > main > div.central-textlogo > h1 > span"));

        String titleText = titleOfWebPage.getText();

        String expectedText = "Wikipedia";

        if(titleText.equals(expectedText)){
            System.out.println("Test Passed");
        }else{
            System.out.println("Test Failed");
            driver.close();
            throw new Exception();
        }
        driver.close();
    }
}
