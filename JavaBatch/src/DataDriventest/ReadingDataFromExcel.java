package DataDriventest;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//import org.apache.poi.xssf.usermodel.*;   // we can use * also so need need to import driver again


public class ReadingDataFromExcel {

	public static void main(String[] args) throws IOException  {

		FileInputStream file= new FileInputStream("D://Selenium//data//Data1.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
//			XSSFSheet sheet =workbook.getSheet("Sheet1");  //Providing sheet name
			 
		XSSFSheet sheet =workbook.getSheetAt(0);  //Providing sheet name
			
			
			int rowcount=sheet.getLastRowNum();  //Returns the row count
			
			int colcount=sheet.getRow(0).getLastCellNum();   //Returns the column/cell count
			
			for(int i=0;i<rowcount;i++) 
			{
				
				XSSFRow currentrow=sheet.getRow(i);   //focussed on current row
				
				for(int j=0;j<colcount;j++) 
				{
					
					String value= currentrow.getCell(j).toString();  //read the value from a cell
					System.out.print("  "  +value);
						
				
				}
				
				System.out.println();
				
			}
		}

	}

