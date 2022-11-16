package SeleniumPractice;

import java.awt.Point;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverMethod {

	public static void main(String[] args) throws InterruptedException 
	{
		
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
//-----------------------------------------------------------------------------------------------
// 1. get method----> to open new url
    driver.get("https://www.facebook.com/");
    Thread.sleep(1000);
//----------------------------------------------------------------
// 2. 
    driver.navigate().to("https://www.facebook.com/");
    Thread.sleep(1000);

//------------------------------------------------------------------
// 3. 
    driver.navigate().back();
    Thread.sleep(1000);

//---------------------------------------------------------
// 4. 
    driver.navigate().forward();
    Thread.sleep(1000);

//----------------------------------------------------------
// 5 
    System.out.println(driver.getCurrentUrl());
//----------------------------------------------------------
// 6. 
    System.out.println(driver.getTitle());
//---------------------------------------------------------
// 7.
    driver.manage().window().maximize();
    Thread.sleep(1000);
//--------------------------------------------------------
// 8. 
    driver.manage().window().minimize();
    Thread.sleep(1000);
//--------------------------------------------------------
// 9.
    Dimension d = new Dimension(500,500);
    driver.manage().window().setSize(d);
//----------------------------------------------------------
// 10. 
    driver.navigate().refresh();
//--------------------------------------------------------
// 11. set position
    
//-----------------------------------------------------
// 12. 
    driver.close();
//-----------------------------------------------------
// 13. 
    driver.quit();
      
					
	}

}
