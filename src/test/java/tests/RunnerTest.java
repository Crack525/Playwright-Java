package tests;

/**
 * @author niajulhasan
 */

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features", // Path to feature files
        glue = {"step_definitions"},               // Package with step definitions
        plugin = {"pretty", "json:target/cucumber-reports/Cucumber.json"}, // Report options
        monochrome = true                          // Neat console output
)
public class RunnerTest {
}

