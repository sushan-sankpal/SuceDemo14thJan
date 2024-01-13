	package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.UtlityMethods;

public class HomePage extends BaseClass {
	
	@FindBy (id = "add-to-cart-sauce-labs-backpack")
	private WebElement prod1;
	
	@FindBy (xpath = "//a[@class='shopping_cart_link']")
	private WebElement cart;
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public String getTitle()
	{
		return driver.getTitle();
	}
	
	public String getURL()
	{
		return driver.getCurrentUrl();
	}
	
	public void addToCart()
	{
		UtlityMethods.click(prod1);
		UtlityMethods.click(cart);
		
	}
	
}
