package selenium_basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		//click on book link
		driver.findElement(By.partialLinkText("Books")).click();
		Thread.sleep(1000);
		
		//sort by dropdown
		
	WebElement sort=	driver.findElement(By.id("products-orderby"));
	Select obj =new Select(sort);
	//obj.selectByVisibleText("Price: Low to High");
	
	//display dropdown
	
	//WebElement display =driver.findElement(By.id("products-pagesize"));
	//Select obj1=new Select(display);
	//obj1.deselectByVisibleText("12");
	//Thread.sleep(1000);
	
	//GET OPTIONS METHOD
	List<WebElement>sortby_values=obj.getOptions();
	
	//ITERATE ON THE LIST TO PRINT THE VALUES
	for(WebElement value:sortby_values)
	{
		System.out.println(value.getText());
	}
	
	
	
	

	}

}
