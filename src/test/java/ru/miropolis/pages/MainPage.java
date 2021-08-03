package ru.miropolis.pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Condition.visible;


public class MainPage extends AbstractPage{

    private final static By rootPageElement = By.cssSelector("table[class=mira-wrap-body-table]");
    private final static String URL = "/";

    public MainPage(){
        super(URL);
    }

    @Override
    public void waitForLoad() {
        $(rootPageElement).shouldBe(visible);
    }
}
