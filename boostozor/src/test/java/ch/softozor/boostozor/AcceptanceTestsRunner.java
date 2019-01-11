package ch.softozor.boostozor;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/ch/softozor/boostozor/features", glue="", plugin= {"pretty"}, monochrome=true)
public class AcceptanceTestsRunner {

}
