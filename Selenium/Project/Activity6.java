package Activities;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Activity6 extends BaseClass {
    @Test
    public void activityClickable() {
        driver.findElement(By.id("user_name")).sendKeys("admin");
        driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
        driver.findElement(By.id("bigbutton")).click();
        String acti = driver.findElement(By.id("grouptab_3")).getText();
        Assert.assertEquals(acti, "ACTIVITIES");
    }
}
