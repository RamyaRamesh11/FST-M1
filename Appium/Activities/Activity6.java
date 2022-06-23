package Activities;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

public class Activity6 {
    AndroidDriver driver;
    WebDriverWait wait;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        //Desired Capabilities
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("Android");
        options.setAutomationName("UiAutomator2");
        options.setAppPackage("com.android.chrome");
        options.setAppActivity("com.google.android.apps.chrome.Main");
        options.noReset();

        //Server URL
        URL appServer = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AndroidDriver(appServer, options);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://www.training-support.net/selenium/lazy-loading");
    }

    @Test
    public void imageScroll()
    {
        WebElement pageTitle = driver.findElement(AppiumBy.className("android.widget.TextView"));
        // Count the number of images shown on the screen
        List<WebElement> numberOfImages = driver.findElements(AppiumBy.xpath("//android.view.View/android.view.View/android.widget.Image"));
        System.out.println("Number of image shown currently: " + numberOfImages.size());

        // Assertion before scrolling
        Assert.assertEquals(numberOfImages.size(), 2);

        // Scroll to Helen's post
        driver.findElement(AppiumBy.androidUIAutomator("UiScrollable(UiSelector()).scrollTextIntoView(\"helen\")"));

        // Find the number of images shown after scrolling
       numberOfImages = driver.findElements(AppiumBy.xpath("//android.view.View/android.view.View/android.widget.Image"));
        System.out.println("Number of image shown currently: " + numberOfImages.size());

        // Assertion after scrolling
        Assert.assertEquals(numberOfImages.size(), 3);

    }
    @AfterClass
    public void tearDown()
    {
        driver.quit();
    }
}
