package brokenLinks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException, IOException {

		// Initiate Driver

		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Maximize page
		driver.manage().window().maximize();

		// Implicit wait for 10 secs
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Open URL of app
		driver.get("https://milonic.com");

		// wait
		Thread.sleep(5000);

		// capture links from a webpage
		List<WebElement> links = driver.findElements(By.tagName("a"));

		// Number of links
		System.out.println(links.size());

		for (int i = 0; i < links.size(); i++) {
			// By using href attribute we can get URL of required link

			WebElement element = links.get(i);
			String url=element.getAttribute("href");

			
			URL link = new URL(url);

			HttpURLConnection httpConn = (HttpURLConnection) link.openConnection();

			// wait time 2 seconds
			Thread.sleep(2000);

			// Establish connnection
			httpConn.connect();

			int rescode=httpConn.getResponseCode(); // return response. if res code is above 400: broken links

			if (rescode >= 400) {
				System.out.println(url + " - " + "Is broken link");

			} else {
				System.out.println(url + " - " + "Is valid link");

			}

		}
	}

}
