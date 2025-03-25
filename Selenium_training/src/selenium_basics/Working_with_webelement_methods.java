package selenium_basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_webelement_methods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		//String text=driver.findElement(By.linkText("Computers")).getText();
		//System.out.println(text);
		//driver.findElement(By.id("small-searchterms")).sendKeys("books");
		//driver.findElement(By.xpath("//input[@type='submit']")).click();
		String searchpage_text=driver.findElement(By.xpath("//input[@value='Search']")).getText();
		System.out.println("The text displayed is "+searchpage_text);
		
		//get attribute value
		
		
		//String sv=driver.findElement(By.id("newsletter-subscribe-button"))
		//.getAttribute("type");
		//System.out.println(sv);

	}

}
