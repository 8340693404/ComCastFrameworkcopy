package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_Locators {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        //launch the chrome browser

        WebDriver driver = new ChromeDriver();

        //navigate to url
        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize();


        //enter the  text in search text field

        //WebElement searchfield=driver.findElement(By.name("q"));
        //searchfield.sendKeys("mobiles");
        //linktext locator
        driver.findElement(By.linkText("Register")).click();
        //partial link text
        //driver.findElement(By.partialLinkText("Shopping")).click();


    }

}
