import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

 public class Activity5_1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/dynamic-controls");
        String title = driver.getTitle();
        System.out.println("Page title is: " + title);
        WebElement checkbox = driver.findElement(By.xpath("//input[@class='willDisappear']"));
        System.out.println(checkbox.isDisplayed());
        driver.findElement(By.id("toggleCheckbox")).click();
        System.out.println(checkbox.isDisplayed());
        driver.quit();
    }

    }

