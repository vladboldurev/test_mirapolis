package ru.miropolis.pages;

import org.openqa.selenium.By;
import ru.miropolis.widgets.LoginWidget;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class AuthenticationPage extends AbstractPage{

    private final static By rootPageElement = By.cssSelector("div[class=mira-page-login]");
    private final static String URL = "/Do?doaction=Go&s=ZwVWq6Ik3FtW2hBuwgSL&id=0&type=customloginpage";

    public AuthenticationPage() {
        super(URL);
    }

    public LoginWidget getLoginWidget() { return new LoginWidget(); }

    public void logIn(String login, String password) {
        LoginWidget loginWidget = getLoginWidget();
        loginWidget.waitForVisible();
        loginWidget.logIn(login, password);
    }

    public void clickForgotPasswordLink(){
        LoginWidget loginWidget = getLoginWidget();
        loginWidget.waitForVisible();
        loginWidget.clickForgotPasswordLink();
    }

    @Override
    public void waitForLoad() {
        $(rootPageElement).shouldBe(visible);
    }


}
