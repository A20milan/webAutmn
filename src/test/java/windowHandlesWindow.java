import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class windowHandlesWindow {

    @Test
    public void validatewindowHandles() throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://testautomationpractice.blogspot.com/");
//storing the parent handle
        String parentWindow = driver.getWindowHandle();

        driver.findElement(By.cssSelector("#PopUp")).click();

        List<String> list = new ArrayList<>(driver.getWindowHandles());

        System.out.println(list.size());

        //Fast and reliable end-to-end testing for modern web apps | Playwright

        for (String window : list) {
            driver.switchTo().window(window);
            System.out.println(driver.getTitle());
            if (driver.getTitle().equals("Fast and reliable end-to-end testing for modern web apps | Playwright")) {
                Thread.sleep(5000);
                driver.findElement(By.className("DocSearch-Button-Placeholder")).click();
                //driver.close();
                break;
            }
        }




    }

    }
