package FrameProgram;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frome02 
{

	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.manage().window().maximize();
//------------------------------------------------------------------------------------------------		
	driver.get("");
	System.out.println("URL is opened");
//--------------------------------------------------------------------------------------------
	}

}
