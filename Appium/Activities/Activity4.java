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

public class Activity4 {
    AndroidDriver driver;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        //Desired Capabilities
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("Android");
        options.setAutomationName("UiAutomator2");
        options.setAppPackage("com.android.contacts");
        options.setAppActivity(".activities.TwelveKeyDialer");
        options.noReset();

        //Server URL
        URL appServer = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AndroidDriver(appServer, options);
    }

    @Test
    public void saveContact()
    {
        driver.findElement(AppiumBy.id("nine")).click();
        driver.findElement(AppiumBy.id("nine")).click();
        driver.findElement(AppiumBy.id("nine")).click();
        driver.findElement(AppiumBy.id("one")).click();
        driver.findElement(AppiumBy.id("four")).click();
        driver.findElement(AppiumBy.id("eight")).click();
        driver.findElement(AppiumBy.id("two")).click();
        driver.findElement(AppiumBy.id("nine")).click();
        driver.findElement(AppiumBy.id("two")).click();
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='New contact']")).click();
        driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text='Name']")).sendKeys("Aaditya Varma");
        driver.findElement(AppiumBy.accessibilityId("OK")).click();
        String name = driver.findElement(AppiumBy.id("custom_title")).getText();
        System.out.println(name);
        Assert.assertEquals("Aaditya Varma",name );
        String number = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='99914 8292']")).getText();
        System.out.println(number);
        Assert.assertEquals("99914 8292",number );

    }
    @AfterClass
    public void tearDown()
    {
        driver.quit();
    }
}
