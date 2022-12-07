package headless;

import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HeadlessHtmlUnitDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HtmlUnitDriver driver=new HtmlUnitDriver();
		driver.get("https://demo.nopcommerce.com");
		
		System.out.println("Title of the page:" +driver.getTitle());

		System.out.println("The current url of the page:" + driver.getCurrentUrl());
		
	
	}

}
