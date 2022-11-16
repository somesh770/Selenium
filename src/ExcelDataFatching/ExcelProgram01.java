package ExcelDataFatching;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelProgram01 
{

	public static void main(String[] args) throws IOException 
	{
       String address = "C:\\Users\\admin\\Documents\\Exelprogram01.xlsx";
		
//above location-one file-open and read	
		FileInputStream file = new FileInputStream(address);  
		
//workbook read
		XSSFWorkbook workbook = new XSSFWorkbook(file);    
		
//sheet read
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
//row read
		XSSFRow row = sheet.getRow(0);
		
//cell read
		XSSFCell cell= row.getCell(0);
		
//get the cell value now
		
		String userName =cell.getStringCellValue();
		
		System.out.println(userName);  // output ---somesh
//------------------------------------------------------------------------------------- 
// we can use this data to any webelement
		
		//webELement username=driver.findele				
		//userName.sendKeys(userName);


		

	}

}
