package Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest {
  @Test
//  public void f() {
	  
		void demoTest() {
			
			Assert.assertTrue(true);
			Assert.assertEquals("Welcome", "welcome");
			Assert.assertEquals("selenium", "selenium");

			
		System.out.println("test Passed");
  }
}
