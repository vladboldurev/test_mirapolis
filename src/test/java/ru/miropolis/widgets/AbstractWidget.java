package ru.miropolis.widgets;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Condition.visible;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public abstract class AbstractWidget {

    private SelenideElement rootElement;
    private By rootBy;

    protected SelenideElement getRootElement() {
        return (this.rootElement == null) ? $(this.rootBy): this.rootElement;
    }

    public void setRootElement(SelenideElement rootElement) {
        this.rootElement = rootElement;
    }

    public void setRootElement(By rootBy) {
        this.rootBy = rootBy;
    }

    public AbstractWidget waitForVisible() {
        getRootElement().shouldBe(visible);
        return this;
    }

    public AbstractWidget click() {
        getRootElement().click();
        return this;
    }

    public WebElement getChildElementByLocator(By byLocator){
        return getRootElement().find(byLocator);
    }

    public ElementsCollection getChildElementsByLocator(By byLocator){
        return getRootElement().findAll(byLocator);
    }

}
