package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MouseHover {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();

		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
				
//		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).clear();

		driver.findElement(By.xpath("//input[@placeholder='Password']")).clear();

//		  driver.findElement(By.id("txtUsername")).clear();
//	      driver.findElement(By.id("txtPassword")).clear();
		
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");

		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
//		
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
//		
//		String s=driver.findElement(By.xpath("//p[normalize-space()='Username : Admin']")).getText();
		
//        System.out.println(driver.getTitle());  // returns the title of the page

		
//		System.out.println(s);
		
//		driver.close();
		
	}

}
