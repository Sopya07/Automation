package selenium.webdriver.basictests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class test1 {

	public static void main(String[] args) {
		
		
		// Test Case1
		
		// 1) Open a browser.
		// 2) Open URL 
		// 3) Enter User name
		// 4) Enter Password
		// 5) Click on login button
		
		
		System.setProperty("webdriver.firefox.marionette", "C:\\Drivers\\geckodriver-v0.32.0-win-aarch64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); //Open the URL on browser
		
		driver.findElement(By.name("username")). sendKeys("admin");
		driver.findElement(By.name("password")). sendKeys("admin123");
		driver.findElement(By.name("login")). click();
		
		String exp_title="OrangeHRM";
		String act_title=driver.getTitle(); // returns title of page
		
		if(exp_title.equals(act_title)==true)
		{
			System.out.println("test is passed");
		}
		
		else
		{
			 System.out.println("Test is failed");
		}


	}

}
