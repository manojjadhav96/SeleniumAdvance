package pom.accenture.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Registration {
	WebDriver Driver;
	@FindBy(id="gender-female")
	static
	WebElement ChkBox_Gender;
	@FindBy(id="FirstName")
	static
	WebElement TxtBox_FirstName;
	@FindBy(id="LastName")
	static
	WebElement TxtBox_LastName;
	@FindBy(id="Email")
	static
	WebElement TxtBox_EmailAddress;
	@FindBy(id="Password")
	static
	WebElement TxtBox_Password;
	@FindBy(id="ConfirmPassword")
	static
	WebElement TxtBox_ConfirmPassword;
	@FindBy(id="register-button")
	static
	WebElement btn_Register;
	public static void enterregistration(String F, String L, String E, String P, String CP)
	{
		ChkBox_Gender.click();
		TxtBox_FirstName.sendKeys(F);
		TxtBox_LastName.sendKeys(L);
		TxtBox_EmailAddress.sendKeys(E);
		TxtBox_Password.sendKeys(P);
		TxtBox_ConfirmPassword.sendKeys(CP);
		btn_Register.click();
		
	}
	
	public void Registration(WebDriver rdriver)
	{
		this.Driver=rdriver;
	}

}
