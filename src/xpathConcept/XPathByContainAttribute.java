package xpathConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathByContainAttribute 
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
			
//////// Xpath by contains--- by Attribute
			
// username 
			
			WebElement username = driver.findElement((By.xpath("//input[contains(@id,'txtUsername')]")));
			username.sendKeys("Admin");
					
					
					
// password 
			WebElement password = driver.findElement(By.xpath("//input[contains(@id,'txtPassword')] "));
			password.sendKeys("admin123");
			        
			        
// login  
			WebElement login = driver.findElement(By.xpath("//input[contains(@id,'btnLogin')]"));
			login.click();
			
			System.out.println("End of program");
			
	}

}
