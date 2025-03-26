package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_Alert {

    public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub
        WebDriver driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        Thread.sleep(1000);
        //handle the alert

        driver.switchTo().alert().accept();
        driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("mobile");

    }

}
