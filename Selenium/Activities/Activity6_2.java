import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity6_2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/ajax");
        String title = driver.getTitle();
        System.out.println("Page title is: " + title);
        driver.findElement(By.xpath("//button[@class='ui violet button']")).click();
        WebDriverWait wait = new WebDriverWait (driver,10);
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("ajax-content"), "HELLO!"));

        //getText() and print it
        String ajaxText = driver.findElement(By.id("ajax-content")).getText();
        System.out.println(ajaxText);

        //Wait for late text
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("ajax-content"), "I'm late!"));

        //Get late text and print it
        String lateText = driver.findElement(By.id("ajax-content")).getText();
        System.out.println(lateText);

        //Close browser
        driver.quit();
    }

    }
