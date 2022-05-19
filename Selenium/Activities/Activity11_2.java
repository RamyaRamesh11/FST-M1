import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity11_2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/javascript-alerts");
        String title = driver.getTitle();
        System.out.println("Page title is: " + title);
        driver.findElement(By.id("confirm")).click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        driver.findElement(By.id("confirm")).click();
        alert.dismiss();
        driver.quit();
    }
}