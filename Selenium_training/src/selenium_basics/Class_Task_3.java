package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Class_Task_3 {

    public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demowebshop.tricentis.com/");
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//a[contains(text(),'Books')])[1]")).click();
        Thread.sleep(1000);
        //sort by
        WebElement nn = driver.findElement(By.id("products-orderby"));
        Select obj = new Select(nn);
        obj.selectByVisibleText("Price: Low to High");
        Thread.sleep(1000);
        //display
        WebElement mm = driver.findElement(By.name("products-pagesize"));
        Select obj1 = new Select(mm);
        obj1.selectByVisibleText("12");
        Thread.sleep(1000);
        //view as
        WebElement oo = driver.findElement(By.id("products-viewmode"));
        Select obj2 = new Select(oo);
        obj2.selectByVisibleText("List");
        Thread.sleep(1000);
        //item add to cart
        driver.findElement(By.xpath("(//input[@type='button'])[2]")).click();
        Thread.sleep(1000);


    }

}
