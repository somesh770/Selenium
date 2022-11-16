package Synchronization;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait 
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
					
// Explicit  wait for username
					
					WebDriverWait wait = new WebDriverWait(driver , Duration.ofMinutes(1));
					wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("somesh-landge"))));
					
					
					//explicit wait
					//only single element is giving the issue
					
					//time--for much time u need to apply the wait
					//condition --> for what u r applyinh the wait

	}
}
