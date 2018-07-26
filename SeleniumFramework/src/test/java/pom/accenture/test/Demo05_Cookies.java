package pom.accenture.test;

import org.testng.annotations.Test;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Demo05_Cookies {
	WebDriver driver;
  @Test
  public void cookies() {
	  driver.manage().deleteAllCookies();
	  Cookie c = new Cookie("Test" ,"MyCookies");
	  driver.manage().addCookie(c);
	  Set<Cookie> myset = driver.manage().getCookies();
	  for(Cookie s : myset)
	  {
		  System.out.println(s.getName());
		  System.out.println(s.getPath());
		  System.out.println(s.getDomain());
	  }
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "resources\\chromedriver.exe");
	  driver =new ChromeDriver();
	  driver.get("http://demowebshop.tricentis.com");
  }

}
