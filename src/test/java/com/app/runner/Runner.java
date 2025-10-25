package com.app.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/com/app/feature",
glue = "com.app.stepdefinition",
tags = "@Map",
//plugin =  {
//        "pretty",
//        "html:target/cucumber-reports/html-report.html", 
//        "json:target/cucumber-reports/cucumber.json", 
//        "junit:target/cucumber-reports/cucumber.xml" 
//    },
publish = true,
monochrome = true,
dryRun = false
)

public class Runner {

}
