import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class GoogleKeep {
    AndroidDriver driver;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        //Desired Capabilities
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("Android");
        options.setAutomationName("UiAutomator2");
        options.setAppPackage("com.google.android.keep");
        options.setAppActivity(".activities.BrowseActivity");
        options.noReset();

        //Server URL
        URL appServer = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AndroidDriver(appServer, options);
    }

    @Test
    public void googleKeep()
    {
        driver.findElement(AppiumBy.id("new_note_button")).click();
        driver.findElement(AppiumBy.id("edit_note_text")).sendKeys("Three Appium project activities to be completed");
        driver.findElement(AppiumBy.id("title_editor_fragment")).click();
        driver.findElement(AppiumBy.id("editable_title")).sendKeys("Appium Project");
        driver.findElement(AppiumBy.accessibilityId("Open navigation drawer")).click();


        String note =  driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Appium Project']")).getText();
        Assert.assertEquals("Appium Project", note);




    }
    @AfterClass
    public void tearDown()
    {
        driver.quit();
    }
}
