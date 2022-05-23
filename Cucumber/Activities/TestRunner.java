import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:/FST-38/FST_Cucumber/src/test/java/Features",
        glue = {"stepDefinitions"},
        tags = "@Activity3",
        plugin = {"json: test-reports/json-report.json"},
        monochrome = true
)

public class TestRunner {

}