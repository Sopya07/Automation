package WebDriverCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertWithOkAndCancel {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.automationtesting.in/Alerts.html");

		// alter with OK link
		driver.findElement(By.xpath("//a[normalize-space()='Alert with OK & Cancel']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='click the button to display a confirm box']")).click();

		// Switch to alert box
		System.out.println(driver.switchTo().alert().getText());
//		driver.switchTo().alert().dismiss();
		driver.switchTo().alert().accept();

		System.out.println(driver.findElement(By.xpath("//p[@id='demo']")).getText());

		String ActText = driver.findElement(By.xpath("//p[@id='demo']")).getText();

		String ExpTextOk = "You pressed Ok";
		String ExpTextCancel = "You Pressed Cancel";

		if (ExpTextOk.equals(ActText) == true) {
			System.out.println("Test is passed=Pess OK");
		} else if (ExpTextCancel.equals(ActText) == true) {
			System.out.println("Test is passed=press cancel");

		} else {
			System.out.println("Test is failed");
		}
	}

}
