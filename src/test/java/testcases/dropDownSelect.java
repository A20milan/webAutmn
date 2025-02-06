import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class dropDownSelect {

    @Test
    public void validateDropdown() throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://testautomationpractice.blogspot.com/");

        Select dropdown = new Select(driver.findElement(By.id("country")));
        dropdown.selectByIndex(1);
        dropdown.selectByValue("japan");
        Thread.sleep(1000);
        dropdown.selectByVisibleText("Germany");





    }


}
