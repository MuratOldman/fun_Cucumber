package com.fun.Runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "com/fun/StepDefinitions",
        features = "src/test/resources",
        plugin = "html:target/cucumber-report.html",
        dryRun = false

)
public class Runner1 {
}
