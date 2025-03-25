package selenium_basics;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_Multiple_Handle {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		//getWindowHandle
		
	String parenthandle=driver.getWindowHandle();
	System.out.println(parenthandle);
		
		//getWindowHandles
	driver.findElement(By.linkText("Facebook")).click();
	Set<String>childwindow=driver.getWindowHandles();
	System.out.println(childwindow);
	for(String window:childwindow)
	{
		driver.switchTo().window(window);
		
		

	}
	driver.switchTo().window(parenthandle);
	driver.quit();
	}
}




