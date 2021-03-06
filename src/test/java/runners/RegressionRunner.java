package runners;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"classpath:features"},
        glue = {"step_definitions"},
        tags={"@Transaction"},
        plugin = {"json:target/cucumber.json"},
        format = {"pretty", "html:target/report"},
        dryRun = true
)
public class RegressionRunner {
}
