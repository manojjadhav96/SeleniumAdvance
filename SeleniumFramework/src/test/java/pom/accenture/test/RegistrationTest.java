package pom.accenture.test;

import org.testng.annotations.Test;

import pom.accenture.pages.HomePage;
import pom.accenture.pages.Registration;
import pom.accenture.utilities.ExcelUtilities;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;

public class RegistrationTest {
	WebDriver driver;
	HomePage h; //Decleration of obj
	Registration r;
	ExcelUtilities e;
  @Test
  public void TestRegistration() throws IOException {
	  h.clickRegistration();
	  e.getTestdata();
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "resources\\chromedriver.exe");
	  driver =new ChromeDriver();
	  driver.get("http://demowebshop.tricentis.com");
	  //
	  //pagefactory initialization
	  h = PageFactory.initElements(driver, HomePage.class);
	  r = PageFactory.initElements(driver, Registration.class);
	  e= new ExcelUtilities();
	  System.out.println("TestCase1 pass");
  }

}
