import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class paginationWebTables {

    @Test
    public void webPaginationTable() throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");

        List<WebElement> countPagination = driver.findElements(By.xpath("//ul[@id='pagination']//li"));

        List<WebElement> tableRow = driver.findElements(By.xpath("//table[@id='productTable']//tbody//tr"));

        System.out.println(countPagination.size());
        System.out.println(tableRow.size());


        ////table[@id='productTable']//tr

        outerLoop:
        for (int i = 1; i < countPagination.size(); i++){

            for (int j = 0; j < tableRow.size(); j++ ){

                Thread.sleep(2000);

                String Name = driver.findElements(By.xpath("//table[@id='productTable']//tbody//tr")).get(j).findElements(By.tagName("td")).get(1).getText();

                if (Name.equals("Television")){
                    driver.findElements(By.xpath("//table[@id='productTable']//tbody//tr")).get(j).findElements(By.tagName("td")).get(3).findElement(By.tagName("input")).click();
                    break outerLoop;
                }




                //if (tableRow.get(j).findElements(By.tagName("td")).get(2).getText())

            }
            System.out.println("----------------------------");
            countPagination.get(i).click();

        }






    }
}
