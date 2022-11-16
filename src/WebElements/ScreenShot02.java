package WebElements;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot02 
{
	// global vriable
	static WebDriver driver ;
	
	//method for screenshot
	
	public static void Screenshotmethod(String FB) throws IOException
	{
		 TakesScreenshot tss = (TakesScreenshot)driver;
		 File source1 = tss.getScreenshotAs(OutputType.FILE);
		 File destination1 = new File("C:\\Users\\admin\\Desktop\\Automation testing\\notes\\selenium\\sceenshots concept\\FB new ac\\fb"+FB+".jpg");
		 FileHandler.copy(source1, destination1);
		 System.out.println("username screenshot taken");
		 
	}

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		
// set property	
		System.setProperty("webdriver.chrome.driver" , "C:\\chromedriver_win32\\chromedriver.exe");

//upcasting
		driver = new ChromeDriver();
		System.out.println("browser is opened");
		
//maximize
		driver.manage().window().maximize();
		System.out.println("window is maximized");
		
//applay implicity wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
						
//get method
		driver.get("https://www.flipkart.com/");
		System.out.println("flipkard opened and login window is visible");
		
// username
		WebElement username = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		 username.sendKeys("Landgesomesh770@gmail.com");
		 Screenshotmethod("username");
		 System.out.println("username is entered");
		 
		 
		 WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		 password.sendKeys("xyz");
		 Screenshotmethod("password");
		 System.out.println("password is entered");
		 
		 
		 WebElement login = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
		 login.click();
		 Thread.sleep(2000);
		 Screenshotmethod("login");
		 System.out.println("clicked on login");
		 
		 
		 
		
		 
// 

		 
		

	}

}
