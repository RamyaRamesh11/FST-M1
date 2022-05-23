package Activities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
     WebDriver driver;
    @BeforeClass
    public void setUp()
    {
        driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/crm");


    }

    @AfterClass
    public void closeBrowser()
    {

        driver.quit();
    }
}
