import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class inputTextNClick {
    @Test
    public void test(){
        System.out.println("Initiate our selenium skills");
    }

    @BeforeSuite
    public void initializeDriver(){
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.applitools.com/");

        driver.findElement(By.cssSelector("#username")).sendKeys("Milan");

        driver.findElement(By.cssSelector("#username")).sendKeys(Keys.TAB);

        driver.findElement(By.cssSelector("#password")).sendKeys(Keys.TAB);

        driver.findElement(By.cssSelector(".btn.btn-primary")).click();

        //what are the different ways we can do sendkeys

    }
}
