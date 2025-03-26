package selenium_basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_Findelements {
    public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub
        WebDriver driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
        Thread.sleep(2000);
        List<WebElement> links = driver.findElements(By.xpath("//a"));
        for (int i = 0; i <= links.size() - 1; i++) {
            String linktext = links.get(i).getText();
            System.out.println(linktext);
        }
        driver.close();


    }

}
