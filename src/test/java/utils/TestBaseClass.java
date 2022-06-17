package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBaseClass {

	public WebDriver driver;

	public WebDriver webDriverManager() throws IOException {
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\resources\\global.properties");
		prop.load(fis);
		String url = prop.getProperty("QAUrl");
		if (driver == null) {
			
			if(prop.getProperty("browser").equalsIgnoreCase("chrome"))
			{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(); // driver gets the life
			driver.manage().window().maximize();
			}
			else if(prop.getProperty("browser").equalsIgnoreCase("firefox"))
			{
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver(); // driver gets the life
				driver.manage().window().maximize();
			}
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
		
		return driver;
	}


}
