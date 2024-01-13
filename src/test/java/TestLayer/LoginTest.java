package TestLayer;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.LoginPage;
import UtilityLayer.ExcelReader;

public class LoginTest extends BaseClass{
	@BeforeTest
	public void setup() {
		BaseClass.initilization();	
	}
	
	@Test(priority = 1 ,dataProvider = "TestData")
	public void validateLoginPage(String LoginID,String Pass)
	{	
		LoginPage login = new LoginPage();
		login.loginPage(LoginID, Pass);
	}
	
	@DataProvider(name = "TestData" )
	public Object [][] getData() throws IOException
	{
		ExcelReader obj = new ExcelReader(System.getProperty("user.dir")+"\\src\\main\\java\\DataLayer\\NewTestData.xlsx");
	//	Object [][] abc = obj.getAllSheetData(0);
		return obj.getAllSheetData(0);
	}
}

