package step_definitions;

/**
 * @author niajulhasan
 */

import browsers.BrowserInterface;
import browsers.ChromeBrowser;
import browsers.FirefoxBrowser;
import browsers.SafariBrowser;
import config.ConfigurationReader;
import com.microsoft.playwright.Browser;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    private static Browser browser;

    @Before
    public void setUp() {
        String browserType = ConfigurationReader.getProperty("browser");

        BrowserInterface browserInterface;
        switch (browserType.toLowerCase()) {
            case "chrome":
                browserInterface = new ChromeBrowser();
                break;
            case "firefox":
                browserInterface = new FirefoxBrowser();
                break;
            case "safari":
                browserInterface = new SafariBrowser();
                break;
            default:
                throw new IllegalArgumentException("Invalid browser type specified in config: " + browserType);
        }

        browser = browserInterface.initBrowser();
    }

    public static Browser getBrowser() {
        return browser;
    }

    @After
    public void tearDown() {
        if (browser != null)
            browser.close();
    }
}
