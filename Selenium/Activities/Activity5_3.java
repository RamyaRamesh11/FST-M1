import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_3 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/dynamic-controls");
        String title = driver.getTitle();
        System.out.println("Page title is: " + title);
        WebElement text = driver.findElement(By.xpath("//input[@type='text']"));
        System.out.println("The text box is enabled: " + text.isEnabled());
        driver.findElement(By.id("toggleInput")).click();
        System.out.println("The text box is enabled: " + text.isEnabled());
        driver.quit();
    }
}
