package selenium.webdriver.basictests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class test1chrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); //Open the URL on browser
		
		driver.manage().window().maximize();   // Maximize the browser window
//		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[2]/input[1]")).sendKeys("Admin");
//		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[2]/input[1]")).sendKeys("admin123");
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[3]/button[1]")).click();
		
		System.out.println("Title of the page:"+driver.getTitle());  //get title of the page
		
		
//		String exp_title="OrangeHRM";
//		String act_title=driver.getTitle(); // returns title of page
//		
//		if(exp_title.equals(act_title)==true)
//		{
//			System.out.println("test is passed");
//		}
//		
//		else
//		{
//			 System.out.println("Test is failed");
//		}


//		driver.close();  //Close the browser
	}

}
