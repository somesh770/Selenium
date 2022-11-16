package PopUpsHandling;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert01 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
		driver.get("https://demoqa.com/alerts");
			
//----------------------------------------------------------------------------------------------
			
		WebElement alertpage = driver.findElement(By.xpath("//button[@id='alertButton']"));	
		alertpage.click();
		System.out.println("clicked on -clickme-Click Button to see alert");
		System.out.println("alert popup is comes");
		
		// we cant inspect that popup
		// to inspect this popup we have switch selenium focus on that popup
		// for this we have switch method of Driver

//-------------//------- alt.accept()----------//------------------------------------
		Alert alt = driver.switchTo().alert();
		alt.accept();
		Thread.sleep(3000);
		System.out.println("clicked on ok button of popup1");
		

//-------------//------- alt.dismiss()----------//------------------------------------
		WebElement alertpage5sec = driver.findElement(By.xpath("//button[@id='timerAlertButton']"));	
		alertpage5sec.click();
		Thread.sleep(6000);
		Alert alt1 = driver.switchTo().alert();
		alt1.dismiss();
		System.out.println("clicked on ok button of popup2");
	
//		
		
//-------------//------- alt.dismiss()----------//------------------------------------
		WebElement alertconform = driver.findElement(By.xpath("//button[@id='confirmButton']"));	
		alertconform.click();
		Thread.sleep(6000);
		Alert alt3 = driver.switchTo().alert();
		alt3.dismiss();
		System.out.println("clicked on ok button of popup3");
		
//-------------//------- alt.dismiss()----------//------------------------------------
		
		WebElement alertgetText = driver.findElement(By.xpath("//button[@id='promtButton']"));	
		alertgetText.click();
	//	alertgetText.sendKeys("somesh");----> WE cant use this in eclips
		Thread.sleep(6000);
		Alert alt4 = driver.switchTo().alert();
		alt4.dismiss();
		System.out.println("clicked on ok button of popup4");	

			
			


	}

}
