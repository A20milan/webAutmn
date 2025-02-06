import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandlingShadowDOM {

    @Test
    public void ShadowDOM() {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();




    }


}
