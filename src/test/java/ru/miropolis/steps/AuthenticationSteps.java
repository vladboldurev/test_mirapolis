package ru.miropolis.steps;

import ru.miropolis.pages.AuthenticationPage;
import ru.miropolis.pages.MainPage;
import ru.miropolis.pages.RecoveryPage;

public class AuthenticationSteps {

    private AuthenticationPage authenticationPage;
    private MainPage mainPage;
    private RecoveryPage recoveryPage;

    public AuthenticationSteps() {
        this.authenticationPage = new AuthenticationPage();
        this.mainPage = new MainPage();
        this.recoveryPage = new RecoveryPage();
    }

    public void goToAuthenticatePage() {
        authenticationPage.open();
        authenticationPage.waitForLoad();
    }

    public void logIn(String login, String password) {
        authenticationPage.logIn(login, password);
        mainPage.waitForLoad();
    }

    public void clickForgotPasswordLink() {
        authenticationPage.clickForgotPasswordLink();
        recoveryPage.waitForLoad();
    }

}
