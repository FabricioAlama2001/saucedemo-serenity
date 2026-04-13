package saucedemo.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

public class InventoryPage extends PageObject {

    @FindBy(id = "shopping_cart_container")
    private WebElementFacade shoppingCartButton;

    public void addProductToCart(String productName) {
        String xpath = "//div[text()='" + productName + "']/ancestor::div[@class='inventory_item']//button";
        $(By.xpath(xpath)).click();
    }

    public void openCart() {
        shoppingCartButton.click();
    }
}