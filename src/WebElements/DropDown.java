package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown 
{

	public static void main(String[] args) throws InterruptedException 
	{
// set property
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
									
// upcating   
		WebDriver driver = new ChromeDriver();
		System.out.println("Browser is opened");
		
// maximize
		driver.manage().window().maximize();
		System.out.println("window is maximized");
		
// open website
		 driver.get("https://vctcpune.com/selenium/practice.html");
		 System.out.println("VCTC pune website is opened");
		 Thread.sleep(3000);
		 
///////////////////////////////DropDown////////////////////////////////////

		WebElement Dropdown =  driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		Dropdown.click();
		 
/// Selenium select class
		Select s = new Select(Dropdown);
		
 //a.	selectByIndex(pass the index number as int )
		
//		    s.selectByIndex(1);
//		    System.out.println("option 1 is selected by SelectBYIndex");
		    
// b.    selectByValue(“pass the value of value_Attribute”)
		
//		 s.selectByValue("option1");
//		 System.out.println("option 1 is selected by selectByValue");
		 
// c.	selectByVisibleText(“pass the HTML Text for that option”)
		 
		s.selectByVisibleText("Option1");
		System.out.println("option 1 is selected by selectByVisibleText ");
	}

}
