package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Alerts {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        System.setProperty("web.chrome.driver","chromedriver.exe");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("file:///C:/Program%20Files/Sublime%20Text/alerts.html");
    }
}
