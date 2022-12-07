package selenium.webdriver.basictests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTest {

	public static void main(String[] args) {


		System.setProperty("webdriver.gecko.driver", "C:\\Drivers\\geckodriver-v0.32.0-win-aarch64\\geckodriver-v0.32.0-win-aarch64\\geckodriver.exe");

		WebDriver driver=new FirefoxDriver();
		driver.get("http://newtours.demoaut.com.cutestat.com/");
		
	}

}
