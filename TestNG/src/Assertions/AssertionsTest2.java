package Assertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AssertionsTest2 {

	public static void main(String[] args) throws InterruptedException {
//	public void loginTest()
		{

			System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();

			driver.get("https://demo.automationtesting.in/Register.html");

			WebElement firstnametxt = driver.findElement(By.xpath("//input[@placeholder='First Name']"));

			WebElement lastnametxt = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));

			// This is to check whether the textbox is displayed or not
			// Test will only continue, if the below statement is true

			Assert.assertTrue(firstnametxt.isDisplayed());
			firstnametxt.sendKeys("Swapnil");

			Assert.assertTrue(lastnametxt.isDisplayed());
			lastnametxt.sendKeys("Rajwadkar");

			/*
			  Assert.assertFalse(firstnametxt.isDisplayed());
			  firstnametxt.sendKeys("Swapnil");
			  
			  Assert.assertFalse(lastnametxt.isDisplayed()); lastnametxt.sendKeys("Sopya");
			 */

//		validation:

			String ExpTitle = "Register";
			Assert.assertEquals(ExpTitle, driver.getTitle());

		}
	}
}
