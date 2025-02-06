import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class frames {

    @Test
    public void initiateFrames(){
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("https://ui.vision/demo/webtest/frames/");

        driver.switchTo().frame(0);
        driver.findElement(By.name("mytext1")).sendKeys("milan");
        driver.switchTo().defaultContent();


        driver.switchTo().frame(driver.findElement(By.xpath("//frame[@src='frame_3.html']")));
        driver.findElement(By.name("mytext3")).sendKeys("milan");
        driver.switchTo().defaultContent();


    }
}
