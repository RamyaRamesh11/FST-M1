package Activities;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;

public class Activity3 {
    AndroidDriver driver;
    @BeforeClass
    public void setUp() throws MalformedURLException {

        //Desired Capabilities
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("Android");
        options.setAutomationName("UiAutomator2");
        options.setAppPackage("com.miui.calculator");
        options.setAppActivity(".cal.CalculatorActivity");
        options.noReset();

        //Server URL
        URL appServer = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AndroidDriver(appServer, options);
    }

    @Test
    public void addTest()
    {
        driver.findElement(AppiumBy.id("btn_5_s")).click();
        driver.findElement(AppiumBy.id("btn_plus_s")).click();
        driver.findElement(AppiumBy.id("btn_9_s")).click();
        driver.findElement(AppiumBy.id("btn_equal_s")).click();
        String result1 = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='= 14']")).getText();
        System.out.println(result1);
        Assert.assertEquals("= 14", result1);
        driver.findElement(AppiumBy.id("btn_c_s")).click();
    }
    @Test
    public void subtractTest()
    {
        driver.findElement(AppiumBy.id("btn_1_s")).click();
        driver.findElement(AppiumBy.id("btn_0_s")).click();
        driver.findElement(AppiumBy.id("btn_minus_s")).click();
        driver.findElement(AppiumBy.id("btn_5_s")).click();
        driver.findElement(AppiumBy.id("btn_equal_s")).click();
        String result2 = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='= 5']")).getText();
        System.out.println(result2);
        Assert.assertEquals("= 5", result2);
        driver.findElement(AppiumBy.id("btn_c_s")).click();

    }
    @Test
    public void multiplyTest()
    {
        driver.findElement(AppiumBy.id("btn_5_s")).click();
        driver.findElement(AppiumBy.id("btn_mul_s")).click();
        driver.findElement(AppiumBy.id("btn_1_s")).click();
        driver.findElement(AppiumBy.id("btn_0_s")).click();
        driver.findElement(AppiumBy.id("btn_0_s")).click();
        driver.findElement(AppiumBy.id("btn_equal_s")).click();
        String result3 = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='= 500']")).getText();
        System.out.println(result3);
        Assert.assertEquals("= 500", result3);
        driver.findElement(AppiumBy.id("btn_c_s")).click();

    }
    @Test
    public void divisionTest()
    {
        driver.findElement(AppiumBy.id("btn_5_s")).click();
        driver.findElement(AppiumBy.id("btn_0_s")).click();
        driver.findElement(AppiumBy.id("btn_div_s")).click();
        driver.findElement(AppiumBy.id("btn_2_s")).click();
        driver.findElement(AppiumBy.id("btn_equal_s")).click();
        String result4 = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='= 25']")).getText();
        System.out.println(result4);
        Assert.assertEquals("= 25", result4);

    }
    @AfterClass
    public void tearDown()
    {
        driver.quit();
    }
}
