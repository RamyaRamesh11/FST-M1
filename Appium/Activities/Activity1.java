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

public class Activity1 {
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
    public void calcTest()
    {
        driver.findElement(AppiumBy.id("btn_5_s")).click();
        driver.findElement(AppiumBy.id("btn_mul_s")).click();
        driver.findElement(AppiumBy.id("btn_2_s")).click();
        driver.findElement(AppiumBy.id("btn_equal_s")).click();
        String result = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='= 10']")).getText();
        System.out.println(result);
        Assert.assertEquals("= 10", result);

    }
    @AfterClass
    public void tearDown()
    {
        driver.quit();
    }

}
