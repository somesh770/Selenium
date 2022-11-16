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

public class ScreenShot01 
{

	public static void main(String[] args) throws IOException 
	{
// set property	
				System.setProperty("webdriver.chrome.driver" , "C:\\chromedriver_win32\\chromedriver.exe");

// upcasting
				WebDriver driver = new ChromeDriver();
				System.out.println("browser is opened");
				
// maximize
				driver.manage().window().maximize();
				System.out.println("window is maximized");
				
// applay implicity wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
								
//get method
				driver.get("https://www.flipkart.com/");
				System.out.println("flipkard opened and login window is visible");
				
// take screenshot
				// casting (convert webdriver (driver) into TakeScreenshots)
				TakesScreenshot Tss = (TakesScreenshot)driver;
				
				// file source
				File source = Tss.getScreenshotAs(OutputType.FILE);
				
				// file destination
				 File destination = new File("C:\\Users\\admin\\Desktop\\Automation testing\\notes\\selenium\\sceenshots concept\\flipkard loginpage.pdf");
				 
				 //
				  FileHandler.copy(source, destination);
				  System.out.println("login page screenshot taken");
				  
// username
				 WebElement username = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
				 username.sendKeys("Landgesomesh770@gmail.com");
				 System.out.println("username is entered");
				 
				 //screenshot
				 TakesScreenshot tss = (TakesScreenshot)driver;
				 File source1 = tss.getScreenshotAs(OutputType.FILE);
				 File destination1 = new File("C:\\Users\\admin\\Desktop\\Automation testing\\notes\\selenium\\sceenshots concept\\username.jpg");
				 FileHandler.copy(source1, destination1);
				 System.out.println("username screenshot taken");
				 
				 
				

	}

}
