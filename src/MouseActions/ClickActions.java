package MouseActions;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class ClickActions 
{
	
//////////////////////////////////////Screenshot//////////////////////////	
	static WebDriver driver;
	
	public static void screenshot(String Sc) throws IOException 
	{
		TakesScreenshot Tss = (TakesScreenshot) driver;
		File source = Tss.getScreenshotAs(OutputType.FILE);
		File destination = new File ("C:\\Users\\admin\\Desktop\\Automation testing\\notes\\selenium\\sceenshots concept\\mouse Action" + Sc + ".jpg");
		FileHandler.copy(source, destination);	
		
	}
	
///////////////////////////////////////////4 line code /////////////////////////////
	
	public static void main(String[] args) throws IOException 
	{  
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("Browser is opened");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
////////////////////////////////////////////////////////////////////////////////////////
		
		driver.get("https://demoqa.com/buttons");
		System.out.println("website is opened");
	    screenshot("homepage");
		System.out.println("homepage Screenshot is taken");
		
////////////////////////////// mouse Action/////////////////////////////////////////////
		
		WebElement clickme = driver.findElement(By.xpath("//button[text()='Click Me']"));
		Actions act = new Actions (driver);
		act.click(clickme).perform();
		screenshot("clickme");
		System.out.println("Click on clickme");
		
		
		WebElement rightclick = driver.findElement(By.xpath("//button[text()='Right Click Me']"));
		act.contextClick(rightclick).perform();
		screenshot(" right click ");
		System.out.println("right click is done");
		
		WebElement doubleclick = driver.findElement(By.xpath("//button[text()='Double Click Me']"));
		act.doubleClick(doubleclick).perform();
		screenshot(" doubleclick ");
		System.out.println("double click is done");
										
		
							
	}

}
