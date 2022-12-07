package DataDriventest;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CalculatorTest {

	public static void main(String[] args) throws IOException {

		
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver_win32\\chromedriver.exe");


		WebDriver driver=new ChromeDriver();

				
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html?classic=true");

		driver.manage().window().maximize();
		
		FileInputStream file=new FileInputStream("D:\\Selenium\\data\\Calculator.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		
		
		int rowcount=sheet.getLastRowNum();
		
		for(int i=1;i<=rowcount;i++)
		{
			
			XSSFRow row=sheet.getRow(i);
			
			XSSFCell princeplecell=row.getCell(0);
			int princ=(int)princeplecell.getNumericCellValue();  //type casting
			
			
			// This and above 2 lines are same code, we can use anyone of them.
//			int princ=(int)row.getCell(0).getNumericCellValue();  //type casting
				
			
			XSSFCell roi=row.getCell(1);
			int rateofinterest=(int)roi.getNumericCellValue();
			
		
			XSSFCell period=row.getCell(2);
			int per=(int)period.getNumericCellValue();
			
			XSSFCell Frequency=row.getCell(3);
			String freq=Frequency.getStringCellValue();
			
			
			XSSFCell MaturityValue=row.getCell(4);
			double Exp_mvalue=(double) MaturityValue.getNumericCellValue();
			
//			driver.findElement(By.id("principal")).sendKeys(123456);
			
			driver.findElement(By.id("principal")).sendKeys(String.valueOf(princ));
			driver.findElement(By.id("interest")).sendKeys(String.valueOf(rateofinterest));
			driver.findElement(By.id("tenure")).sendKeys(String.valueOf(per));

			Select periodcombo=new Select (driver.findElement(By.id("tenurePeriod")));
			periodcombo.selectByVisibleText("day(s)");
			
			Select frequency=new Select (driver.findElement(By.id("frequency")));
			frequency.selectByVisibleText("Compounded Yearly");
			
			driver.findElement(By.xpath("/html[1]/body[1]/div[6]/div[2]/div[1]/div[5]/div[1]/div[1]/div[3]/form[1]/div[2]/a[1]/img[1]")).click();
			
			String actual_mvalue=driver.findElement((By.xpath("//span[@id='resp_matval']/strong"))).getText();

			
			if((Double.parseDouble(actual_mvalue))==Exp_mvalue)
				
			{
				System.out.println("Test Passed");
			}
			
			else
			{
				System.out.println("Test Failed");

			}
			
			// Clear all the values we are feeding.
//			driver.findElement(By.id("principal")).clear();
//			driver.findElement(By.id("interest")).clear();
//			driver.findElement(By.id("tenure")).clear();

			
			driver.findElement(By.xpath("//img[@class='PL5']")).click();

		}
		
	
	}

}
