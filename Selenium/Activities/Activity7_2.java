import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity7_2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/dynamic-attributes");
        String title = driver.getTitle();
        System.out.println("Page title is: " + title);
        WebElement username = driver.findElement(By.xpath("//input[contains(@class,'-username')]"));
        username.sendKeys("RamyaN");
        WebElement password = driver.findElement(By.xpath("//input[contains(@class,'-password')]"));
        password.sendKeys("Hello123!");
        WebElement confirmPassword  = driver.findElement(By.xpath("//label[text() = 'Confirm Password']/following::input"));
        confirmPassword.sendKeys("Hello123!");
        WebElement email = driver.findElement(By.xpath("//label[contains(text(), 'mail')]/following-sibling::input"));
        email.sendKeys("rn@gmail.com");
        driver.findElement(By.xpath("//button[@onclick='signUp()']")).click();
        String loginMessage = driver.findElement(By.id("action-confirmation")).getText();
        System.out.println("Login message: " + loginMessage);
        driver.quit();


    }
}