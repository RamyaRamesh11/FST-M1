package Activities;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.By;
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

public class Activity2 {
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

    }

    @Test
    public void openBrowser()
    {
        driver.get("https://www.training-support.net/");

        // Wait for page to load

        // Get heading on page and print it
        String pageTitle = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Training Support']")).getText();
        System.out.println("Title on Homepage: " + pageTitle);

        // Find About Us button and click it
        WebElement aboutButton = driver.findElement(AppiumBy.xpath("//android.view.View[@content-desc='About Us']"));
        aboutButton.click();

        // Wait for new page to load
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@text='About Us']")));

        // Get heading on About Us page and print it
        String newPageTitle = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='About Us']")).getText();
        System.out.println("Title on new page: " + newPageTitle);

        // Assertions
        Assert.assertEquals(pageTitle, "Training Support");
        Assert.assertEquals(newPageTitle, "About Us");

    }
    @AfterClass
    public void tearDown()
    {
        driver.quit();
    }

}
