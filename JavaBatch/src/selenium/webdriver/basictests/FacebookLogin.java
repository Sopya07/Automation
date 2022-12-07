package selenium.webdriver.basictests;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); //Open the URL on browser
		
		driver.manage().window().maximize();   // Maximize the browser window
//		driver.findElement(By.name("username")). sendKeys("Admin");
//		driver.findElement(By.name("password")). sendKeys("admin123");
//		driver.findElement(By.name("submit")). click();
		
		String exp_title="OrangeHRM";
		String act_title=driver.getTitle(); // returns title of page
		
		System.out.println(act_title);    //Print the title
		
		if(exp_title.equals(act_title)==true)
		{
			System.out.println("test is passed");
		}
		
		else
		{
			 System.out.println("Test is failed");
		}


//		driver.close();  //Close the browser
	}

	}


