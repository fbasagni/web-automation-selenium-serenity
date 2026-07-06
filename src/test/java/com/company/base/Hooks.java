package com.company.base;

import com.company.base.pages.BasePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.thucydides.core.annotations.Steps;

public class Hooks extends BasePage {

    @Before
    public void beforeScenarioAllTests() {
        WebDriverManager.chromedriver().setup();
        getDriver().manage().deleteAllCookies();
    }

    @After
    public void afterScenarioAllTests() {
        // Sem quit()/close() explicito: o Serenity controla o ciclo de vida do
        // driver conforme restart.browser.for.each (serenity.properties), reaproveitando
        // a mesma instancia do navegador entre cenarios do mesmo .feature.
    }

}
