package com.cydeo.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "html:target/cucumber-report.html",
        //in order to get the path of definitions
        glue = "com/cydeo/step_definitions",
        //in order to get the path of feature files
        features = "src/test/resources/features",
        //if true we can get the snippits which are unimplemented
        //if false we can run the methods
        dryRun = false,
        tags ="@smoke"




)
public class CukesRunner {
}
