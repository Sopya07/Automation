package WebDriverCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalCommands {

	public static void main(String[] args) {
		
		
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
		WebElement pass =driver.findElement(By.xpath("//input[@id='pass']"));
		
		if(email.isDisplayed() && email.isEnabled())
		{
			email.sendKeys("swapnil.gmail");
		}
		if(pass.isDisplayed() && pass.isEnabled())
		{
			pass.sendKeys("1234567");
		}
		driver.findElement(By.name("login")).click();
		driver.close();
//		driver.quit();

	}

}
