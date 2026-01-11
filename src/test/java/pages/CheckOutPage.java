package pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class CheckOutPage extends BasePage {

    // Locators
    private final By fullnameField =
            AppiumBy.id("com.saucelabs.mydemoapp.android:id/fullNameET");

    private final By addressLine1 =
            AppiumBy.id("com.saucelabs.mydemoapp.android:id/address1ET");

    private final By addressLine2 =
            AppiumBy.id("com.saucelabs.mydemoapp.android:id/address2ET");

    private final By cityField =
            AppiumBy.id("com.saucelabs.mydemoapp.android:id/cityET");

    private final By stateField =
            AppiumBy.id("com.saucelabs.mydemoapp.android:id/stateET");

    private final By zipCodeField =
            AppiumBy.id("com.saucelabs.mydemoapp.android:id/zipET");

    private final By countryField =
            AppiumBy.id("com.saucelabs.mydemoapp.android:id/countryET");

    private final By selectPaymentButton =
            AppiumBy.accessibilityId("Saves user info for checkout");

    public CheckOutPage(io.appium.java_client.android.AndroidDriver driver) {
        super(driver);
    }


    // Actions
    public void enterFullName(String FullName) {
        find(fullnameField).sendKeys(FullName);
    }

    public void enterAddressLine1(String AddressLine1) {
        find(addressLine1).sendKeys(AddressLine1);
    }

    public void enterAddressLine2(String AddressLine2) {
        find(addressLine2).sendKeys(AddressLine2);
    }

    public void enterCityField(String City) {
        find(cityField).sendKeys(City);
    }

    public void enterStateField(String State) {
        find(stateField).sendKeys(State);
    }

    public void enterZipCodeField(String zipCode) {
        find(zipCodeField).sendKeys(zipCode);
    }

    public void enterCountryField(String Country) {
        find(countryField).sendKeys(Country);
    }

    public void tapToPayment() {
        click(selectPaymentButton);
    }

    public void FillCheckout(String FullName, String AddressLine1, String AddressLine2, String City,
                             String State, String zipCode, String Country) {
    enterFullName(FullName);
    enterAddressLine1(AddressLine1);
    enterAddressLine2(AddressLine2);
    enterCityField(City);
    enterStateField(State);
    enterZipCodeField(zipCode);
    enterCountryField(Country);
    tapToPayment();
    }


}
