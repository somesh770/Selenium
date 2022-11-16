package xpathConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByText      /// orangeHRM  
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

// username Xpath
		WebElement username = 	driver.findElement(By.xpath("//span[text()='Username']"));
		username.sendKeys("Admin");
		Thread.sleep(3000);
		
// passwoed
		WebElement passward = driver.findElement(By.xpath("//span[text()='Password']"));
		passward.sendKeys("admin123");
		Thread.sleep(3000);
		
// login
	// xpath by attribute
		WebElement login = driver.findElement(By.xpath("//input[@value='LOGIN']"));
		login.click();
			
		
//////// show error
	}

}
