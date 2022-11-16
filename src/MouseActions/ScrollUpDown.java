package MouseActions;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScrollUpDown 
{
//////////////////////////////////////Screenshot//////////////////////////	
       static WebDriver driver;

     public static void screenshot(String Sc) throws IOException 
   {
      TakesScreenshot Tss = (TakesScreenshot) driver;
      File source = Tss.getScreenshotAs(OutputType.FILE);
      File destination = new File ("C:\\Users\\admin\\Desktop\\Automation testing\\notes\\selenium\\sceenshots concept\\Scroll" + Sc + ".jpg");
      FileHandler.copy(source, destination);	
   }
	public static void main(String[] args) throws IOException, InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("Browser is opened");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		System.out.println("website is opened");
	    screenshot("Scroll-homepage");
		System.out.println("homepage Screenshot is taken");
		
		Thread.sleep(3000);
		
//////////////////////////////////////////////////////////////////////////////////
		////////Scroll Down (+)
		
		//1 upcasting of JavascriptExecutoe with WebDriver
		
		JavascriptExecutor JsE = (JavascriptExecutor) driver;
		
		//2 JavascriptExecutor method------executeScript and mention pixel (x,y)(0,5000)
		JsE.executeScript("window.scrollBy(0,4000)");
		
		//screenshot
		screenshot("down");
		System.out.println("Scroll down is done");
		
		Thread.sleep(3000);
		
	   /////// Scroll Up (-)
		
		JsE.executeScript("window.scrollBy(0,-1000)");
		screenshot("up");
		System.out.println("Scroll Up is done");
		
		
		System.out.println("End of program");

	}

}
