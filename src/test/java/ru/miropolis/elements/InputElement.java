package ru.miropolis.elements;

import com.codeborne.selenide.SelenideElement;
import ru.miropolis.widgets.AbstractWidget;

public class InputElement extends AbstractWidget {

    public InputElement(SelenideElement rootElement) {
        setRootElement(rootElement);
    }

    public void setValue(String value) {
        getRootElement().setValue(value);
    }

    public String getValue() {
        return getRootElement().getValue();
    }
}
