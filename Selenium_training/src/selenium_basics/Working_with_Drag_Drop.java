package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Working_with_Drag_Drop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		Thread.sleep(1000);
		Actions action =new Actions(driver);
		//source webelement
		WebElement source =driver.findElement(By.id("box3"));
		//target webelement
		WebElement target =driver.findElement(By.id("box103"));
		action.dragAndDrop(source, target).build().perform();
		Thread.sleep(1000);

	}

}
