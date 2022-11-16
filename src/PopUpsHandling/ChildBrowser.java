package PopUpsHandling;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowser 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");	
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.flipkart.com/");
//-----------------------------------------------------------------------------------------------------
//get method
		driver.get("https://www.flipkart.com/");
		System.out.println("flipkard opened and login window is visible");
				
				  
// username
		WebElement username = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		username.sendKeys("Landgesomesh770@gmail.com");
		Thread.sleep(2000);
		System.out.println("username is entered");

// password
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("8668346008");
		Thread.sleep(2000);
		System.out.println("password is entered");
				 
// login
		WebElement login = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
		login.click();
		Thread.sleep(2000);
		System.out.println("clicked on login");
		
//click serach	
		WebElement search = driver.findElement(By.xpath("//input[@title='Search for products, brands and more']"));
		search.sendKeys("watches");
		System.out.println("clicked on search");
		Thread.sleep(2000);

// submit
		WebElement submit = driver.findElement(By.xpath("//button[@type='submit']"));
		submit.click();
		Thread.sleep(2000);
		System.out.println("clicked on submit");
		
// select product
		WebElement selectproduct = driver.findElement(By.xpath("(//img[@class='_2r_T1I'])[1]"));
		selectproduct.click();
		Thread.sleep(2000);
		System.out.println("click on watch");
		
		System.out.println("new popup window is opened");
//--------------------------------------------------------------------------------------
// child Browser pop-up
		// main window address
//		String mainpageaddress = driver.getWindowHandle();
//		System.out.println(mainpageaddress);
//----------------------------------------------------------------------------------		
		// main and child window adresses
		
//		Set<String> allpageAdreeses = driver.getWindowHandles();
//		System.out.println(allpageAdreeses);
		
		// output [CDwindow-0D9E25792860F7B4137FB0513A915543, CDwindow-290A470ACFA7E9B48340A039B37806AE]
		
// set concept does not follow the index concept
// so we cant judge which adress will of which webpage
// so we have to use List concept where index concept is followed 
		
		List<String> allpageAdreeses= new ArrayList<String>(driver.getWindowHandles());
		System.out.println(allpageAdreeses);
		
	    driver.switchTo().window(allpageAdreeses.get(1));
	    
	   
	    
// now selenium focus is on second window	    
	    Thread.sleep(2000);
	
//-----------------------------------------------------------------------------------
	// after that we can inspect pop-up window

 //add to card
	WebElement addTocard = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']"));
	addTocard.click();
	Thread.sleep(2000);
	System.out.println("click on add to card");
	
				
	
		
		
	}

}
