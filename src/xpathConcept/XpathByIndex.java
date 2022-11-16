package xpathConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByIndex 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		
		 // upcating   
			WebDriver driver = new ChromeDriver();
			
		// method
			
			driver.get("https://www.saucedemo.com/");
			
		// maximize
			
			Thread.sleep(3000);
			
			driver.manage().window().maximize();
			
			Thread.sleep(3000);
			
// username 
			
		WebElement username = driver.findElement((By.xpath("(//input[@class='input_error form_input'])[1]")));
		username.sendKeys("standard_user");
		Thread.sleep(3000);						
								
								
// password 
		WebElement password = driver.findElement(By.xpath("(//input[@class='input_error form_input'])[2]"));
		password.sendKeys("secret_sauce");
		Thread.sleep(3000);				        
						        
// login  
		WebElement login = driver.findElement(By.xpath("//input[@class='submit-button btn_action']"));
		login.click();
						
		System.out.println("End of program");		

			

	}

}
