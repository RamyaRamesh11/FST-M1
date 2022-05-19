import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity7_1 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/dynamic-attributes");
        String title = driver.getTitle();
        System.out.println("Page title is: " + title);
        driver.findElement(By.xpath("//input[starts-with(@class, 'username')]")).sendKeys("Ramya");
        driver.findElement(By.xpath("//input[starts-with(@class, 'password')]")).sendKeys("Hello123!");
        driver.findElement(By.xpath("//button[contains(text(), 'Log in')]")).click();
        String loginMessage = driver.findElement(By.id("action-confirmation")).getText();
        System.out.println("Login message: " + loginMessage);
        driver.quit();
    }
}