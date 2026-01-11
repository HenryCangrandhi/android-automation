package pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class ProductsPage extends BasePage {

    // Locators
    private final By backpackItem = AppiumBy.accessibilityId("Sauce Lab Back Packs");

    private final By blueColor = AppiumBy.accessibilityId("Blue color");

    private final By addToCartButton = AppiumBy.accessibilityId("Tap to add product to cart");

    private final By addItems = AppiumBy.accessibilityId("Increase item quantity");

    private final By goToShoppingCart = AppiumBy.accessibilityId("Displays number of items in your cart");

    private final By selectCheckOutButton = AppiumBy.accessibilityId("Confirms products for checkout");

    private final By bikeLightItem = AppiumBy.accessibilityId("Sauce Lab Bike Light");

    // Constructor
    public ProductsPage(io.appium.java_client.android.AndroidDriver driver) {
        super(driver);
    }

    // Actions
    public void selectBackpack() {
        click(backpackItem);
    }

    public void selectBikeLight() {
        click(bikeLightItem);
    }

    public void selectBlueColor() {
        click(blueColor);
    }

    public boolean isAddToCartVisible() {
        return isDisplayed(addToCartButton);
    }

    public void selectAddToCart() {
        click(addToCartButton);
    }

    public void selectAddItems() {
        click(addItems);
    }

    public void selectShoppingCart() {
        click(goToShoppingCart);
    }

    public void selectCheckOutButton() {
        click(selectCheckOutButton);
    }

}

