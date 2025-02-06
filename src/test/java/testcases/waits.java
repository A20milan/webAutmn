import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeoutException;
import java.util.function.Function;

public class waits {

    @Test
    public void initiateWait() throws TimeoutException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");

        //Thread.sleep(1000);


        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));


        WebDriverWait wait  = new WebDriverWait(driver,Duration.ofSeconds(10));
        WebElement startButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".start")));
        startButton.click();


        Wait<WebDriver> wait1  = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2));
//                .ignoring(NoSuchElementException.class)
//                .ignoring(TimeoutException.class);

        WebElement button = wait.until(new Function<WebDriver, WebElement>() {
            @Override
            public WebElement apply(WebDriver webDriver) {
                WebElement button = driver.findElement(By.id("alertBtn"));
                if(button.isEnabled() && button.isDisplayed()){
                    return button;
                }
                return null;
            }
        });

        button.click();

    }
}
