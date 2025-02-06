import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class javascriptexecutor {

    @Test
    public void validatJSExec() {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://testautomationpractice.blogspot.com/");

        WebElement inputField = driver.findElement(By.id("textarea"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[1].value = arguments[0];", "milan",inputField );



        js.executeScript("arguments[1].click();", "pooja",driver.findElement(By.className("start")));



    }
}
