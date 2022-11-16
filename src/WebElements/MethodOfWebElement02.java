package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodOfWebElement02 
{
	public static void main(String[] args) 
	{
// set property
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
						
// upcating   
		WebDriver driver = new ChromeDriver();
		System.out.println("Browser is opened");
		
// maximize window
				driver.manage().window().maximize();				
// open website
		driver.get("https://www.saucedemo.com/");
		System.out.println("login page opened");
		

// username	
		
	//4. getAttribute() method
		
		WebElement username = driver.findElement(By.xpath("//input[@id='user-name']"));
		String AttributeValue = username.getAttribute("id");
		System.out.println(AttributeValue);
		
	// 5. getText() method
		
		String HTMLCODE = username.getText();
		System.out.println(HTMLCODE);
		// There is no text in username HTML code , so it didnt print any thing
		
  // 6.	 getTagName() method
		 String Tagname = username.getTagName();
		 System.out.println(Tagname);
		 

		
		
		
		
		

	}

}
