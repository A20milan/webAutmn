import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class webTables {


        @Test
        public void webTab() {

            WebDriverManager.chromedriver().setup();

            WebDriver driver = new ChromeDriver();
            driver.get("https://testautomationpractice.blogspot.com/");

            //int rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
            List<WebElement> rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr"));

            //int columns = driver.findElements(By.xpath("//table[@name='BookTable']//tr[2]/td")).size();


            for (int i = 2; i < rows.size() - 1; i++) {

                List<WebElement> listColumns = rows.get(i).findElements(By.tagName("td"));

                for (int j = 0; j < listColumns.size(); j++) {
                    if (listColumns.get(j).getText().equals("Master In Selenium")) {
                        System.out.println(listColumns.get(1).getText());
                    }
                }

//                    //System.out.println(column.getText());
//                    String rowData = driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + i + "]/td")).getText();
//
//                    if (rowData.equals("Master In Selenium")){
//                        System.out.println(driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + i + "]/td[2]")).getText());
//                    }
//
//                }
                System.out.println("----------------------------");


            }
        }



}
