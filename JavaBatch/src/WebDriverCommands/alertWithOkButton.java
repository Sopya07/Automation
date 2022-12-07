package WebDriverCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertWithOkButton {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
	
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		
		//alter with OK link
		driver.findElement(By.xpath("//a[normalize-space()='Alert with OK']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'click the button to display an')]")).click();
	
		
		//Switch to alert box
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();  //OK button click and close the alert
		
		
	}

}
