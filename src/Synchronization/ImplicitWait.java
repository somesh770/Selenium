package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		
// upcating   
			WebDriver driver = new ChromeDriver();
			System.out.println("browser is opened");
			
// method
			
			driver.get("https://www.saucedemo.com/");
			System.out.println("saucedemo login page is opened");
			
// maximiz
			driver.manage().window().maximize();
			System.out.println("window is maximized");
			
// implicit Wait
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
// username
			WebElement username = driver.findElement(By.xpath("//input[@id='user-name']"));
			username.sendKeys("standard_user");
			System.out.println("username is entered");
			
// password 
			WebElement password = driver.findElement(By.xpath("somesh-mahadev-landge"));
			password.sendKeys("secret_sauce");
			System.out.println("password is entered");
			
// login
			WebElement login = driver.findElement(By.xpath("//input[@id='login-button']"));
			login.click();
			System.out.println("successfully loged in and come to homepage");

	}

}
