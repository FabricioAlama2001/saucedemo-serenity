package saucedemo.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

public class CartPage extends PageObject {

    @FindBy(id = "checkout")
    private WebElementFacade checkoutButton;

    public boolean isProductDisplayed(String productName) {
        String xpath = "//div[@class='inventory_item_name' and text()='" + productName + "']";
        return $(By.xpath(xpath)).isPresent();
    }

    public void clickCheckout() {
        checkoutButton.click();
    }
}