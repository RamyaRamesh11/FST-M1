package Activities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Activity2 extends  BaseClass{
    @Test
    public void getUrl() {
        WebElement headerImg = driver.findElement(By.xpath("//div[@class='companylogo']/img"));
        System.out.println( "The URL of the image is: " + headerImg.getAttribute("src"));

    }
}
