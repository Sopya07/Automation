package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverPractice {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();

		
		driver.get("https://www.digiinterface.com");
		
		
		
		
		Actions act= new Actions(driver);
		
		WebElement admin=driver.findElement(By.xpath("//a[normalize-space()='WHAT WE DO ?']"));
		WebElement adminmg=driver.findElement(By.xpath("//li[@role='tab']//span[contains(text(),'Web Development')]"));
		WebElement mobileapp=driver.findElement(By.xpath("//li[@role='tab']//span[contains(text(),'Mobile Application')]"));

		

//		act.moveToElement(admin).build().perform();  //mouse over to what we do
//		act.moveToElement(adminmg).build().perform();   //mouse over to web development
//		act.moveToElement(mobileapp).click().build().perform();   //mouse over to mobile app and click

		// we can reduce the code by writing in one statement below:
		
		act.moveToElement(admin).moveToElement(adminmg).moveToElement(mobileapp).click().build().perform();
		
		
//		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
//		
//		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
//		
//		String s=driver.findElement(By.xpath("//p[normalize-space()='Username : Admin']")).getText();
		
//        System.out.println(driver.getTitle());  // returns the title of the page

		
//		System.out.println(s);
		
//		driver.close();
		
	}

}
