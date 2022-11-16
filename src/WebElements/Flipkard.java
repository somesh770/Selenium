package WebElements;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Flipkard 
{
	static WebDriver driver ;
	
	public static void screenshot(String Fk) throws IOException
	{
		
		TakesScreenshot Tss = (TakesScreenshot)driver;
		File source = Tss.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\admin\\Desktop\\Automation testing\\notes\\selenium\\sceenshots concept\\Flipkard\\Fipkard"+
		Fk+ ".jpg");
	    FileHandler.copy(source, destination);
	}
	
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	

	public static void main(String[] args) throws IOException 
	{

		System.setProperty("webdriver.chrome.driver" , "C:\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
		System.out.println("browser is opened");
		
		driver.manage().window().maximize();
		System.out.println("window is maximized");
		
 	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

///////////////////////////////////////////////////////////////////////////////////////////////////////////////
//get method
		driver.get("https://www.flipkart.com/");
		screenshot(" login page ");
		System.out.println("flipkard opened and login window is visible");
		
		  
// username
		 WebElement username = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		 username.sendKeys("Landgesomesh770@gmail.com");
		 screenshot(" username ");
		 System.out.println("username is entered");

// password
		 WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		 password.sendKeys("8668346008");
		 screenshot(" password ");
		 System.out.println("password is entered");
		 
// login
		 WebElement login = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
		 login.click();
		 screenshot(" login ");
		 System.out.println("clicked on login");
		 
// clickonSerachbox
		 WebElement Searchbox = driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']"));
	
		 Searchbox.sendKeys("mobile");
		 screenshot("product is entered in search tab");
		 System.out.println("mobile product is searched");
		 
// click on search submit
		 WebElement SearchSubmit = driver.findElement(By.xpath("//button[@type='submit']"));
		 SearchSubmit.click();
		 screenshot("cliked on submit");
		 System.out.println("clicked on submitbutton");
		 
		 
		
	}

	
	}


