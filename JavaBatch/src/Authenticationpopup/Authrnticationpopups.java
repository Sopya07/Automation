package Authenticationpopup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authrnticationpopups {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
//		driver.get("http://the-internet.herokuapp.com/basic_auth");
		
//		Syntax: (http://username:password@url");

		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		String test=driver.findElement(By.cssSelector("p")).getText();
		


		System.out.println(test);
		
//		driver.close();

	}

}
