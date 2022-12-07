package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseRightClick {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();

		
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		driver.manage().window().maximize();
		
		Actions act= new Actions(driver);
		
		WebElement button=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		
		act.contextClick(button).build().perform();   //Right click on the element 
		
		driver.findElement(By.xpath("//span[normalize-space()='Paste']")).click();    //click the paste option
		
		System.out.println(driver.switchTo().alert().getText());  //Capture text from alert box
		
		driver.switchTo().alert().accept();   //Closed the alert box
		
		
//		driver.close();
	}

}
