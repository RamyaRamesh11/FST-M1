import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



    public class Activity_3 {

        public static void main(String[] args) throws InterruptedException {
            WebDriver driver = new FirefoxDriver();
            driver.get("https://training-support.net/selenium/simple-form");
            String title = driver.getTitle();
            System.out.println("Page title is: " + title);

            //driver.quit();
            driver.findElement(By.id("firstName")).sendKeys("Ramya");
            driver.findElement(By.id("lastName")).sendKeys("N");
            driver.findElement(By.id("email")).sendKeys("rn@gmail.com");
            driver.findElement(By.id("number")).sendKeys("9845323445");
            driver.findElement(By.cssSelector(".ui.green.button")).click();
            driver.quit();


        }
    }




