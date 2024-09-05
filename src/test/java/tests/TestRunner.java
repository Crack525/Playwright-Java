package tests;

/**
 * @author niajulhasan
 */

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",  // Correct path to feature files
        glue = {"step_definitions"},               // Package name where step definitions are located
        plugin = {"pretty", "json:target/cucumber-reports/Cucumber.json"},  // Output report as JSON
        monochrome = true                          // Display output neatly
        //strict = true                               // Fail if undefined or pending steps
)
public class TestRunner {
}

