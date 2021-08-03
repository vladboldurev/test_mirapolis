package ru.miropolis;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import ru.miropolis.steps.AuthenticationSteps;
import ru.miropolis.config.ConfigManager;


public class AuthenticationPageTest extends BasePageTest {

    @Test
    public void shouldBeSuccessfullyLoggedIn() {
        AuthenticationSteps authenticationSteps = new AuthenticationSteps();
        authenticationSteps.goToAuthenticatePage();
        authenticationSteps.logIn(ConfigManager.getAccountManager().login(), ConfigManager.getAccountManager().password());
    }

    @Test
    public void shouldBeSuccessfullyRedirectToRecoveryPage() {
        AuthenticationSteps authenticationSteps = new AuthenticationSteps();
        authenticationSteps.goToAuthenticatePage();
        authenticationSteps.clickForgotPasswordLink();
    }

}
