import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class radiobuttonscheckbox {

    @Test
    public void validateRadioButton(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.findElement(By.id("male")).click();
        System.out.println(driver.findElement(By.id("male")).isSelected());
        Assert.assertTrue(driver.findElement(By.id("male")).isSelected());

        driver.findElement(By.id("sunday")).click();
        System.out.println(driver.findElement(By.id("sunday")).isSelected());
        Assert.assertTrue(driver.findElement(By.id("sunday")).isSelected());

        List<WebElement> days = driver.findElements(By.xpath("//input[@type='checkbox' and @class='form-check-input']"));

        for (WebElement ele : days){
            if (ele.getAttribute("value").equals( "tuesday" )|| ele.getAttribute("value").equals( "wednesday" )){
                ele.click();
            }
        }
        Assert.assertTrue(driver.findElement(By.id("tuesday")).isSelected());
        Assert.assertTrue(driver.findElement(By.id("wednesday")).isSelected());


        driver.close();
        driver.quit();







    }


}
