package saucedemo.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class CheckoutOverviewPage extends PageObject {

    @FindBy(id = "finish")
    private WebElementFacade finishButton;

    public void finishPurchase() {
        finishButton.click();
    }
}