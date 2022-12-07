package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
		
		driver.manage().window().maximize();
		
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		/*
		//1. Scrolling by using pixel
		js.executeScript("window.scrollBy(0,6000)", "");
		*/
		
		//2. Scrolling page till we find element
		/*
//		WebElement flag=driver.findElement(By.xpath("//img[@alt='Flag of India']"));
		WebElement flag=driver.findElement(By.xpath("//img[@alt='Flag of Liberia']"));
		js.executeScript("arguments[0].scrollIntoView()",flag);
		
		*/
		
		//3. Scroll page till bottom
		
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}

}
