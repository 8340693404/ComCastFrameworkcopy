package selenium_basics;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot1 {

    public static void main(String[] args) throws Throwable {
        // TODO Auto-generated method stub
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://demowebshop.tricentis.com/");
        TakesScreenshot ts = (TakesScreenshot) driver;
        driver.findElement(By.id("small-searchterms")).sendKeys("mobiles");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        File srcfile = ts.getScreenshotAs(OutputType.FILE);
        File destfile = new File("./screenShots/Homepage.png");
        FileHandler.copy(srcfile, destfile);
        driver.close();


    }

}
