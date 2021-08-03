package ru.miropolis.elements;

import com.codeborne.selenide.SelenideElement;
import ru.miropolis.widgets.AbstractWidget;

public class ButtonElement extends AbstractWidget {

    public ButtonElement(SelenideElement rootElement) {
        setRootElement(rootElement);
    }

}
