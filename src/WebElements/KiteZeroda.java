package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

////////////////Xpath by Attribute on kite/////////////////////

public class KiteZeroda 
{

	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
//open browser 	
	WebDriver driver = new ChromeDriver();

// maximize window 
	driver.manage().window().maximize();
	
////open kite website 
	driver.get("https://kite.zerodha.com/");
	Thread.sleep(2000);
	
/// enter uername 
	WebElement username = driver.findElement(By.xpath("//input[@id='userid']"));
	username.sendKeys("FEU050");
	Thread.sleep(2000);
	
/// enter password
	WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
	password.sendKeys("8668346008");
	Thread.sleep(2000);
	
// login 
	WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
	login.click();
	Thread.sleep(2000);
	
// enter pin 
	WebElement pin = driver.findElement(By.xpath("//input[@id='pin']"));
	pin.sendKeys("866834");
	Thread.sleep(2000);
	
// click on continue 
	 WebElement Continue =  driver.findElement(By.xpath("//button[@class='button-orange wide']"));
	 Continue.click();
	 Thread.sleep(2000);
	 
// click on kite logo
	 WebElement kitelogo=  driver.findElement(By.xpath("//div[@class='header-right']"));
	 kitelogo.click();
	 Thread.sleep(2000);
	 
// click on order -------- by absolute x path
	 WebElement order =  driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[1]/a[2]/span"));
	 order.click();
	 Thread.sleep(2000); 
	 
// click on holding  ------- by absolute xpath
	 WebElement holdinds =  driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[1]/a[3]/span"));
	 holdinds.click();
	 Thread.sleep(2000); 
	
// click on search button
	 WebElement search = driver.findElement(By.xpath("//input[@icon='search']"));
	 search.sendKeys("GOLDTECH");
	 Thread.sleep(2000); 
	 
// click on profile	 
	 WebElement profile = driver.findElement(By.xpath("//div[@class='avatar']"));
	 profile.click();
	 Thread.sleep(2000); 

// check profile
//	 WebElement checkprofile = driver.findElement(By.xpath("//h4[@class='username']"));
//	 checkprofile.click();
//	 Thread.sleep(2000);

// funds
//		 WebElement clickfunds= driver.findElement(By.xpath("//a[@href='/funds']"));
//		 clickfunds.click();
//		 Thread.sleep(2000); 
//		 
// add fund
//		 WebElement addfunds= driver.findElement(By.xpath("//button[@class='button-green']"));
//		 addfunds.click();
//		 Thread.sleep(2000);
		 
// add fund amount	
//		 WebElement addfundamount= driver.findElement(By.xpath("//input[@id='addfunds_amount']"));
//		 addfundamount.sendKeys("10");                          
//		 Thread.sleep(2000);

// add upi	
//		 WebElement addupi= driver.findElement(By.xpath("//input[@id='addfunds_vpa']"));
//		 addupi.sendKeys("7709340557@upi");
//		 Thread.sleep(2000);
		 
// select payment mode
//		 WebElement selectupi= driver.findElement(By.xpath("//label[@for='pay_upi']"));
//		 selectupi.click();
//		 Thread.sleep(2000);
		 
// close payment window

	 
	 
// again click on profile	 
//		 WebElement againprofile = driver.findElement(By.xpath("//div[@class='avatar']"));
//		 againprofile.click();
//		 Thread.sleep(2000); 
		 
// log out
 WebElement logout = driver.findElement(By.xpath("//a[@target='_self']"));
 logout.click();
		 
		
		 System.out.println("End of program");	 
	 
	
	
	
	}

}

