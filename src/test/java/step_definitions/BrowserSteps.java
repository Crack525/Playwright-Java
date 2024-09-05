package step_definitions;

/**
 * @author niajulhasan
 */

import io.cucumber.java.en.Given;

public class BrowserSteps {

    @Given("I launch the browser")
    public void iLaunchTheBrowser() {
        // The browser is already launched in the Hooks class.
        System.out.println("Browser launched successfully.");
    }
}

