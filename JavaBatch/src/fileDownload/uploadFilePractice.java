package fileDownload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class uploadFilePractice {

	public static void main(String[] args) throws InterruptedException, FindFailed {
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

//		driver.get("https://testautomationpractice.blogspot.com");

		driver.get("https://www.digisigner.com/free-electronic-signature/");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//div[@class='first__item-inner']")).click();

	

		Screen s = new Screen();

		Pattern fileInputTextbox = new Pattern("D:\\Selenium\\Sikuli\\sss.jpg");

		Pattern openButton = new Pattern("D:\\Selenium\\Sikuli\\open.png");

		Thread.sleep(5000);

		s.wait(fileInputTextbox, 20);

		s.type(fileInputTextbox, "D:\\Selenium\\Sikuli\\watch.jpg");

		s.click(openButton);
	}

}
