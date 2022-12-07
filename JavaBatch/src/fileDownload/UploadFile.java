package fileDownload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class UploadFile {

	public static void main(String[] args) throws InterruptedException, FindFailed {
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.automationtesting.in/Register.html");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Swapnil");
		
//		driver.findElement(By.xpath("//input[@id='imagesrc']")).click();
		driver.findElement(By.id("imagesrc")).click();

		String imagesFilepath = "D:\\Selenium\\Sikuli\\";

		String inputFilepath = "D:\\Selenium\\Sikuli\\";

		Screen s = new Screen();

		Pattern fileInputTextbox = new Pattern(imagesFilepath + "sss.jpg");
		
		Pattern openButton = new Pattern(imagesFilepath + "open.png");


		Thread.sleep(5000);
		
		s.wait(fileInputTextbox, 20);
		
		s.type(fileInputTextbox,inputFilepath+"watch.jpg");
		
		s.click(openButton);
	
	}

}


