package selenium.webdriver.basictests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class firefoxDriver {

	public static void main(String[] args) {


		System.setProperty("webdriver.gecko.driver","C:\\Drivers\\geckodriver-v0.32.0-win-aarch64\\geckodriver-v0.32.0-win-aarch64\\geckodriver.exe" );  
        
        // Initialize Gecko Driver using Desired Capabilities Class  
  DesiredCapabilities capabilities = DesiredCapabilities.firefox();  
  capabilities.setCapability("marionette",true);  
  WebDriver driver= new FirefoxDriver(capabilities);  
        
       // Launch Website  
  driver.navigate().to("http://www.javatpoint.com/");  

	}
}



