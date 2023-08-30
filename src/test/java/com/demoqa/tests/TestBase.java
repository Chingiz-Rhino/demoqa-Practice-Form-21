package com.demoqa.tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.Map;

public class TestBase {
    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.pageLoadStrategy = "eager";
        Configuration.browserSize = "1980x1200";
        Configuration.remote = "https://user1:1234@selenoid.autotests.cloud/wd/hub";
        Configuration.holdBrowserOpen = true;
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("selenoid:options", Map.of(
                "enableVNS", true,
                "enableVideo", true
        ));
        Configuration.browserCapabilities = capabilities;
    }
}
