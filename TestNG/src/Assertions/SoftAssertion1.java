package Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion1 {

	public static void main(String[] args) {
//@Test

		SoftAssert softAssert = new SoftAssert();
//		void demoTest() {
			softAssert.assertTrue(true);  //passed
			softAssert.assertEquals("welcome", "Welcome"); //false failed
			softAssert.assertEquals("welcom", "welcom"); //true passed
			
			System.out.print("Passed");
			
			softAssert.assertAll();

		}
	} 


