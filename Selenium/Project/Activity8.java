package Activities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import java.time.Duration;
import java.util.List;

public class Activity8 extends BaseClass {
    @Test
    public  void traverseTables(){
        driver.findElement(By.id("user_name")).sendKeys("admin");
        driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
        driver.findElement(By.id("bigbutton")).click();
        driver.findElement(By.id("grouptab_0")).click();
        driver.findElement(By.id("moduleTab_9_Accounts")).click();
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.className("actionmenulink")));
        List <WebElement> rowElements =  driver.findElements(By.xpath("//table[contains(@class,'table-responsive')]/tbody/tr"));
        int rowSize = rowElements.size();
        List <WebElement> colElements =  driver.findElements(By.xpath("//table[contains(@class,'table-responsive')]/thead/tr/th"));
        int colSize = rowElements.size();

        for(int i=1; i<=10; i+=2)
        {
            for(int j=1; j<=3;j++)
            {
                System.out.println(driver.findElement(By.xpath("//table[contains(@class,'table-responsive')]/tbody/tr["+ i +"]/td["+ j +"]")).getText());
            }
        }

    }
}


