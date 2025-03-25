package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class A_Mock_Mouse_Action {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://the-internet.herokuapp.com/context_menu");
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Actions action = new Actions(driver);
		
		// Right click
		//WebElement c=driver.findElement(By.id("hot-spot"));
		WebElement c =driver.findElement(By.id("mousehover"));
		action.moveToElement(c).build().perform();
		//driver.switchTo().alert().accept();
		

	}

}
