import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Set;

public class windowHandlesTab {

    @Test
    public void validatewindowHandles(){
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://testautomationpractice.blogspot.com/");
//storing the parent handle
        String parentWindow = driver.getWindowHandle();

        driver.findElement(By.xpath("//button[text() = 'New Tab']")).click();

/*// Get window handles (IDs of open tabs)
        Set<String> windowHandles = driver.getWindowHandles();
        Iterator<String> iterator = windowHandles.iterator();

        String firstTab = iterator.next(); // First tab
        String secondTab = iterator.next(); // Second tab

// Switch to the second tab
        driver.switchTo().window(secondTab);
        System.out.println("Switched to second tab");

        Assert.assertEquals(driver.getTitle(), "Your Store");*/
//---------------------------------------------------
        //Get window handles (IDs of open tabs)

        Set<String> windowHandles = driver.getWindowHandles();

        for (String window : windowHandles){
            driver.switchTo().window(window);
            if (driver.getTitle().equals("Your Store"))
            {
                driver.findElement(By.name("search")).sendKeys("milan");
                //driver.close();
                break;
            }

        }

        driver.switchTo().window(parentWindow);
        driver.findElement(By.id("male")).click();
        System.out.println(driver.findElement(By.id("male")).isSelected());
        Assert.assertTrue(driver.findElement(By.id("male")).isSelected());






    }

}
