package HashMap;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HashMapLoginTest {

	static HashMap<String, String> logindata() {
		HashMap<String, String> hm = new HashMap<String, String>();

		hm.put("x", "mercury@mercury0");
		hm.put("y", "mercury@mercury1");
		hm.put("z", "mercury@mercury2");

		return hm;
	}

	public static void main(String[] args) {

//
//		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//
//		driver.get("https://demo.automationtesting.in/Register.html");
//	
		//Login as x
		
		String credentials= logindata().get("y");
		String arr[]= credentials.split("@");
		
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys(arr[0]);
	
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(arr[1]);

	}

}
