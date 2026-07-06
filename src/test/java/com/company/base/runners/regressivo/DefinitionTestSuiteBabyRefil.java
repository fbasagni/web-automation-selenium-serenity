package com.company.base.runners.regressivo;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = {"src/test/resources/features/babyrefil.feature"},
        tags = "@babyrefil and not @wip",
        glue = {"com.company.base"},
        dryRun = false
)
public class DefinitionTestSuiteBabyRefil {
}
