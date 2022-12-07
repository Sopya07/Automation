package autoIT;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class FileUpload {


	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException{
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.digisigner.com/free-electronic-signature/");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//div[@class='first__item-inner']")).click();

//		Runtime.getRuntime().exec("C://Users/rajwa/OneDrive/Documents/a.exe"); //execute exe file
		Runtime.getRuntime().exec("C:/Users/rajwa/OneDrive/Desktop/a.exe"); //execute exe file


		
		}
	
}
