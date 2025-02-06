import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class nestedFrames {

    @Test
    public void initiateNestedFrame(){
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("https://ui.vision/demo/webtest/frames/");

        driver.switchTo().frame(driver.findElement(By.xpath("//frame[@src='frame_3.html']")));
        driver.findElement(By.name("mytext3")).sendKeys("milan");

        driver.switchTo().frame(0);
        String text = driver.findElement(By.xpath("//div[@class='ulDsOb']/span")).getText();
        System.out.println(text);

        //switch back to parent - fram3
        driver.switchTo().parentFrame();
        driver.findElement(By.name("mytext3")).clear();
        driver.findElement(By.name("mytext3")).sendKeys("pooja");

        driver.switchTo().defaultContent();

        driver.switchTo().frame(0);
        driver.findElement(By.name("mytext1")).sendKeys("milan");
        driver.switchTo().defaultContent();

    }
}
