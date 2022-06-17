package stepDefinitions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.gherkin.model.Scenario;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import utils.TestContextSetUp;
import io.cucumber.java.*;

public class Hooks {
	
	public TestContextSetUp testContextSetUp;

	public Hooks(TestContextSetUp testContextSetUp)
	{
		this.testContextSetUp = testContextSetUp;
	}
	
	@After
	
	public void teardown() throws Exception
	{
		testContextSetUp.baseClass.webDriverManager().quit();
	}
	
	
	/*
	 * @AfterStep public void addScreenshots(Scenario scenario) throws Exception {
	 * WebDriver driver = testContextSetUp.baseClass.webDriverManager();
	 * 
	 * 
	 * 
	 * TakesScreenshot ts = (TakesScreenshot) driver; File sourcePath =
	 * ts.getScreenshotAs(OutputType.FILE); byte[] fileContent =
	 * FileUtils.readFileToByteArray(sourcePath);
	 * 
	 * 
	 * }
	 */
}
