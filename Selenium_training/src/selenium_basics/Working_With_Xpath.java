package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_Xpath {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/");
        driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Tshirts");
        //xpath with multiple attribute
        driver.findElement(By.xpath("//input[@placeholder='Search'][@name='search]")).sendKeys("Tshirts");


    }

}
