package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A_Mock_Autosuggestion {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        WebDriver driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/books");
        driver.findElement(By.id("small-searchterms")).sendKeys("comp");

    }

}
