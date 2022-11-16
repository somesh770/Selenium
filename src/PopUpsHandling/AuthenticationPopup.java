package PopUpsHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopup 
{

	public static void main(String[] args) throws InterruptedException 
	{
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");	
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://the-internet.herokuapp.com"); 
		Thread.sleep(2000);
//--------------------------------------------------------------------------------------------
		//Authentication pop up
	WebElement basicAuth = driver.findElement(By.xpath("//a[text()='Basic Auth']"));
	basicAuth.click();
	System.out.println("clicked on Basic Auth");
	Thread.sleep(2000);
	
	System.out.println("Auth pop up is opened");
//-------------------------------------------------------------------------------------------
	// now we have to username and password in URL as, username:password@
	 
	driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	

	

	}

}
