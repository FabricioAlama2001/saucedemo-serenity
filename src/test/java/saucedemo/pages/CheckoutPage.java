package saucedemo.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends PageObject {

    @FindBy(id = "first-name")
    private WebElementFacade firstNameInput;

    @FindBy(id = "last-name")
    private WebElementFacade lastNameInput;

    @FindBy(id = "postal-code")
    private WebElementFacade postalCodeInput;

    @FindBy(id = "continue")
    private WebElementFacade continueButton;

    public void fillCheckoutInformation(String firstName, String lastName, String postalCode) {
        firstNameInput.type(firstName);
        lastNameInput.type(lastName);
        postalCodeInput.type(postalCode);
    }

    public void continueCheckout() {
        continueButton.click();
    }
}