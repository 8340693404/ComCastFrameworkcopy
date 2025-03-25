package selenium_basics;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class A_Mock_Java_Script {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	        driver.get("https://demowebshop.tricentis.com/");
	        JavascriptExecutor js =(JavascriptExecutor)driver;
	        js.executeScript("document.getElementById('small-searchterms').value='mobiles';");

	}

}

