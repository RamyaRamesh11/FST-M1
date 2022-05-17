import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/simple-form");
        String title = driver.getTitle();
        System.out.println("Page title is: " + title);

        //driver.quit();
        driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Ramya");
        driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("N");
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("rn@gmail.com");
        driver.findElement(By.xpath("//input[@id='number']")).sendKeys("9845323445");
        driver.findElement(By.xpath("//input[@value='submit']")).click();
        driver.quit();

    }
}
