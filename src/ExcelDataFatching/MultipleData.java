package ExcelDataFatching;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class MultipleData 
{

	public static void main(String[] args) throws IOException 
	{
		String address = "C:\\Users\\admin\\Documents\\Excelprogram03.xlsx" ;
		
		FileInputStream file = new FileInputStream(address);
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		XSSFSheet sheet = workbook.getSheet("Sheet1");
//-----------------------------------------------------------------------------
		// use for loop
		// outer for loop ---> row
		// inner for loop ---> cell
		
	for (int i =0; i<3; i++)
	{
		for (int j=0; j<3; j++)
		{	 
			XSSFRow row = sheet.getRow(i);
			XSSFCell cell = row.getCell(j);
			double data = cell.getNumericCellValue();
			System.out.println(data);

		}			
	}

			
		
//------------------------------------------------------
	
	// to find last row number automatically
	// use getrow method of sheet
	
	int lastRowNum = sheet.getLastRowNum();
	System.out.println("last row number is "+ lastRowNum);
	
//----------------------------------------------------------------------
	
 // to find last cell number automatically
// getcell--> row
	
	//int lastCellNum = row.getLastCellNum();
	

	
	}

}
