package xpathConcept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByContainByText 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		
		 // upcating   
			WebDriver driver = new ChromeDriver();
			
		// method
			
			driver.get("https://opensource-demo.orangehrmlive.com/");
			
		// maximize
			
			Thread.sleep(3000);
			
			driver.manage().window().maximize();	
			
//// syntax 
		// 

	}

}
