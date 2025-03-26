package selenium_basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_BrowserMethods {

    public static void main(String[] args) throws InterruptedException {
        //launch a Chrome browser

        WebDriver driver = new ChromeDriver();
        //Navigatee to url
        driver.get("https://www.google.co.in");
        //to print the title of the url
        String title = driver.getTitle();
        System.out.println(title);
        //get the current url
        String currentUrl = driver.getCurrentUrl();

        System.out.println(currentUrl);
        //close the browser
        //driver.close();
        //driver.quit();
        driver.navigate().to("https://demowebshop.tricentis.com/");
        Thread.sleep(2000);
        //to maximize the window
        driver.manage().window().maximize();

        driver.quit();


    }

}
