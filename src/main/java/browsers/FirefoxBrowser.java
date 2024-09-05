package browsers;

/**
 * @author niajulhasan
 */

import com.microsoft.playwright.*;

public class FirefoxBrowser implements BrowserInterface {
    @Override
    public Browser initBrowser() {
        Playwright playwright = Playwright.create();
        return playwright.firefox().launch(new BrowserType.LaunchOptions().setHeadless(false));
    }
}

