import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.URL;

public class basic {

    @Test
    public void test(){
        System.out.println("Initiate our selenium skills");
    }

    @BeforeSuite
    public void initializeDriver(){
        System.out.println("Inside initializeDriver");
        // Get the chromedriver path from resources

        System.setProperty("webdriver.chrome.driver", "D:\\IntellijIdea\\Coursera\\TestNG\\webautmn\\src\\main\\resources\\chromedriver.exe");

        // Initialize ChromeDriver instance
        WebDriver driver = new ChromeDriver();

        // Open a website
        driver.get("https://www.google.com");

    }

}
