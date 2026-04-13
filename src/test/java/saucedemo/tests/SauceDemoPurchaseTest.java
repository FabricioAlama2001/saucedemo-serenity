package saucedemo.tests;

import net.serenitybdd.annotations.Managed;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;
import saucedemo.pages.CartPage;
import saucedemo.pages.CheckoutCompletePage;
import saucedemo.pages.CheckoutOverviewPage;
import saucedemo.pages.CheckoutPage;
import saucedemo.pages.InventoryPage;
import saucedemo.pages.LoginPage;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(SerenityJUnit5Extension.class)
public class SauceDemoPurchaseTest {

    @Managed(driver = "chrome")
    WebDriver driver;

    LoginPage loginPage;
    InventoryPage inventoryPage;
    CartPage cartPage;
    CheckoutPage checkoutPage;
    CheckoutOverviewPage checkoutOverviewPage;
    CheckoutCompletePage checkoutCompletePage;

    @Test
    void should_complete_purchase_successfully() {
        String firstProduct = "Sauce Labs Backpack";
        String secondProduct = "Sauce Labs Bike Light";

        loginPage.openLoginPage();
        loginPage.loginAs("standard_user", "secret_sauce");

        inventoryPage.addProductToCart(firstProduct);
        inventoryPage.addProductToCart(secondProduct);
        inventoryPage.openCart();

        assertTrue(cartPage.isProductDisplayed(firstProduct));
        assertTrue(cartPage.isProductDisplayed(secondProduct));

        cartPage.clickCheckout();

        checkoutPage.fillCheckoutInformation("Fabricio", "QA", "170150");
        checkoutPage.continueCheckout();

        checkoutOverviewPage.finishPurchase();

        assertEquals("Thank you for your order!", checkoutCompletePage.getConfirmationMessage());
    }
}