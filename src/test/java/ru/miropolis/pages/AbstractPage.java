package ru.miropolis.pages;

import com.codeborne.selenide.Selenide;

public abstract class AbstractPage {

    private final String URL;

    AbstractPage(String url){
        this.URL = url;
    }

    public String getPageURL() {
        return this.URL;
    }

    public void open() {
        Selenide.open(this.URL);
    }

    public abstract void waitForLoad();

}
