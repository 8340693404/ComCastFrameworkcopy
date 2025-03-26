package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IS_selected_Displayed {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/register");

        // is displayed

        // boolean status = driver.findElement(By.linkText("Register")).isDisplayed();

        //System.out.println(status);
        WebElement male = driver.findElement(By.id("gender-male"));
        WebElement female = driver.findElement(By.id("gender-female"));
        male.click();
        System.out.println(male.isSelected());
        driver.close();

    }

}
