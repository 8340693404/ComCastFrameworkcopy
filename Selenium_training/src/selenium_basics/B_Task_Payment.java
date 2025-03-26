package selenium_basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class B_Task_Payment {

    public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.cssSelector("input[id='user-name']")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");

        driver.findElement(By.id("login-button")).click();

        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();

        driver.findElement(By.className("shopping_cart_link")).click();

        driver.findElement(By.id("checkout")).click();

        driver.findElement(By.id("first-name")).sendKeys("mithun");
        driver.findElement(By.name("lastName")).sendKeys("mishra");
        driver.findElement(By.name("postalCode")).sendKeys("560076");

        driver.findElement(By.name("continue")).click();

        driver.findElement(By.name("finish")).click();
        String text = driver.findElement(By.className("complete-header")).getText();
        System.out.println(text);

    }

}


