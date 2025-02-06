import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class multiSelectDropDown {

    @Test
    public void validateMultiSelectDropdown() throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://testautomationpractice.blogspot.com/");

        Select select = new Select(driver.findElement(By.id("colors")));
        System.out.println(select.isMultiple());
        if (select.isMultiple()){
            select.selectByValue("blue");
            select.selectByIndex(0);
            select.selectByVisibleText("Green");
        }

        select.deselectByIndex(0);
        select.deselectByVisibleText("Green");
        select.deselectByValue("blue");


        //select.deselectAll();


    }
}
