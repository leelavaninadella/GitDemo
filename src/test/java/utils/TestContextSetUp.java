package utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import pageObjects.PageObjectManager;

public class TestContextSetUp {

	public WebDriver driver;
	public String landingPageproductName;
	public String offerPageProduct;
	public PageObjectManager pageObjectManager;
	public TestBaseClass baseClass;
	public GenericUitils genericUtils;
	public String checkOutPage;
	
	public TestContextSetUp() throws Exception
	{
		baseClass = new TestBaseClass();
		pageObjectManager = new PageObjectManager(baseClass.webDriverManager());
		genericUtils = new GenericUitils(baseClass.webDriverManager());
		
	}
}
