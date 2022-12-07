package headless;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HeadlessFirefox {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Drivers\\geckodriver-v0.32.0-win-aarch64\\geckodriver-v0.32.0-win-aarch64\\geckodriver.exe");

		FirefoxOptions options= new FirefoxOptions();
		options.setHeadless(true);          //headless browser
//		options.addArguments("--headless");    //headless browser
		WebDriver driver=new FirefoxDriver(options);
		
		driver.get("https://demo.nopcommerce.com/");
		
		System.out.println("Title of the page:"+ driver.getTitle());

	}

}
