package pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class LoginPage extends BasePage {

    // Locators
    private final By usernameField =
            AppiumBy.id("com.saucelabs.mydemoapp.android:id/nameET");

    private final By passwordField =
            AppiumBy.id("com.saucelabs.mydemoapp.android:id/passwordET");

    private final By loginButton =
            AppiumBy.accessibilityId("Tap to login with given credentials");

    public LoginPage(io.appium.java_client.android.AndroidDriver driver) {
        super(driver);
    }

    // Actions
    public void enterUsername(String username) {
        find(usernameField).sendKeys(username);
    }

    public void enterPassword(String password) {
        find(passwordField).sendKeys(password);
    }

    public void tapLoginButton() {
        click(loginButton);
    }

    public void loginAs(String username, String password) {
        enterUsername(username);
        enterPassword(password);
        tapLoginButton();
    }
}
