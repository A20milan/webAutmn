import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class keyBoardActions {

    @Test
    public void validateMultiSelectDropdown() throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://gotranscript.com/text-compare");

        driver.findElement(By.xpath("//textarea[@name = 'text1']")).sendKeys("You may need to include a dependency on a specific version of the CDP using something similar to `org.seleniumhq.selenium:selenium-devtools-v86:4.8.3` where the version (\"v86\") matches the version of the chromium-based browser you're using and the version number of the artifact is the same as Selenium's.");

        Actions action = new Actions(driver);
        action.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
        action.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();


        driver.findElement(By.xpath("//textarea[@name = 'text2']")).click();
        action.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();





    }
}
