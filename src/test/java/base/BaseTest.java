package base;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

import java.net.URL;

public class BaseTest {

    protected static AndroidDriver driver;

    public void setUp() throws Exception {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("Android");
        options.setDeviceName("emulator-5554");
        options.setAutomationName("UiAutomator2");

        options.setAppPackage("com.saucelabs.mydemoapp.android");
        options.setAppActivity(
                "com.saucelabs.mydemoapp.android.view.activities.MainActivity"
        );
        options.setNoReset(true);

        driver = new AndroidDriver(
                new URL("http://127.0.0.1:4723"),
                options
        );
    }

    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
