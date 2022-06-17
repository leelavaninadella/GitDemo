package stepDefinitions;

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
import pageObjects.OfferPage;
import utils.TestContextSetUp;

public class OfferPageStepDefinition {

	public TestContextSetUp tsetContxtSetUP;

	// Single Responsiblity Principle
	// Loosly coupled

	// public String offerPageProduct;

	public OfferPageStepDefinition(TestContextSetUp tsetContxtSetUP) {
		this.tsetContxtSetUP = tsetContxtSetUP;
	}

	@Then("^User searched for same (.+) shortname in offers page$")
	public void user_searched_for_same_something_shortname_in_offers_page(String shortName) throws Throwable {
		switchToOffersPage();
		OfferPage offerPage = tsetContxtSetUP.pageObjectManager.getOfferPage();
		offerPage.searchItem(shortName);
		Thread.sleep(3000);
		tsetContxtSetUP.offerPageProduct = offerPage.getProductName();
		System.out.println(tsetContxtSetUP.offerPageProduct + " is extracted from offerPage");
	}

	@And("validate product name in offersPage matches with LandingPage")
	public void validate_product_name_in_offers_page_matches_with_landing_page() {
		Assert.assertEquals(tsetContxtSetUP.landingPageproductName, tsetContxtSetUP.offerPageProduct);

	}

	public void switchToOffersPage() {
		// if switched to offers page ---> simply skip below part
		// if(tsetContxtSetUP.driver.getCurrentUrl().equalsIgnoreCase("https://rahulshettyacademy.com/seleniumPractise/#/offers"))
		LandingPage landingPage = tsetContxtSetUP.pageObjectManager.getLandingPage();
		landingPage.clickTopDeals();
		tsetContxtSetUP.genericUtils.switchToChildWindow();

	}

}
