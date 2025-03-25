package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Working_With_KeyUp_Down {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		Actions action = new Actions(driver);
		WebElement search=driver.findElement(By.id("small-searchterms"));
		
		//key up and key down
		action.moveToElement(search).click();
		action.keyDown(Keys.SHIFT).sendKeys("mobiles").keyUp(Keys.SHIFT).perform();

	
	};

}
