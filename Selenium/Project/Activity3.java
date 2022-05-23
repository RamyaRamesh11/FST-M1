package Activities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Activity3 extends BaseClass{
    @Test
    public  void getCopyRightText()  {
        WebElement footer = driver.findElement(By.id("admin_options"));
        System.out.println("The  first copyright text in the footer is: " + footer.getText());
    }
}