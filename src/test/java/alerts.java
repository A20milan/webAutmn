import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class alerts {

    @Test
    public void initiateAlerts(){
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");

//        driver.findElement(By.cssSelector("#alertBtn")).click();
//        Alert alert = driver.switchTo().alert();
//        System.out.println(alert.getText());
//        Assert.assertEquals(alert.getText(), "I am an alert box!");
//        alert.accept();
//
//
//        driver.findElement(By.id("confirmBtn")).click();
//        alert = driver.switchTo().alert();
//        System.out.println(alert.getText());
//        Assert.assertEquals(alert.getText(), "Press a button!");
//        alert.dismiss();

        driver.findElement(By.id("promptBtn")).click();
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
//        // Retrieve the entered text using JavaScript (executeScript)
        String enteredText = (String) ((JavascriptExecutor) driver).executeScript(  "return window.prompt('Please enter your name:').value;");
//
//// Print the entered text
       System.out.println("Entered text in the prompt: " + enteredText);
//
//
//
//        alert.sendKeys("Milan Padmashali");

// Accept the alert
        //alert.accept();



    }

}
