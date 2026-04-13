package saucedemo.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageObject {

    @FindBy(id = "user-name")
    private WebElementFacade usernameInput;

    @FindBy(id = "password")
    private WebElementFacade passwordInput;

    @FindBy(id = "login-button")
    private WebElementFacade loginButton;

    public void openLoginPage() {
        openUrl("https://www.saucedemo.com/");
    }

    public void loginAs(String username, String password) {
        usernameInput.type(username);
        passwordInput.type(password);
        loginButton.click();
    }
}