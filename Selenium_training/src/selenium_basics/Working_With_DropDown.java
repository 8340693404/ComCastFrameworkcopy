package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Working_With_DropDown {

    public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub
        WebDriver driver = new ChromeDriver();
        //driver.get("https://demowebshop.tricentis.com/");
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
        Thread.sleep(1000);
        WebElement mm = driver.findElement(By.name("dropdown-class-example"));
        Select obj = new Select(mm);
        //obj.selectByIndex(1);
        //obj.selectByValue("Option3");
        obj.selectByVisibleText("Option2");
        Thread.sleep(1000);

        driver.close();

    }

}
