package WebDriverCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCommands {

	public static void main(String[] args) {
		
		//Open  the Chrome browser
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //navigate to the URl
        driver.get("https://www.ebay.com/");  // opens the url
        System.out.println(driver.getTitle());  // returns the title of the page
        System.out.println(driver.getCurrentUrl());  //Returns the URL of the page

        String text=driver.findElement(By.xpath("/html[1]/body[1]/header[1]/div[1]/ul[2]/li[2]/a[1]")).getText();
	
        System.out.println(text);  //Print the text above in the xpath
//        driver.close();  //Closed the current browser
        driver.quit();    //Closed the multiple browser
	}

}
