package tests;

import base.BaseTest;
import org.junit.Test;
import pages.*;

import static org.junit.Assert.assertTrue;

public class ProductNavigationTest extends BaseTest {

    @Test
    public void productNavigation() {


        ProductsPage productsPage = new ProductsPage(driver);

        productsPage.selectBackpack();
        assertTrue(
                "Add to cart button should be visible",
                productsPage.isAddToCartVisible()
        );
        driver.navigate().back();
        productsPage.selectBikeLight();
        assertTrue(
                "Add to cart button should be visible",
                productsPage.isAddToCartVisible()
        );
    }
}
