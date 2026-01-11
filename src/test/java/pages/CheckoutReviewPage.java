package pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class CheckoutReviewPage extends BasePage {

    private final By placeOrderButton =
            AppiumBy.accessibilityId("Completes the process of checkout");

    public CheckoutReviewPage(io.appium.java_client.android.AndroidDriver driver) {
        super(driver);
    }

    public void placeOrder() {
        click(placeOrderButton);
    }
}
