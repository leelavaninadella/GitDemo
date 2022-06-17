package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOut {
	public WebDriver driver;
	
	public CheckOut(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By cartBag = By.cssSelector("img[alt='Cart']");
	By proceedToCheckOut = By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]");
	By promoButton = By.cssSelector(".promoBtn");
	By placeOrder = By.xpath("//button[contains(text(),'Place Order')]");
	
	public void checkOutItems()
	{
		driver.findElement(cartBag).click();
		driver.findElement(proceedToCheckOut).click();
	}
	
	public boolean verifyPromoBtn()
	{
		return driver.findElement(promoButton).isDisplayed();
	}
	
	public boolean verifyPlaceOrder()
	{
		return driver.findElement(placeOrder).isDisplayed();
	}
	

}
