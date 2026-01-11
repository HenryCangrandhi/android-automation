package stepdefinitions;

import base.BaseTest;
import io.cucumber.java.en.*;
import pages.*;

import static org.junit.Assert.assertTrue;

public class CheckoutSteps extends BaseTest {

    ProductsPage productsPage;
    LoginPage loginPage;
    CheckOutPage checkOutPage;
    PaymentMethodPage paymentMethodPage;
    CheckoutReviewPage reviewPage;
    OrderCompletePage completePage;

    @Given("user opens the app")
    public void user_opens_the_app() {
        productsPage = new ProductsPage(driver);
        loginPage = new LoginPage(driver);
        checkOutPage = new CheckOutPage(driver);
        paymentMethodPage = new PaymentMethodPage(driver);
        reviewPage = new CheckoutReviewPage(driver);
        completePage = new OrderCompletePage(driver);
    }

    @When("user selects backpack product")
    public void user_selects_backpack_product() {
        productsPage.selectBackpack();
        assertTrue("Add to cart button should be visible",
                productsPage.isAddToCartVisible());
    }

    @And("user adds product to cart")
    public void user_adds_product_to_cart() {
        productsPage.selectBlueColor();
        productsPage.selectAddItems();
        productsPage.selectAddItems();
        productsPage.selectAddToCart();
    }

    @And("user proceeds to checkout")
    public void user_proceeds_to_checkout() {
        productsPage.selectShoppingCart();
        productsPage.selectCheckOutButton();
    }

    @And("user logs in with valid credentials")
    public void user_logs_in() {
        loginPage.loginAs("bod@example.com", "10203040");
    }

    @And("user fills checkout information")
    public void user_fills_checkout_information() {
        checkOutPage.FillCheckout(
                "John Doe",
                "ABC tower",
                "Kuningan",
                "Jakarta",
                "Jawa Barat",
                "11111",
                "Indonesia"
        );
    }

    @And("user fills payment method")
    public void user_fills_payment_method() {
        paymentMethodPage.fillPaymentMethod(
                "Henry QA",
                "4111111111111111",
                "12/25",
                "123"
        );
        reviewPage.placeOrder();
    }

    @Then("order should be completed successfully")
    public void order_should_be_completed_successfully() {
        assertTrue("Order success title should be displayed",
                completePage.isSuccessTitleDisplayed());
        completePage.continueShopping();
    }
}
