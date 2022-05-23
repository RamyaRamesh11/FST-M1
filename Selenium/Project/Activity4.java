package Activities;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class Activity4 extends BaseClass{
    @Test
    public void logIn(){
        driver.findElement(By.id("user_name")).sendKeys("admin");
        driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
        driver.findElement(By.id("bigbutton")).click();
        String homePageTitle = driver.getTitle();
        Assert.assertEquals(homePageTitle,"SuiteCRM");
    }
}