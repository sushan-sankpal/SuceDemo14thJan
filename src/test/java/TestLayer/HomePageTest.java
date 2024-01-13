package TestLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.HomePage;


public class HomePageTest extends BaseClass{
	
	private HomePage homePage;
	
	@Test(priority = 2)
	public void validatePageTitle()
	{
		homePage = new HomePage();
		Assert.assertEquals(homePage.getTitle(), "Swag Labs");
	}
	
	@Test(priority = 3)
	public void validatePageURL()
	{
		boolean result = homePage.getURL().contains("sauce");
		Assert.assertTrue(result);
	}
	
	@Test(priority = 4)
	public void validateAddToCart()
	{
		homePage.addToCart();
	}
}
