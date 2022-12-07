package encodeAndDecode;

import org.apache.commons.codec.binary.Base64;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EncryptedPassword {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		
		driver.findElement(By.linkText("Log in")).click();
		
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("test@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(decodeString("dGVzdFBhc3MwMQ=="));
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();
		
	}
	
	

	 static String decodeString(String password)
	{
		byte[] decodedString=Base64.decodeBase64(password);
		
		return(new String(decodedString));
		
	}
	

}
