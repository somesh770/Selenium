package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBLogINProgram
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		
		 // upcating   
			WebDriver driver = new ChromeDriver();
			
		// method
			
			driver.get("https://www.facebook.com/");
			
			Thread.sleep(3000);
			
			driver.manage().window().maximize();
			
// username
			
			WebElement username = driver.findElement(By.id("email"));
			
			username.sendKeys("8668346008");
			Thread.sleep(3000);
			
// password
			
			WebElement password = driver.findElement(By.name("pass"));
			
			password.sendKeys("Somesh8668@");
			Thread.sleep(3000);
			
// click button
			
			WebElement LogIn = driver.findElement(By.name("login"));
			LogIn.click();
			
			System.out.println("end of program");
	}

}
