import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_3 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/target-practice");
        String title = driver.getTitle();
        System.out.println("Page title is: " + title);
        String third = driver.findElement(By.xpath("//h3[@id='third-header']")).getText();
        System.out.println("Third header is:"+third);
        WebElement fifth = driver.findElement(By.xpath("//h5[@class='ui green header']"));
        System.out.println(fifth.getCssValue("color"));
        WebElement violet = driver.findElement(By.xpath("//button[@class='ui violet button']"));
        System.out.println(violet.getAttribute("class"));
        String grey = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[2]/div[3]/button[2]")).getText();
        System.out.println(grey);
        driver.quit();

    }
}
