package pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class OrderCompletePage extends BasePage {

    // Locators
    private final By successTitle =
            AppiumBy.id("com.saucelabs.mydemoapp.android:id/completeTV");

    private final By continueShoppingButton =
            AppiumBy.accessibilityId("Tap to open catalog");

    public OrderCompletePage(io.appium.java_client.android.AndroidDriver driver) {
        super(driver);
    }

    // Assertions helpers
    public boolean isSuccessTitleDisplayed() {
        return isDisplayed(successTitle);
    }

    // Actions
    public void continueShopping() {
        click(continueShoppingButton);
    }
}
