package saucedemo.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class CheckoutCompletePage extends PageObject {

    @FindBy(className = "complete-header")
    private WebElementFacade completeHeader;

    public String getConfirmationMessage() {
        return completeHeader.getText();
    }
}