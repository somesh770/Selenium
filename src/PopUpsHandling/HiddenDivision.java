package PopUpsHandling;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HiddenDivision
{

	public static void main(String[] args) throws InterruptedException, IOException 
	{
			
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");	
	
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.facebook.com/");
		
// create new account
		
		WebElement CreateAccount = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		CreateAccount.click();
		System.out.println("clicked on create new account");
		System.out.println("pop-up window is opened");
		
// first name
		WebElement firstname = driver.findElement(By.xpath("//input[@name='firstname']"));
		firstname.sendKeys("somesh");
		System.out.println("firstname entered");
		
// surname
		WebElement surname = driver.findElement(By.xpath("//input[@name='lastname']"));
		surname.sendKeys("landge");
		System.out.println("surnamename entered");
		
		
		
// mobile number
		WebElement monileno = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		monileno.sendKeys("8668346008");
		System.out.println("monileno entered");
		
		
//passward
		WebElement password = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		password.sendKeys("8668346008");
		System.out.println("password entered");
		
//date of birth
		// day
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		day.click();
	    Select a = new Select(day);
		a.selectByIndex(4);
		System.out.println("birt-day entered");
						
		// month
		WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		month.click();
	    Select b = new Select(month);
	    b.selectByVisibleText("Mar");
	    System.out.println("birt-month entered");
	    	    
	    //year
	    WebElement year = driver.findElement(By.xpath("//select[@name='birthday_year']"));
	    year.click();
	    Select c = new Select(year);
	    c.selectByVisibleText("1995");
	    System.out.println("birt-year entered");
	    	    
// select gender
	    WebElement malegender = driver.findElement(By.xpath("//label[text()='Male']"));
	    malegender.click();
	    System.out.println("gender is selected");
	    
// sing up
	    WebElement signup = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
	    signup.click();
	    System.out.println("sign up is done");
	    
	    System.out.println("End of Program");
	
	}

}
