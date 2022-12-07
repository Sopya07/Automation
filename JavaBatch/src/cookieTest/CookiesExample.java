package cookieTest;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookiesExample {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in");

		Set<Cookie> cookies = driver.manage().getCookies(); // Capture all cookies from the browser

		System.out.println("Size of cookies" + cookies.size()); // Print size of cookies

		/*
		 * for (Cookie cookie : cookies) // read and print all the cookies
		 * 
		 * { System.out.println(cookie.getName() + " : " + cookie.getValue()); // Prints
		 * name and value of cookies }
		 * 
		 * System.out.println(driver.manage().getCookieNamed("session-id-time")); //
		 * Prints specific cookies acc
		 * 
		 */

		// Add new cookie to the browser

		Cookie cobj = new Cookie("mycookie123", "123456789");
		driver.manage().addCookie(cobj);

		cookies = driver.manage().getCookies();

		System.out.println("Size of cookies" + cookies.size()); // Print size of cookies

		for (Cookie cookie : cookies) // read and print all the cookies

		{
			System.out.println(cookie.getName() + " : " + cookie.getValue()); // Prints name and value of cookies
		}
		

		// Delete the cookie

		driver.manage().deleteCookie(cobj);

		cookies = driver.manage().getCookies();

		System.out.println("Size of cookies" + cookies.size()); // Print size of cookies

		for (Cookie cookie : cookies) // read and print all the cookies

		{
			System.out.println(cookie.getName() + " : " + cookie.getValue()); // Prints name and value of cookies
		}
		
		driver.manage().deleteAllCookies();
		cookies=driver.manage().getCookies();
		System.out.println("Size of cookies" + cookies.size()); // Print size of cookies

		driver.close();
	}

}
