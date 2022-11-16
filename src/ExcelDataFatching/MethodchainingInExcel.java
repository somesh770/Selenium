package ExcelDataFatching;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class MethodchainingInExcel 
{

	public static void main(String[] args) throws IOException 
	{
		String address = "C:\\\\Users\\\\admin\\\\Documents\\\\ExcelProgram02.xlsx";
		
		FileInputStream file = new FileInputStream(address);
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
//----------------------------------------------------------------------
		
//    Method chaining
		
		// string value
		String result = workbook.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		System.out.println(result); /// output -->standard_user
		
		String result1 = workbook.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		System.out.println(result1); /// output -->somesh
		
		// numeric value
		double result3 = workbook.getSheet("Sheet1").getRow(2).getCell(0).getNumericCellValue();
		System.out.println(result3);  // output-->1234.0
		 
		
		
		
		
		
	

	}

}
