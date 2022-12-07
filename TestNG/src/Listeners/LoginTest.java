package Listeners;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {

	
	@Test
	void LoginByEmail()
	{
		System.out.println("Login By email");
		Assert.assertEquals("Swapnil", "Swapnil");  //true
	}
	
	@Test
	void loginByFacebook()
	{
		System.out.println("Login By Facebook");
		Assert.assertEquals("Sopya", "Rajwadkar");  //False
		
	}
}

