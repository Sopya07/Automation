package DropDownTests;



import java.util.ArrayList;
import java.util.Collections;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.gargoylesoftware.htmlunit.javascript.host.file.FileList;

public class verifyDropdownSortedOptions {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver_win32\\New folder\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com");
		
		driver.manage().window().maximize();
		
		WebElement element=driver.findElement(By.id("animals"));
		
		Select se=new Select(element);
		
		ArrayList originalList=new ArrayList();
		
		List <WebElement>options=se.getOptions();
		
		for(WebElement e:options)
		{
			
			originalList.add(e.getText());
		}

		System.out.println(originalList);
		
		
		
		List tempList=new ArrayList();
		tempList=originalList;
		
		System.out.println("Before sorting temp list: " +tempList);
		Collections.sort(tempList);
		
		System.out.println("After sorting temp list: " +tempList);

	}

}
