package xpathConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAttribute 
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
			
/////////////////////////////////// XPath by Attributes/////////////////////////////////////////////			
//username
//normal method 			
//			WebElement UsernameTextBox = driver.findElement(By.id("user-name"));
//			
//			UsernameTextBox.sendKeys("standard_user");  // value send method-sendkeys
//			// same as x.method();
//			
//			Thread.sleep(3000);
			
//by Xpath
			
			WebElement UserName = driver.findElement(By.xpath("//input[@id='user-name']"));
			UserName.sendKeys("standard_user");
			Thread.sleep(3000);
			
//password 
			WebElement Password = driver.findElement(By.xpath("//input[@data-test='password']"));
			Password.sendKeys("secret_sauce");
			Thread.sleep(3000);
//login
			WebElement Login = driver.findElement(By.xpath("//input[@id='login-button']"));
			Login.click();
			
		System.out.println("End of program");
		System.out.println("jay hind - jay maharashtra");


	}

}
