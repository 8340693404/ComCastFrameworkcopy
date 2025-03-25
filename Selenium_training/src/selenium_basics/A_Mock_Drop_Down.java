package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class A_Mock_Drop_Down {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://demowebshop.tricentis.com/books");
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Actions action = new Actions(driver);
		Thread.sleep(1000);
		//WebElement dd = driver.findElement(By.id("products-orderby"));
		WebElement dd=driver.findElement(By.id("dropdown-class-example"));
		//action.moveToElement(dd).click().perform();
		//action.sendKeys(Keys.ARROW_DOWN).click().perform();
		dd.click();
		dd.sendKeys(Keys.ARROW_DOWN);
		dd.sendKeys(Keys.ENTER);
		
		
		//Select obj = new Select(dd);
		//obj.selectByIndex(3);
		Thread.sleep(1000);
		
		//driver.close();

	}

}
