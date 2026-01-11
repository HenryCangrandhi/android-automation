package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BasePage {

    protected AndroidDriver driver;

    public BasePage(AndroidDriver driver) {
        this.driver = driver;
    }

    protected WebElement find(By locator) {
        return driver.findElement(locator);
    }

    protected void click(By locator) {
        find(locator).click();
    }

    protected boolean isDisplayed(By locator) {
        return find(locator).isDisplayed();
    }
}
