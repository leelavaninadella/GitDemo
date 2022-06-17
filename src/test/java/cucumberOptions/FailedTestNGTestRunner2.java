package cucumberOptions;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
//html, json, junit, extent reports
@CucumberOptions(features = "@target/failed-scenarios.txt", glue = "stepDefinitions", 
monochrome = true, 
plugin = {"pretty","html:target/cucumber.html", 
				   "json:target/cucumber.json",
					"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"} )
public class FailedTestNGTestRunner2 extends AbstractTestNGCucumberTests {

	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios() {
		return super.scenarios();
	}

}
