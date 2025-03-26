package selenium_basics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A_Mock_Window_Handle {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        WebDriver driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/books");
        String parent = driver.getWindowHandle();
        //System.out.println(parent);
        driver.findElement(By.linkText("Facebook"));

        Set<String> child = driver.getWindowHandles();
        for (String window : child) {
            driver.switchTo().window(window);
            String title = driver.getTitle();
            System.out.println(title);
        }
        driver.switchTo().window(parent);


    }

}
