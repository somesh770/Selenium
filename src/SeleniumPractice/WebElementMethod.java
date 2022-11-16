package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethod 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
//-----------------------------------------------------------------------------------------------
	    driver.get("https://vctcpune.com/selenium/practice.html");
	    Thread.sleep(1000);
	    
	    driver.manage().window().maximize();
//--------------------------------------------------------------------------
// isdisplayed
	    	    
// isEnabled
	    
//isSelected	    
	    
	    WebElement Radio1 = driver.findElement(By.xpath("//input[@value='Radio1']"));
	    boolean result1 = Radio1.isSelected();
	    System.out.println(result1);
	    
	    if (result1 == true)
	    {
	    	System.out.println("radio 1 is selected");
	    }
	    else
	    {
	    	Radio1.click();
	    	System.out.println("radio 1 is selected ");

	    }

	}

}
