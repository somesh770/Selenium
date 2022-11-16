package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceDemoLoginProgram 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", "C:\\driver folder\\chromedriver.exe");
	
 // upcating   
	WebDriver driver = new ChromeDriver();
	
// method
	
	driver.get("https://www.saucedemo.com/");
	
// maximize
	
	Thread.sleep(3000);
	
	driver.manage().window().maximize();
	
// username
	
	WebElement UsernameTextBox = driver.findElement(By.id("user-name"));
	
	UsernameTextBox.sendKeys("standard_user");  // value send method-sendkeys
	// same as x.method();
	
	Thread.sleep(3000);
	
// password 
	
	WebElement passwordTextBox = driver.findElement(By.id("password"));
	
	passwordTextBox.sendKeys("secret_sauce");
	
	Thread.sleep(3000);
	
// log in 
	
	WebElement LogInButton = driver.findElement(By.id("login-button"));
	
	LogInButton.click();
	
	System.out.println("End of the program");
	
	
	
}
}
