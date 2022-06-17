package stepDefinitions;

import org.testng.Assert;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageObjects.CheckOut;
import pageObjects.PageObjectManager;
import utils.TestContextSetUp;

public class CheckOutPageStepDefinition2 {
	/*
	 * public WebDriver driver; public String landingPageproductName; public String
	 * offerPageProduct;
	 */
	public TestContextSetUp tsetContxtSetUP;
	public PageObjectManager pageObjectManager;
	public CheckOut checkOutPage;

	public CheckOutPageStepDefinition2(TestContextSetUp tsetContxtSetUP) {
		this.tsetContxtSetUP = tsetContxtSetUP;
		this.checkOutPage = tsetContxtSetUP.pageObjectManager.getCheckOutPage();
	}

	
	@Then("^User proceeds t Checkout and validate the (.+) items in checkout page$")
    public void user_proceeds_t_checkout_and_validate_the_items_in_checkout_page(String name) throws Throwable {
		checkOutPage.checkOutItems();
		Thread.sleep(3000);
		//Assertion to extract name from screen and compare with name
	}

    @And("^verify user has ability to enter promocode and place the order$")
    public void verify_user_has_ability_to_enter_promocode_and_place_the_order() throws Throwable {
    	
		Assert.assertTrue(checkOutPage.verifyPromoBtn()); 
		Assert.assertTrue(checkOutPage.verifyPlaceOrder());
    }

	

	
}
