package ru.miropolis.widgets;

import ru.miropolis.elements.ButtonElement;
import ru.miropolis.elements.InputElement;
import ru.miropolis.elements.LinkElement;
import org.openqa.selenium.By;

public class LoginWidget extends AbstractWidget{

    private final By loginLocator = By.cssSelector("[id=login_form_panel] input[name=user]");
    private final By passwordLocator = By.xpath(".//form[@id='login_form_panel']/..//input[@name='password']");
    private final By loginButtonLocator = By.id("button_submit_login_form");
    private final By forgotPasswordLinkLocator = By.cssSelector("form[id=login_form_panel] a[class=mira-default-login-page-link]");

    public LoginWidget() {
        setRootElement(By.className("mira-page-login-one-form"));
    }

    private InputElement getLoginInput() {
        return new InputElement(getRootElement().find(loginLocator));
    }

    private InputElement getPasswordInput() {
        return new InputElement(getRootElement().find(passwordLocator));
    }

    private ButtonElement getButtonElement() {
        return new ButtonElement(getRootElement().find(loginButtonLocator));
    }

    private LinkElement getForgotPasswordLink() {
        return new LinkElement(getRootElement().find(forgotPasswordLinkLocator));
    }

    public void logIn(String login, String password) {
        InputElement loginInput = getLoginInput();
        loginInput.waitForVisible();
        loginInput.setValue(login);
        InputElement passwordInput = getPasswordInput();
        passwordInput.waitForVisible();
        passwordInput.setValue(password);
        ButtonElement buttonElement = getButtonElement();
        buttonElement.waitForVisible();
        buttonElement.click();
    }

    public void clickForgotPasswordLink() {
        LinkElement forgotPasswordLink = getForgotPasswordLink();
        forgotPasswordLink.waitForVisible();
        forgotPasswordLink.click();
    }
}
