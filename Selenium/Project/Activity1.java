package Activities;
import org.testng.Assert;
import org.testng.annotations.*;

public class Activity1 extends BaseClass{
    //Driver declaration

    @Test
    public void getTitle()
    {
        String pageTitle1 = driver.getTitle();
        System.out.println(pageTitle1);
        Assert.assertEquals(pageTitle1, "SuiteCRM");

    }

}
