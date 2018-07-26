package pom.accenture.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	WebDriver Driver;
	@FindBy(linkText="Register")
	WebElement LinkReg;
	
	public void clickRegistration()
	{
		LinkReg.click();
	}
	public void HomePage(WebDriver driver)
	{
		this.Driver=driver;
	}
}
