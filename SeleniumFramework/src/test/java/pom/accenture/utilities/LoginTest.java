package pom.accenture.utilities;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class LoginTest {
	@Test
	public void LoginValid() {
		String ER = "Test";
		String AR = "Test";
		Assert.assertEquals(ER, AR);
	}
	@Test
	public void LoginInvalied() {
		String ER = "Test12";
		String AR = "Test12";
		Assert.assertEquals(ER, AR);
	}
}
