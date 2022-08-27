
import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;

import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features=".\\src\\test\\resources\\features\\CaseStudy.feature",

        glue={"steps"},

        plugin = {"pretty","json:target/cucumber-reports/reports.json",

                "junit:target/cucumber-reports/Cucumber.xml",

                "html:target/cucumber-reports/reports2.html"},
        monochrome = true,

        dryRun = false)

public class TestRunner {
}