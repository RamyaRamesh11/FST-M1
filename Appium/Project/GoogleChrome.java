import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class GoogleChrome {
    AndroidDriver driver;

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
        driver.get("https://www.training-support.net/selenium");

    }

    @Test
    public void googleChrome() throws InterruptedException {

        String uiSelector = "new UiSelector().textMatches(\"" + "To-Do List"
                + "\")";

        String command = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView("
                + uiSelector + ");";

        driver.findElement(AppiumBy.androidUIAutomator(command));

        driver.findElement(AppiumBy.accessibilityId("To-Do List  Elements get added at run time")).click();

        driver.findElement(AppiumBy.xpath("//android.widget.EditText[@bounds='[85,987][726,1097]']")).sendKeys("Add tasks to list");
        driver.findElement(AppiumBy.xpath("//android.widget.Button[@text='Add Task']")).click();

        driver.findElement(AppiumBy.xpath("//android.widget.EditText[@bounds='[85,987][726,1097]']")).sendKeys("Get number of tasks");
        driver.findElement(AppiumBy.xpath("//android.widget.Button[@text='Add Task']")).click();

        driver.findElement(AppiumBy.xpath("//android.widget.EditText[@bounds='[85,987][726,1097]']")).sendKeys("Clear the list");
        driver.findElement(AppiumBy.xpath("//android.widget.Button[@text='Add Task']")).click();

        String task1 = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Add tasks to list']")).getText();
        Assert.assertEquals("Add tasks to list", task1);

        String task2 =  driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Get number of tasks']")).getText();
        Assert.assertEquals("Get number of tasks", task2);

        String task3 =  driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Clear the list']")).getText();
        Assert.assertEquals("Clear the list", task3);
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Add tasks to list']")).click();
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Get number of tasks']")).click();
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Clear the list']")).click();
        driver.findElement(AppiumBy.xpath("//android.view.View[@index='2' and @clickable='true']")).click();



    }
    @AfterClass
    public void tearDown()
    {
        driver.quit();
    }
}
