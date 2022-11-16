package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException  
	{
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
//----------------------------------------------------------------------------------------------
	  driver.get("www.saucedemo.com/");
       
	  driver.manage().window().maximize();
////---------------------------------------------------------------------------------
	  WebElement uN =  driver.findElement(By.id("user-name"));
	  
	
	 driver.manage().deleteAllCookies();
	  
	    
	    
	    
	    
	 
	    
	   

      
      
     
     

	}

}
