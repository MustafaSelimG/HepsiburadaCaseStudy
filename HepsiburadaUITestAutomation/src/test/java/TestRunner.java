import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        plugin = {"pretty", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"},
        features = "src/test/resources/Feature/CaseStudy.feature",
        glue = "steps"
)

public class TestRunner extends AbstractTestNGCucumberTests {
}

