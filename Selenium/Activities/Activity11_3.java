import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity11_3 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/javascript-alerts");
        String title = driver.getTitle();
        System.out.println("Page title is: " + title);
        driver.findElement(By.id("prompt")).click();
        Alert alert = driver.switchTo().alert();
        alert.sendKeys("Yes, you are!");
        alert.accept();
        driver.quit();
    }
}