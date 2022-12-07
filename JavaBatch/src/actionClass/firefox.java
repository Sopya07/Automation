package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firefox {

	public static void main(String[] args) throws InterruptedException {

		
//		package com.selenium.practice.locator;
//		import org.openqa.selenium.By;
//		import org.openqa.selenium.WebDriver;
//		import org.openqa.selenium.firefox.FirefoxDriver;
//		public class IdLocatorExample 
//		{
//		   public static void main(String[] args) throws InterruptedException 
//		   {
		      WebDriver driver;
		      System.setProperty("webdriver.gecko.driver","C:\\Drivers\\geckodriver-v0.32.0-win-aarch64\\geckodriver.exe");
		      driver=new FirefoxDriver();
		      driver.get("https://orangehrm-demo-6x.orangehrmlive.com/auth/login");
		      Thread.sleep(10000);
		      
		      driver.findElement(By.id("txtUsername")).clear();
		      driver.findElement(By.id("txtPassword")).clear();
		      driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		      driver.findElement(By.name("txtPassword")).sendKeys("admin");
		      driver.findElement(By.id("btnLogin")).click();
		   
		
	}

}
