package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	@Before("@MobileTest")
	public void beforeMobileValidation()
	{
		System.out.println("PreRequisite for before mobile validation");
	System.out.println("***********");
	}
	
	@After("@MobileTest")
	public void afterMobileValidation()
	{
		System.out.println("PreRequisite for after mobile validation");
		System.out.println("***********");
	}
	
	@Before("WebTest")
	public void beforeWebValidation()
	{
		System.out.println("PreRequisite for before Web validation");
		System.out.println("***********");
	}
	
	@After("WebTest")
	public void afterWebValidation()
	{
		System.out.println("PreRequisite for after Web validation");
		System.out.println("***********");
	}
	
	

}
