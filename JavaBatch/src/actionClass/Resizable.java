package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Resizable {

	public static void main(String[] args) throws InterruptedException {



		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();

		
		driver.get("https://jqueryui.com/resizable");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		
		WebElement resize=driver.findElement(By.xpath("//div[@class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']"));

		
		Actions act=new Actions(driver);
		act.moveToElement(resize).dragAndDropBy(resize, 700, 50).build().perform();
		Thread.sleep(3000);
	
	}

}
