package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class SearchTest {
    @Test
    public void searchtestcase() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        Reporter.log("app launched successfully");
        driver.findElement(By.id("small-searchterms")).sendKeys("computers");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        Reporter.log("search test case completed");
		driver.quit();
        System.out.println("executed");
        System.out.println("2nd exectuion");
        System.out.println("5th attempt");
        System.out.println("hiii");
        System.out.println("bye");
        System.out.println("tek pyramid");

    }
	
}
