import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.Instant;

public class Activity10_3 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/drag-drop");
        WebElement source = driver.findElement(By.id("draggable"));
        WebElement dest1 =  driver.findElement(By.id("droppable"));
        WebElement dest2 =  driver.findElement(By.id("dropzone2"));
        Actions action = new Actions(driver);
        action.dragAndDrop(source,dest1).perform();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.attributeToBeNotEmpty(dest1, "background-color"));
        System.out.println("ENTERED DROPZONE 1");
        action.dragAndDrop(dest1,dest2).perform();
        wait.until(ExpectedConditions.attributeToBeNotEmpty(dest2, "background-color"));
        System.out.println("ENTERED DROPZONE 2");
        driver.quit();

    }
}
