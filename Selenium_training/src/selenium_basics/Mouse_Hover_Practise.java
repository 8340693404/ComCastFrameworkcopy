package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Hover_Practise {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		// move to element
		
		//driver.get("https://demo.opencart.com/");
		//Thread.sleep(1000);
		//Actions action=new Actions(driver);
		//WebElement desktop=driver.findElement(By.xpath("(//a[contains(text(),'Desktops')])[1]"));
		//action.moveToElement(desktop).click().build().perform();

		// context click
		
		//driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		//Actions action = new Actions(driver);
		//WebElement right_click =driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		//action.contextClick(right_click).build().perform();
		
		//
		
		driver.get("https://the-internet.herokuapp.com/context_menu");
		Thread.sleep(1000);
		Actions action = new Actions(driver);
		WebElement right_click=driver.findElement(By.id("hot-spot"));
		action.contextClick(right_click).build().perform();
		driver.switchTo().alert().accept();
		
		
	}
	

}
