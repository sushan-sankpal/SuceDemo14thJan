package UtilityLayer;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseLayer.BaseClass;

public class HandleAlertClass extends BaseClass {
	public void accept()
	{
		new WebDriverWait(driver,Duration.ofSeconds(30)).until(ExpectedConditions.alertIsPresent()).accept();
	}
	
	public void dismiss()
	{
		new WebDriverWait(driver,Duration.ofSeconds(30)).until(ExpectedConditions.alertIsPresent()).dismiss();
	}
	
	public void sendKeys(String val)
	{
		new WebDriverWait(driver,Duration.ofSeconds(30)).until(ExpectedConditions.alertIsPresent()).sendKeys(val);
	}
	
	public String getText()
	{
		return new WebDriverWait(driver,Duration.ofSeconds(30)).until(ExpectedConditions.alertIsPresent()).getText();
	}
	
}
