package utils;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GenericUitils {
	
	public WebDriver driver;
	
public 	GenericUitils( WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void switchToChildWindow()
	{
		driver.findElement(By.linkText("Top Deals")).click();
		Set<String> windows =driver.getWindowHandles();
		Iterator<String> iterator = windows.iterator();
		String parentWindow = iterator.next();
		String childWindow = iterator.next();
		driver.switchTo().window(childWindow);
	}

}
