import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class bootstrapDropdown {


    @Test
    public void validateMultiSelectDropdown() throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");

        driver.findElement(By.xpath("//button[@data-toggle = 'dropdown']")).click();

        List<WebElement> dropdownlist = driver.findElements(By.xpath("//ul//li//label"));


        for (WebElement dropDown : dropdownlist){

            if (dropDown.getText().equals("Java")){
                dropDown.click();
                break;
            }

        }





    }
}
