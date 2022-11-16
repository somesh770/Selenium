package ExcelDataFatching;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelProgram02 
{

	public static void main(String[] args) throws IOException 
	{
		String address = "C:\\Users\\admin\\Documents\\ExcelProgram02.xlsx";
		
		FileInputStream file = new FileInputStream(address);
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
// usernamename		
		XSSFRow row=sheet.getRow(0);
		XSSFCell cell = row.getCell(0);
		String firstname = cell.getStringCellValue();
		System.out.println(firstname);      // output-->standard_user
		
// password
		XSSFRow row1=sheet.getRow(1);
		XSSFCell cell1 = row1.getCell(0);
		double data = cell1.getNumericCellValue();
		//String secondname = cell1.getStringCellValue();
		
		
		System.out.println(data);      // output-->secret_sauce
		

	}

}
