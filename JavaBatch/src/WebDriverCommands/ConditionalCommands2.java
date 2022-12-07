package WebDriverCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalCommands2 {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver= new ChromeDriver();
			driver.get("https://www.facebook.com/");
			
			driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[5]/a[1]")).click();

		
			System.out.println(driver.findElement(By.xpath("//input[@id='u_w_4_Q3']")).isSelected());
			
		
			System.out.println(driver.findElement(By.xpath("//input[@id='u_w_5_YI']")).isSelected());
			
			if(driver.findElement(By.xpath("//input[@id='u_w_4_Q3']")).isSelected()==false)
				
			{
				driver.findElement(By.xpath("//input[@id='u_w_4_Q3']")).click();
			
			}
							 		
		
	}

}
