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

public class Activity5 {
    AndroidDriver driver;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        //Desired Capabilities
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("Android");
        options.setAutomationName("UiAutomator2");
        options.setAppPackage("com.android.mms");
        options.setAppActivity(".ui.MmsTabActivity");
        options.noReset();

        //Server URL
        URL appServer = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AndroidDriver(appServer, options);
    }

    @Test
    public void textMsg()
    {
        driver.findElement(AppiumBy.id("fab")).click();
        driver.findElement(AppiumBy.id("recipients_viewer")).click();
        driver.findElement(AppiumBy.id("recipients_editor")).sendKeys("9611495795");
        driver.findElement(AppiumBy.id("embedded_text_editor")).click();
        driver.findElement(AppiumBy.id("embedded_text_editor")).sendKeys("Hello from Appium");
        driver.findElement(AppiumBy.id("send_slot_id")).click();
        driver.findElement(AppiumBy.id("sim_button1")).click();
        driver.findElement(AppiumBy.id("send_button")).click();
        driver.findElement(AppiumBy.id("up")).click();
        driver.findElement(AppiumBy.xpath("//android.view.ViewGroup[@index='0']")).click();
        String text = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Hello from Appium']")).getText();
        System.out.println(text);
        Assert.assertEquals("Hello from Appium", text);

    }
    @AfterClass
    public void tearDown()
    {
        driver.quit();
    }
}
