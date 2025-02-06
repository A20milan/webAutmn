import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class autoSuggestionDropDown {

    @Test
    public void validateMultiSelectDropdown() throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.redbus.in/");

        driver.findElement(By.id("src")).sendKeys("Mang");
        Thread.sleep(2000);
        List<WebElement> places = driver.findElements(By.xpath("//li[contains(@class,'sc-iwsKbI')]/div/text[1]"));
        System.out.println(places.size());
        for (WebElement place : places){

            System.out.println(place.getText());
            if (place.getText().equals("Hampankatta")){
                place.click();
                break;
            }
        }


    }
}
