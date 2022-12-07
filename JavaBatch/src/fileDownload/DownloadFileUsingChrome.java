package fileDownload;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadFileUsingChrome {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/FileDownload.html");

		//Download Text file
		driver.findElement(By.id("textbox")).sendKeys("Swapnil Rajwadkar");

		// Generate text file
		driver.findElement(By.id("createTxt")).click();

		// Display download and click
		driver.findElement(By.id("link-to-download")).click();

		
//		Thread.sleep(5000);
		
		if(isFileExist("C://Users/rajwa/Downloads/info.txt"))
		
		{
			System.out.println("File exist");
		}
		else
		{
			System.out.println("File not exist");
		}
		
		//Download pdf file
		
		driver.findElement(By.id("pdfbox")).sendKeys("Swapnil Rajwadkar pdf");

		// Generate pdf file
		driver.findElement(By.id("createPdf")).click();

		// Display download and click
		driver.findElement(By.id("pdf-link-to-download")).click();

//		Thread.sleep(5000);

		if(isFileExist("C://Users/rajwa/Downloads/info.pdf"))
		
		{
			System.out.println("File exist");
		}
		else
		{
			System.out.println("File not exist");
		}
		
	}
	
	static boolean isFileExist(String path)
	{
		File f=new File(path);
		
		if(f.exists())
		{
			return true;
		}
		else
		{
			return false;
		}
	
	}
}
