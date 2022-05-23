package Activities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class Activity5 extends BaseClass{
    @Test
    public  void getColors() {
        driver.findElement(By.id("user_name")).sendKeys("admin");
        driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
        driver.findElement(By.id("bigbutton")).click();
        WebElement toolBar = driver.findElement(By.id("toolbar"));
        System.out.println("The color of the navigation menu is: " + toolBar.getCssValue("color"));

    }
}
