package WebTables;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice01 
{

public static void main(String[] args) 
 {
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.manage().window().maximize();
//--------------------------------------------------------------------------------------
	driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
	System.out.println("URL is opened");
//-----------------------------------------------------------------------------------------
// table 1-->
	// column heading
	List<WebElement> columnheader = driver.findElements(By.xpath("(//table//tbody//tr//th)"));
	System.out.println("size of header "+ columnheader.size()); // 7
	int table1headersize = columnheader.size()-4;
	System.out.println("table 1 column header size "+table1headersize);
	
	// out of 7 1st 3 are for table 1
	
	for(int i=0; i<table1headersize; i++)
	{
	  System.out.println("Column heading"+columnheader.get(i).getText());	
	}
	
	// cell data
	List<WebElement> celldata = driver.findElements(By.xpath("//table//tbody//td"));
	System.out.println(celldata.size());  // 42  // out of this 1st  18 for table 1
	int table1callSize = celldata.size()-24;
	System.out.println("table 1 cell size "+table1callSize);
	
	
	for (int k=0; k<table1callSize; k++)
	{
		System.out.println(celldata.get(k).getText());
	}
	
	System.out.println("Table 2");
	System.out.println("----------");
	System.out.println("-----------");
	
 }

}

	
