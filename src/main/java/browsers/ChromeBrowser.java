package browsers;

/**
 * @author niajulhasan
 */

import com.microsoft.playwright.*;

public class ChromeBrowser implements BrowserInterface {
    @Override
    public Browser initBrowser() {
        Playwright playwright = Playwright.create();
        return playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
    }
}

