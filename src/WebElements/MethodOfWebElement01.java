package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodOfWebElement01 
{

	public static void main(String[] args) throws InterruptedException 
	{
// set property
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
				
// upcating   
		WebDriver driver = new ChromeDriver();
		System.out.println("Browser is opened");
		
// open website
		driver.get("https://opensource-demo.orangehrmlive.com/");
		System.out.println("log in page opened");
					
// method

// clear() and sendkeys("argument")	method
		/// username	
		WebElement username = driver.findElement(By.xpath("//input[@id='txtUsername']"));
		username.clear();
		System.out.println("Username textbox cleared");
		username.sendKeys("Admin");
		System.out.println("Username  entered");
		
		// password
		WebElement password= driver.findElement(By.xpath("//input[@id='txtPassword']"));
		password.clear();
		System.out.println("password texbox cleared");
		password.sendKeys("admin123");
		System.out.println("Password is entered");
		
		
/// 3. click()
		 // login
		WebElement login = driver.findElement(By.xpath("//input[@id='btnLogin']"));
		login.click();
		System.out.println("clicked on login and homepage is opened");
	
		
	

	}

}
