package Activities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class Activity7 extends BaseClass{
     @Test
   public void readAdditionalInfo() {
        driver.findElement(By.id("user_name")).sendKeys("admin");
        driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
        driver.findElement(By.id("bigbutton")).click();
        driver.findElement(By.id("grouptab_0")).click();
        driver.findElement(By.id("moduleTab_9_Leads")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tbody/tr[1]/td[10]/span[1]/span[1]")));
        driver.findElement(By.xpath("//tbody/tr[1]/td[10]/span[1]/span[1]")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='phone']")));
        WebElement phone = driver.findElement(By.xpath("//span[@class='phone']"));
        System.out.println("The number is: " + phone.getText());
    }

}