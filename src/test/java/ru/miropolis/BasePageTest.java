package ru.miropolis;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.remote.DesiredCapabilities;
import ru.miropolis.config.ConfigManager;

public class BasePageTest {

    @BeforeAll
    public static void setUp() {
        Configuration.fastSetValue = ConfigManager.getServerConfig().fastSetValue();
        Configuration.baseUrl = ConfigManager.getServerConfig().baseUrl();
        Configuration.browser = ConfigManager.getServerConfig().browser();
        Configuration.browserSize = ConfigManager.getServerConfig().browserSize();

    }
}
