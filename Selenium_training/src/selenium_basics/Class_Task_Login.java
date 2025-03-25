package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class_Task_Login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		driver.findElement(By.className("ico-login")).click();
		driver.findElement(By.id("Email")).sendKeys("mithunmmmmm000012345@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("123456");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
	}

}
