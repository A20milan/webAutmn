import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MouseActions {

    @Test
    public void validatewindowHandles() throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://testautomationpractice.blogspot.com/");

        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath("//button[text()='Point Me']"))).perform();

        action.doubleClick(driver.findElement(By.xpath("//button[text()='Copy Text']"))).perform();

        Thread.sleep(3000);

        Assert.assertEquals(driver.findElement(By.id("field2")).getAttribute("value"), "Hello World!");

        WebElement sourceDrag = driver.findElement(By.id("draggable"));

        WebElement dest = driver.findElement(By.id("droppable"));

        action.dragAndDrop(sourceDrag, dest).perform();


    }
}
