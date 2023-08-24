package TestRunner;

import TestBase.TestBase;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/Features",
        glue = "Steps"
)
public class TestRunner extends TestBase {

}