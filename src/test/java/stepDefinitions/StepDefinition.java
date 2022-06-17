package stepDefinitions;

import java.util.List;

import org.junit.runner.RunWith;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

public class StepDefinition {
	
	  @Given("^validate the browser$")
	    public void validate_the_browser() throws Throwable {
	        System.out.println("Deciding Browser will opened");
	    }

	    @When("^Browser is triggered$")
	    public void browser_is_triggered() throws Throwable {
	    	System.out.println("Browser is triggered");
	        
	    }

	    @Then("^Validate if browser is started$")
	    public void validate_if_browser_is_started() throws Throwable {
	      System.out.println("Browser uis validated");  
	    }

	@Given("^user is on landing page$")
	public void user_is_on_landing_page() throws Throwable {
		System.out.println("user is on landing page");
	}

	@When("^user login into application with \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void user_login_into_application_with_something_and_password_something(String strArg1, String strArg2)
			throws Throwable {
		System.out.println("user login into application with userName and password");
		System.out.println(strArg1);
		System.out.println(strArg2);
	}

	/*
	 * @When("^user login into application with userName and password$") public void
	 * user_login_into_application_with_username_and_password() throws Throwable {
	 * System.out.println("user login into application with userName and password");
	 * }
	 */

	@Then("^Home page is populated$")
	public void home_page_is_populated() throws Throwable {
		System.out.println("Home page is populated");
	}

	@And("^cards displayed are \"([^\"]*)\"$")
	public void cards_displayed_are_something(String strArg1) throws Throwable {
		System.out.println(strArg1);
	}

	@When("^user signup with following details$")
	public void user_signup_with_following_details(DataTable data) throws Throwable {
		List<List<String>> obj = data.asLists();
		System.out.println(obj.get(0).get(0));
		System.out.println(obj.get(0).get(1));
		System.out.println(obj.get(0).get(2));
		System.out.println(obj.get(0).get(3));
	}
	
	 @When("^user login with (.+) and (.+)$")
	    public void user_login_with_and(String username, String password) throws Throwable {
	       System.out.println(username);
	       System.out.println(password);
	    }

	/*
	 * @And("^cards are displayed$") public void cards_are_displayed() throws
	 * Throwable { System.out.println("cards are displayed"); }
	 */

	/*
	 * @Given("^user is on landing page$") public void user_is_on_landing_page()
	 * throws Throwable { //Code to navigate to login url
	 * System.out.println("user is on landing page"); }
	 * 
	 * @When("^ user login into application with userName and password$") public
	 * void user_login_into_application_with_username_and_password() throws
	 * Throwable { //code to login
	 * System.out.println("user login into application with userName and password");
	 * }
	 * 
	 * @Then("^ Home page is populated$") public void home_page_is_populated()
	 * throws Throwable { //home page validation
	 * System.out.println("Home page is populated"); }
	 * 
	 * @And("^  cards are displayed$") public void cards_are_displayed() throws
	 * Throwable { //validating the cards System.out.println("cards are displayed");
	 * }
	 */
}
