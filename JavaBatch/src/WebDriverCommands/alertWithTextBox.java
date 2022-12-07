package WebDriverCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertWithTextBox {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.automationtesting.in/Alerts.html");

		// alter with OK link
		driver.findElement(By.xpath("//a[normalize-space()='Alert with Textbox']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='click the button to demonstrate the prompt box']"))
				.click();

		// Switch to alert box
		System.out.println(driver.switchTo().alert().getText());

		driver.switchTo().alert().sendKeys("Swapnil Rajwadkar");

		driver.switchTo().alert().accept();

		String Text = driver.findElement(By.xpath("//p[@id='demo1']")).getText();

		System.out.println(Text);

	}

}
