package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.UtlityMethods;

public class LoginPage extends BaseClass {
	@FindBy (name = "user-name")
	private WebElement username;
	
	@FindBy (name = "password")
	private WebElement password;

	@FindBy(id="login-button")
	private WebElement LoginButton;
	
	public LoginPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	public void loginPage(String uname, String pwd)
	{
		System.out.println("Dushyant The Lead");
		UtlityMethods.sendKeys(username, uname);
		UtlityMethods.sendKeys(password, pwd);
		UtlityMethods.click(LoginButton);
		
	}


}
