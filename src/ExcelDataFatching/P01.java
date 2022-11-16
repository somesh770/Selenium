package ExcelDataFatching;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class P01 {

	public static void main(String[] args) throws IOException 
	{
		String path = "C:\\Users\\admin\\Documents\\Exelprogram01.xlsx";
		FileInputStream file = new FileInputStream(path);
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet= workbook.getSheet("Sheet1");
//--------------------------------------------------		
		XSSFRow row =sheet.getRow(1);
		XSSFCell cell = row.getCell(0);
		String FN= cell.getStringCellValue();		
		System.out.println(FN);
//--------------------------------------------------
		XSSFRow row1 =sheet.getRow(1);
		XSSFCell cell1 = row.getCell(1);
		String LN= cell1.getStringCellValue();		
		System.out.println(LN);
//---------------------------------------------
		XSSFRow rowDOB =sheet.getRow(1);
		XSSFCell cellDOB = row.getCell(6);
		Date DOB= cellDOB.getDateCellValue();		
		System.out.println(DOB);
//----------------------------------------------------------------		
		XSSFRow row3 =sheet.createRow(3);
		row3.createCell(0).setCellValue("Akshay");
		row3.createCell(1).setCellValue("GUle");
		row3.createCell(2).setCellValue("GUle@123gmail");
		row3.createCell(3).setCellValue("male");
		row3.createCell(4).setCellValue(1458);
		row3.createCell(5).setCellValue("osmanabad");
		row3.createCell(6).setCellValue(2/2/2022);
		
		FileOutputStream outputdata = new FileOutputStream("C:\\Users\\admin\\Documents\\Exelprogram01.xlsx");
		workbook.write(outputdata);
		workbook.close();
		
		System.out.println("data is enterd");
		
		

	}

}
