package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	
	public LandingPage landingPage;
	public OfferPage offerPage;
	public WebDriver driver;
	public CheckOut checkOut;
	
	public PageObjectManager(WebDriver driver)
	{
	this.driver = driver;	
	}
	
	
	public LandingPage getLandingPage()
	{
		landingPage = new LandingPage(driver);
		return landingPage;
	}
	
	public OfferPage getOfferPage()
	{
		offerPage = new OfferPage(driver);
		return offerPage;
		}
	
	public CheckOut getCheckOutPage()
	{
		checkOut = new CheckOut(driver); 
		return checkOut;
	}

}
