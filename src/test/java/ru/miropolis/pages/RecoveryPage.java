package ru.miropolis.pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Condition.visible;


public class RecoveryPage extends AbstractPage{

    private static final By rootPageElement = By.cssSelector("div[class=mira-page-forgot-password-form]");
    private static final String URL = "//Do?doaction=Go&s=LTgJXtFTB3BekPDmQLsq&id=0&type=remindpassword";

    public RecoveryPage() {
        super(URL);
    }

    @Override
    public void waitForLoad() {
        $(rootPageElement).shouldBe(visible);
    }
}
