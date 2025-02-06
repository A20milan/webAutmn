import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FileOperations {

    @Test
    public void validateMultiSelectDropdown() throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.lambdatest.com/selenium-playground/upload-file-demo");

        driver.findElement(By.cssSelector("#file")).sendKeys("C:/Users/milan/Downloads/download-20250111123513.pdf");

        System.out.println(driver.findElement(By.cssSelector("#error")).getText());


    }


}
