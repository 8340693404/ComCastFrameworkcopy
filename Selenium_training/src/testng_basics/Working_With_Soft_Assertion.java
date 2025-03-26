package testng_basics;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Working_With_Soft_Assertion {
    @Test

    public void Demo() {
        SoftAssert asrt = new SoftAssert();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://demowebshop.tricentis.com/");
        String title = driver.getTitle();
        asrt.assertEquals(title, "Demo Web Shop");
        asrt.assertAll();
        driver.close();
    }
}
	

	



