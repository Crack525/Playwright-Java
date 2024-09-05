package browsers;

/**
 * @author niajulhasan
 */

import com.microsoft.playwright.*;

public class SafariBrowser implements BrowserInterface {
    @Override
    public Browser initBrowser() {
        Playwright playwright = Playwright.create();
        return playwright.webkit().launch(new BrowserType.LaunchOptions().setHeadless(false));
    }
}
