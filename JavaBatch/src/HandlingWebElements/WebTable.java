package HandlingWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://cosmocode.io/automation-practice-webtable");
	
		int r=driver.findElements(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/main[1]/article[1]/div[1]/div[1]/table[1]/tbody[1]/tr")).size();
		
		System.out.println(r);
		
		
		int c=driver.findElements(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/main[1]/article[1]/div[1]/div[1]/table[1]/tbody[1]/tr")).size();

		System.out.println(c);

		
		for(int i=2;i<=r;i++)
		{
			for(int j=1; j<=c;j++)
			{
				System.out.println(driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/main[1]/article[1]/div[1]/div[1]/table[1]/tbody[1]/tr["+i+"]/td["+j+"]")).getText()+"   ");
			}
			
			System.out.println();
		}
		
	}

}
