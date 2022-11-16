package OpeningInDifferantBrower;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleCrome {

	public static void main(String[] args) 
	{
// setproperty
		
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");	

// upcasting
	
	WebDriver driver = new ChromeDriver();
	
// methods
	
	driver.get("https://www.selenium.dev/");
	}

}                                               
