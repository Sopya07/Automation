package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	
	public static void main(String[] args) {
	
		
		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();

		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		WebElement source=driver.findElement(By.xpath("//a[normalize-space()='BANK']"));
		WebElement target=driver.findElement(By.xpath("//ol[@id='bank']//li[@class='placeholder']"));

		Actions act=new Actions(driver);
		
//		act.clickAndHold(source).moveToElement(target).release() .build().perform();
		act.dragAndDrop(source, target).build().perform();
	}
	

}
