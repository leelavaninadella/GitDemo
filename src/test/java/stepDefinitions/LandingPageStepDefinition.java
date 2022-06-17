package stepDefinitions;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.LandingPage;
import pageObjects.PageObjectManager;
import utils.TestContextSetUp;

public class LandingPageStepDefinition {
	/*
	 * public WebDriver driver; public String landingPageproductName; public String
	 * offerPageProduct;
	 */
	public TestContextSetUp tsetContxtSetUP;
	public PageObjectManager pageObjectManager;
	public LandingPage landingPage;

	public LandingPageStepDefinition(TestContextSetUp tsetContxtSetUP) {
		this.tsetContxtSetUP = tsetContxtSetUP;
		this.landingPage = tsetContxtSetUP.pageObjectManager.getLandingPage();
	}

	@Given("^User is on Greencart Landing Page$")
	public void user_is_on_greencart_landing_page() throws Exception {
		// tsetContxtSetUP.baseClass.webDriverManager();
		Assert.assertTrue(landingPage.getTitleOfLandingPage().contains("GreenKart"));
	}

	@When("^User searched with ShortName (.+) and extracted actual name of the product$")
	public void user_searched_with_shortname_and_extracted_actual_name_of_the_product(String shortName)
			throws Throwable {
		// pageObjectManager = new PageObjectManager(tsetContxtSetUP.driver);
		
		landingPage.searchItem(shortName);
		Thread.sleep(3000);
		tsetContxtSetUP.landingPageproductName = landingPage.getProductName().split("-")[0].trim();
		System.out.println(tsetContxtSetUP.landingPageproductName + " is extracted from Home Page");
	}
	
	@When("^Added \"([^\"]*)\" items of the selected product to cart$")
	    public void added_something_items_of_the_selected_product_to_cart(String quantity) throws Throwable {
		landingPage.incrementQuantity(Integer.parseInt(quantity));
		landingPage.addToCart();
	    }


}
