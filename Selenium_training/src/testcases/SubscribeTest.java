package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class SubscribeTest {
    @Test
    public void subscribetest() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        Reporter.log("app launched successfully");
        driver.findElement(By.id("newsletter-email")).sendKeys("abcde22@gmail.com");
        driver.findElement(By.id("newsletter-subscribe-button")).click();
        driver.close();
        Reporter.log("subscribe testcase completed");
    }

}
