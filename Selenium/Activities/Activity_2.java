import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity_2 {

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net");
        String title = driver.getTitle();
        System.out.println("Page title is: " + title);
        ////Find the About Us link using id()
        WebElement idLoc = driver.findElement(By.id("about-link"));
        System.out.println("Text in element: " + idLoc.getText());

        //////Find the About Us link using className()
        WebElement idClass = driver.findElement(By.className("green"));
        System.out.println("Text in element: " + idClass.getText());

        //Find the About Us link using cssSelector()
        WebElement idCss = driver.findElement(By.cssSelector(".green"));
        System.out.println("Text in element: " + idCss.getText());

        //Find the About Us link using linkText()
        WebElement idlink = driver.findElement(By.linkText("About Us"));
        System.out.println("Text in element: " + idlink.getText());
        driver.quit();


    }
}