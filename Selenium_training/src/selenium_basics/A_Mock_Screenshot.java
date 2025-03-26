package selenium_basics;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class A_Mock_Screenshot {

    public static void main(String[] args) throws Throwable {
        // TODO Auto-generated method stub
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://demowebshop.tricentis.com/");
        WebElement search = driver.findElement(By.id("small-searchterms"));
        search.sendKeys("mobiles");
        TakesScreenshot ts = (TakesScreenshot) driver;
        File srcfile = search.getScreenshotAs(OutputType.FILE);
        File destfile = new File("./screenShots/search.png");
        FileHandler.copy(srcfile, destfile);


    }

}
