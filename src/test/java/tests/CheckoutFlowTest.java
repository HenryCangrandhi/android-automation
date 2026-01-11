package tests;

import base.BaseTest;
import org.junit.Test;
import pages.*;

import static org.junit.Assert.assertTrue;

public class CheckoutFlowTest extends BaseTest {
    @Test
    public void CheckOutFlow() {


        ProductsPage productsPage = new ProductsPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        CheckOutPage checkOutPage = new CheckOutPage(driver);
        PaymentMethodPage paymentMethodPage = new PaymentMethodPage(driver);
        CheckoutReviewPage reviewPage = new CheckoutReviewPage(driver);
        OrderCompletePage completePage = new OrderCompletePage(driver);

        productsPage.selectBackpack();
        assertTrue(
                "Add to cart button should be visible",
                productsPage.isAddToCartVisible()
        );
        productsPage.selectBlueColor();
        productsPage.selectAddItems();
        productsPage.selectAddItems();
        productsPage.selectAddToCart();
        productsPage.selectShoppingCart();
        productsPage.selectCheckOutButton();

        loginPage.loginAs("bod@example.com", "10203040");

        checkOutPage.FillCheckout(
                "John Doe",
                "ABC tower",
                "Kuningan",
                "Jakarta",
                "Jawa Barat",
                "11111",
                "Indonesia"
        );

        //log.info("✅ Fill checkout information success, go to payment method");

        paymentMethodPage.fillPaymentMethod(
                "Henry QA",
                "4111111111111111",
                "12/25",
                "123"
        );
        reviewPage.placeOrder();

        assertTrue(
                "Order success title should be displayed",
                completePage.isSuccessTitleDisplayed()
        );

        completePage.continueShopping();

        //log.info("✅ Checkout Flow test succeed");
    }
}
