package ru.miropolis.elements;

import com.codeborne.selenide.SelenideElement;
import ru.miropolis.widgets.AbstractWidget;

public class LinkElement extends AbstractWidget {
    public LinkElement(SelenideElement rootElement) {
        setRootElement(rootElement);
    }
}
