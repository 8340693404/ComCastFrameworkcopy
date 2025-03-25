package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Working_with_Context_Click {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Actions action = new Actions(driver);
		//WebElement right_click=driver.findElement(By.xpath("//span[contains(text(),'right')]"));
		//action.contextClick(right_click).build().perform();
		WebElement mouse=driver.findElement(By.id("mousehover"));
		action.contextClick(mouse).click().build().perform();
		WebElement top=driver.findElement(By.linkText("Top"));
		action.click().perform();

	}

}
