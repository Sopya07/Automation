package JavascriptExecutor;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutorDemo {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

//		driver.get("https://www.digiinterface.com");
		driver.get("https://www.hirect.in");

		driver.manage().window().maximize();

		// Flashing

//		WebElement joinfree= driver.findElement(By.xpath("//a[normalize-space()='PAY ONLINE']"));
		WebElement joinfree = driver.findElement(By.xpath("//button[normalize-space()='Download App']"));

//		JavaScriptUtil.flash(joinfree,driver);

		// Drawing Border & ScreenShot
		/*
		 * JavaScriptUtil.drawBorder(joinfree, driver);
		 * 
		 * File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); File
		 * trg= new File("D://Selenium/aa.png"); FileUtils.copyFile(src,trg);
		 */

		// Capture title of the page

//		System.out.println(driver.getTitle());   normal method

		String title = JavaScriptUtil.getTitleByJS(driver);
		System.out.println(title);

		
		// Clicking on element

//		WebElement loginBtn = driver.findElement(By.xpath("//button[normalize-space()='Recruiter Login']"));

//		loginBtn.click();   we normally used this method

//		JavaScriptUtil.clickElementByJS(loginBtn, driver);

		
		
		//Generate Alert		
//		JavaScriptUtil.generateAlert(driver, "You clicked on login button");
		
		
		//Refreshing page
//		driver.navigate().refresh(); // we normally used this method

//		JavaScriptUtil.refreshBrowserByJS(driver);
		
		
		
		// Scroll down the page till we found element
		
//		WebElement text=driver.findElement(By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[@class='wrapper']/div[@class='testimonials']/div/div[@class='client-testimonial']/div[@class='container']/div[@class='row']/div[@class='col-md-12']/h3[1]"));
//		JavaScriptUtil.scrollIntoView(text, driver);
		
		
		
		//Scroll down page till end
		JavaScriptUtil.scrollPageDown(driver);
	}

}
