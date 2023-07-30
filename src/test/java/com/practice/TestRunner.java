package com.practice;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;


@CucumberOptions(
        plugin = {"pretty",
                "html:target/cucumber-reports/cucumber.html",
                "json:target/cucumber-reports/cucumber.json",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"

        },
        features = {"src/test/resources/features"},
        glue = {"com.practice.steps","com.core.hooks"}
        //, tags =  "@Navbar"

)
@Test
public class TestRunner extends AbstractTestNGCucumberTests {

}



