package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodOfWebElement03 
{

	public static void main(String[] args) throws InterruptedException 
	{
// set property
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
								
// upcating   
	WebDriver driver = new ChromeDriver();
	System.out.println("Browser is opened");
	
// maximize
	driver.manage().window().maximize();
	
// open website
	 driver.get("https://vctcpune.com/selenium/practice.html");
	 System.out.println("VCTC pune website is opened");
	 Thread.sleep(3000);
	 
// 7. isDisplayed method
	 
	 // hide button
//	 WebElement hidebutton = driver.findElement(By.xpath("//input[@id='hide-textbox']"));
//	 hidebutton.click();
//	 System.out.println("clicked on hide button");
	 
// check text bot is displayed or not
//	 WebElement textbox = driver.findElement(By.xpath("//input[@id='displayed-text']"));
//	 boolean result1 = textbox.isDisplayed();
//	 System.out.println("after clicking on hide button textbox is visible-"+result1);
	 
	 //show button
//	 WebElement showbutton = driver.findElement(By.xpath("//input[@id='show-textbox']"));
//	 showbutton.click();
//	 System.out.println("clicked on show button");
	 
// check text bot is displayed or not
//	 WebElement textbox1 = driver.findElement(By.xpath("//input[@id='displayed-text']"));
//	 boolean result2= textbox1.isDisplayed();
//	 System.out.println("after clicking on show button textbox is visible-"+result2);
	 
// if condoition
	 
//	 if (result2==true)
//	 {
//		 textbox.sendKeys("SOMESH");
//		 System.out.println("test is entered");
//	 }
//	 else
//	 {
//		 showbutton.click();
//		 textbox.sendKeys("SOMESH");
//		 System.out.println("test is entered");
//	 }
	 
////////////////////////////////////////////////////////////////////////////////////////////	 
////////////////////////////8. isEnabled() method//////////////////////////
	 
//	 WebElement textbox = driver.findElement(By.xpath("//input[@id='displayed-text']"));
//	 boolean result = textbox.isEnabled();   // true
//	 System.out.println("textbox is enabled-"+result);
//	 
//	 if (result==true)
//	 {
//		 textbox.sendKeys("SOMESH");
//		 System.out.println("text is entered");
//		 
//	 }
//	 else
//	 {
//		 System.out.println("we cant enter the value in text box");
//	 }
	 
	 
///////////////////////////9. isSelected() method /////////////////////////////////////////
	 
// Radio button	 
	 WebElement radio1 = driver.findElement(By.xpath("//input[@value='Radio1']"));
	 
	 boolean result=radio1.isSelected();   //// false
	 
	 System.out.println("Radio 1 button is selected-"+result);  
	 
 //if condition
	 
	 if (result==true)
	 {
		 System.out.println("radio button is already selected"); 
	 }
	 else
	 {
		 radio1.click();
		 boolean result1 = radio1.isSelected();
		 System.out.println("radio 1 is selected-"+result1);
	 }
	 
	 

	}
}

