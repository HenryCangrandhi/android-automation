package pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class PaymentMethodPage extends BasePage {

    // Locators
    private final By nameField =
            AppiumBy.id("com.saucelabs.mydemoapp.android:id/nameET");

    private final By cardNumberField =
            AppiumBy.id("com.saucelabs.mydemoapp.android:id/cardNumberET");

    private final By expirationDateField =
            AppiumBy.id("com.saucelabs.mydemoapp.android:id/expirationDateET");

    private final By securityCodeField =
            AppiumBy.id("com.saucelabs.mydemoapp.android:id/securityCodeET");

    private final By reviewOrderButton =
            AppiumBy.accessibilityId(
                    "Saves payment info and launches screen to review checkout data"
            );

    public PaymentMethodPage(io.appium.java_client.android.AndroidDriver driver) {
        super(driver);
    }

    // Actions
    public void enterName(String name) {
        find(nameField).sendKeys(name);
    }

    public void enterCardNumber(String cardNumber) {
        find(cardNumberField).sendKeys(cardNumber);
    }

    public void enterExpirationDate(String expDate) {
        find(expirationDateField).sendKeys(expDate);
    }

    public void enterSecurityCode(String cvv) {
        find(securityCodeField).sendKeys(cvv);
    }

    public void tapReviewOrder() {
        click(reviewOrderButton);
    }

    public void fillPaymentMethod(
            String name,
            String cardNumber,
            String expDate,
            String cvv
    ) {
        enterName(name);
        enterCardNumber(cardNumber);
        enterExpirationDate(expDate);
        enterSecurityCode(cvv);
        tapReviewOrder();
    }
}
