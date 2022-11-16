package WebTables;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable01 {

public static void main(String[] args) 
  {
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.manage().window().maximize();
//--------------------------------------------------------------------------------------
	driver.get("https://vctcpune.com/selenium/practice.html");
	System.out.println("URL is opened");
//------------------------------------------------------------------------------------
// single element
	
//	WebElement header1 = driver.findElement(By.xpath("//table//tbody//tr//th"));
//	String tableheading = header1.getText();
//	System.out.println(tableheading);   //output-->Instructor
	
// by this we got only single element , so to multiple element 
// we have to use findElements method
	
	List<WebElement> columnheading = driver.findElements(By.xpath("//table//tbody//tr//th"));
	
     // to find column size
	System.out.println("column size "+columnheading.size());
	
	for(int i=0; i<columnheading.size(); i++)
	{
		String result = columnheading.get(i).getText();
		System.out.println(result);
	}
	
// cell data
	
	List <WebElement> allCallData = driver.findElements(By.xpath("//table//tbody//td"));
	System.out.println("size of cells "+allCallData.size());
	
	for(int j=1; j<allCallData.size(); j++)
	{
		System.out.println(allCallData.get(j).getText());
	}
	


   }

}
