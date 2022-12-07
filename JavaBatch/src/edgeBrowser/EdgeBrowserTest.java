package edgeBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowserTest {

	public static void main(String[] args) {


		System.setProperty("webdriver.edge.driver","C:\\Drivers\\edgedriver_win64\\msedgedriver.exe");
		
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("test@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("12345");
		driver.findElement(By.name("login")).click();

		String exp_title = "Log in to Facebook";
		String Act_title=driver.getTitle();
		
		System.out.println(Act_title);
		
		if(exp_title.equals(Act_title))
		{
			System.out.println("test passed");
		}
		else
		{
			System.out.println("test failed");
		}
		
	}

}
